package com.java;

public class Que {
	
	
	class Node{
		String item;
		Node behind;
	}
	
	public Node head = null;
	public Node tail = null;
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void enque(String str) {
		if(head == null) {
			head = new Node();
			head.item = str;
			tail = head;
			return;
		}
		tail.behind = new Node();
		tail.behind.item = str;
		tail = tail.behind;
	}
	
	
	
	public String deq() {
		if(isEmpty()){
			return null;
		}else {
			String returnValue = head.item;
			head = head.behind;
			return returnValue;
		}
		
	}
	
	public static void main(String[] args) {
		Que que = new Que();
		que.enque("String A");
		que.enque("String B");
		que.enque("String C");
		System.out.println(que.isEmpty());
		System.out.println(que.deq());
	}
}
