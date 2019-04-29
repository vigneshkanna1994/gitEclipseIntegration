package com.Test8;

import java.util.ArrayList;
import java.util.Arrays;

public class AlistTest8 {

	public static void main(String[] args) {
		// Conversion of arrays to collections
		String[] a = { "vvv", "sss", "ddd" };
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(a));
		a1.add("durga");
		System.out.println(a1);
		for (String v : a1) {
			System.out.println(v);
		}

		// Conversion of genrics Collections to Arrays
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("test");
		a2.add("durga");

		String[] strArray = new String[a2.size()];
		a2.toArray(strArray);
		for (String objs : strArray) {
			System.out.println(objs);
		}
		// Conversion of normal collections to arrays
		ArrayList a3 = new ArrayList();
		a3.add(10);
		a3.add("vickykanna");
		a3.toArray();
		for (Object objs : a3) {
			System.out.println(objs);
		}

		
	}

}
