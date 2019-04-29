package com.collection.object;

public class ObjMain {

	public static void main(String[] args) throws Exception {
		AddingElement objAddingEleemnt = new AddingElement();
		objAddingEleemnt.add("a");
		objAddingEleemnt.add("b");
		objAddingEleemnt.add("c");
		objAddingEleemnt.add("d");
		System.out.println("capacity: " + objAddingEleemnt.capacity());
		objAddingEleemnt.add("e");
		System.out.println("size: " + objAddingEleemnt.size());
		System.out.println("Displaying value of 2nd index: " + objAddingEleemnt.get(2));
		objAddingEleemnt.replace(1, "A");
		objAddingEleemnt.remove(2);
		System.out.println("Displaying value of 2nd index: " + objAddingEleemnt.get(2));
		System.out.println("size: " + objAddingEleemnt.size());
		objAddingEleemnt.insert(1, "B");
		objAddingEleemnt.insert(4, "V");
		System.out.println("size: " + objAddingEleemnt.size());
		System.out.println("capacity: " + objAddingEleemnt.capacity());
		System.out.println("Displaying value of 2nd index: " + objAddingEleemnt.get(4));

	}

}
