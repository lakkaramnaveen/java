package com.java;
import  java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	class Node{
		int data;
		Node right;
		Node left;
		Node(int dataInp){
			data = dataInp;
			left = null;
			right = null;
		}
	}
	
	public Node root;
	BinaryTree(int rootData){
		root = new Node(rootData);
	}
	
	void insert(int dataInp) {
		Node newNode = new Node(dataInp);
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.remove();
			if(temp.left == null) {
				temp.left  = newNode;
				return;
			}
			else if(temp.right == null){
				temp.right = newNode;
				return;
			}
			else {
				q.add(temp.left);
				q.add(temp.right);
				
			}
		}
		
		
	}
	
	void inorder(Node temp) {
		if(temp == null) return;
		inorder(temp.left);
		System.out.print(temp.data+", ");
		inorder(temp.right);
	}
	
	void preorder(Node temp) {
		if(temp == null) return;
		System.out.print(temp.data+", ");
		preorder(temp.left);
		preorder(temp.right);
	}
	
	void postorder(Node temp) {
		if(temp == null) return;
		postorder(temp.left);
		postorder(temp.right);
		System.out.print(temp.data+", ");	
	}
	
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(5);
		tree.insert(12);
		tree.insert(23);
		tree.insert(21);
		tree.insert(4);
		
		tree.inorder(tree.root);
		System.out.println(" : is the inorder traversal");
	}
}
