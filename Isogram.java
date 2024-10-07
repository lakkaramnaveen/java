package com.java;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
	public static void main(String[] args) {
		System.out.println(isIsogram("cdd"));
	}
	
	static boolean isIsogram(String s) {
		boolean b = true;
		char[] c = s.toCharArray();
		Set<Character> s1 = new HashSet<Character>();
		for(Character c1 : c ) {
			if(s1.contains(c1)) {
				b = false;
			} else {
				s1.add(c1);
			}
		}
		return b;
	}
}
