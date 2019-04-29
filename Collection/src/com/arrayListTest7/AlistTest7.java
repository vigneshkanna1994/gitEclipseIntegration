package com.arrayListTest7;

import java.util.ArrayList;

public class AlistTest7 {

	public static void main(String[] args) {
		Employ e1 = new Employ(111, "vicky");
		Employ e2 = new Employ(112, "kanna");
		Employ e3 = new Employ(113, "vignesh");
		Employ e4 = new Employ(114, "kannav");
		ArrayList<Employ> a1 = new ArrayList<Employ>();
		a1.add(e1);
		a1.add(e2);

		ArrayList<Employ> a2 = new ArrayList<Employ>();
		a2.addAll(a1);
		a2.add(e3);
		a2.add(e4);
		 for(Employ objem:a2){
			 System.out.println(objem.eid + " " + objem.ename);
		 }
		 System.out.println(a2.contains(e2));
		 System.out.println(a2.containsAll(a1)); a2.remove(e2);
		 for(Employ objem:a2){
			 System.out.println(objem.eid + " " + objem.ename);
		 }
		 System.out.println(a2.contains(e2));
		 System.out.println(a2.containsAll(a1));// bacos of removede2,a2
		 //didnot have all values of a1
		 
		
		a2.removeAll(a1);//all a1 data removed
		
		a2.retainAll(a1);
		
		for (Employ objem : a2) {
			System.out.println(objem.eid + " " + objem.ename);
		}
	}

}
