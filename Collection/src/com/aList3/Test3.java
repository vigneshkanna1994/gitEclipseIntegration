package com.aList3;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		// arrays are type safe
		int[] a = { 10, 20, 30 };
		System.out.println(a);
		for (int aa : a) {
			System.out.println(aa);
		}

		// Collections are not type sagfe
		ArrayList al = new ArrayList();
		al.add(new Empl(10, "vicky"));
		al.add(new Student(05, "Durga"));
		for (Object obj : al) {
			if (obj instanceof Empl) {
				Empl e = (Empl) obj;
				System.out.println(e.eid + " " + e.ename);

			}
			if (obj instanceof Student) {
				Student s = (Student) obj;
				System.out.println(s.sid + " " + s.sname);
			}
		}
		al.get(0);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		Object objj = al.get(0);
		if (objj instanceof Empl) {
			Empl e = (Empl) objj;
			System.out.println(e.eid + " " + e.ename);

		}
		if (objj instanceof Student) {
			Student s = (Student) objj;
			System.out.println(s.sid + " " + s.sname);
		}

		// To over come above pblms or Provide the safety to the collections
		// using generic
		ArrayList<Empl> alistgen = new ArrayList<Empl>();
		alistgen.add(new Empl(111, "DurgaEmp"));
		alistgen.add(new Empl(123, "vickyEmp"));
		for (Empl egen : alistgen) {
			System.out.println("gnerics value Empl: " + egen.eid + " " + egen.ename);
		}
		Empl egen2 = alistgen.get(0);
		System.out.println(egen2);
		System.out.println("gnerics value Empl: " + egen2.eid + " " + egen2.ename);

		ArrayList<Student> alistgen2 = new ArrayList<Student>();
		alistgen2.add(new Student(111, "DurgaStudent"));
		alistgen2.add(new Student(111, "vickyStudent"));
		for (Student sgen : alistgen2) {
			System.out.println("gnerics value Student: " + sgen.sid + " " + sgen.sname);
		}
		Student sgen2 = alistgen2.get(1);
		System.out.println(sgen2);
		System.out.println(sgen2.sid + " " + sgen2.sname);
		Student sgen3 = alistgen2.get(0);
		System.out.println(sgen3.sid + " " + sgen3.sname);
	}

}
