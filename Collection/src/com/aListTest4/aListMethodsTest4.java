package com.aListTest4;

import java.util.ArrayList;

public class aListMethodsTest4 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(null);
		al.add("vicky");
		al.add(101.5);
		al.add(12);
		System.out.println(al);
		System.out.println(al.size());
		al.add(2, "Vickykanna");
		System.out.println(al);
		al.remove(1);// int value by default index
		al.remove("Vickykanna");
		System.out.println(al);
		al.remove("test");
		System.out.println(al);
		al.add("Durga");
		al.add(3, "durga");
		System.out.println(al);
		al.set(2, "kanna");
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.isEmpty());
		al.remove(10);

	}

}
