package com.aListConstructorTest5;

import java.util.ArrayList;

public class AlistConstructor {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		ArrayList al2 = new ArrayList(al);
		al.add(50);
		al2.add(100);
		al2.add(100);
		al2.add("100");
		al2.add('6');
		System.out.println(al2);
		System.out.println(al);

	}

}
