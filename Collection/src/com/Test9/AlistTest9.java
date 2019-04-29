package com.Test9;

import java.util.ArrayList;
import java.util.Collections;

public class AlistTest9 {

	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("kanna");
		al1.add("vicky");
		al1.add("mohan");
		al1.add("tset");
		al1.add("alagu");
		System.out.println("beore swapping \n"+al1);
		Collections.swap(al1, 1, 3);
		System.out.println("after swapping \n"+al1);
		
		ArrayList<String> al2=new ArrayList<String>(al1.subList(1, 3));
		System.out.println(al2);

	}

}
