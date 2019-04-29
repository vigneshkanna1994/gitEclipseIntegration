package com.alistConstTest6;

import java.util.ArrayList;

public class AlistTset6 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		ArrayList a2 = new ArrayList(a1);
		a2.add(100);
		System.out.println(a1);
		System.out.println(a2);
		ArrayList<String> b1 = new ArrayList<String>();
		b1.add("b1");
		ArrayList<String> b2 = new ArrayList<String>();
		b2.add("b2");
		ArrayList<String> b11 = new ArrayList<String>();
		b11.add("b11");
		ArrayList<String> b22 = new ArrayList<String>();
		b22.add("b22");
		b11.addAll(b22);
		b11.addAll(b11);
		b11.addAll(b1);
		b11.addAll(b2);
		System.out.println(b11);
	}

}
