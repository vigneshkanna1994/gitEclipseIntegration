package com.alistTest2;

import java.util.ArrayList;

public class AlistTest2 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("kanna");
		a1.add(null);
		a1.add(new Employee(111, "vickyemp"));
		a1.add(new Student(123, "durga"));
		System.out.println(a1.toString());
		/*
		 * Arraylistarenot type safe we cant print for object data so following
		 * below type casting
		 */
		for (Object obj : a1) {
			System.out.println("obj is " + obj);
			if (obj instanceof Employee) {
				Employee e = (Employee) obj;
				System.out.println(e.eid + ", " + e.ename);
			}
			if (obj instanceof Student) {
				Student s = (Student) obj;
				System.out.println(s.sid + ", " + s.sname);

			}
			if (obj instanceof Integer) {
				System.out.println(obj);
			}
			if (obj instanceof String) {
				System.out.println(obj);
			}
			if (obj == null) {
				System.out.println(obj);
			}
		}
	}

}
