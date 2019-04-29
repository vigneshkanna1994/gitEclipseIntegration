package com.arrayListTest1;

import java.util.ArrayList;

public class alistTest1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(10.5);
		al.add('a');
		al.add(null);
		al.add(10);
		al.add(10);
		al.add("testkanna");
		System.out.println("all al values: " + al);
		System.out.println("all al values: " + al.toString());

	}

}
