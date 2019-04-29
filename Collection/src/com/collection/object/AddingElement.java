package com.collection.object;

public class AddingElement {
	Object[] objArray = new Object[5];
	int elementCount = 0;

	public void add(Object obj) {
		if (elementCount == objArray.length) {
			Object[] objtest = increaseCapacity();
			objArray = objtest;
		}
		objArray[elementCount] = obj;
		System.out.println(objArray[elementCount] + " is the value");
		System.out.println("------------------------------------------");
		elementCount++;

	}

	public Object[] increaseCapacity() {
		System.out.println("inside increase");
		Object[] newObjArray = new Object[objArray.length * 2];
		System.out.println(newObjArray.length);
		for (int j = 0; j < objArray.length; j++) {
			newObjArray[j] = objArray[j];
		}
		objArray = newObjArray;
		return objArray;
	}

	public int capacity() {
		return objArray.length;

	}

	public int size() {
		return elementCount;

	}

	public Object get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Index is not matched");
		}
		return objArray[index];

	}

	public void replace(int index, Object value) throws Exception {
		if (index < 0 || index >= elementCount) {
			throw new Exception("exceptiooon");
		}
		objArray[index] = value;
	}

	public void remove(int index) throws Exception {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		while (index < size() - 1) {
			objArray[index] = objArray[index + 1];
			index++;
		}
		elementCount--;
	}

	public void insert(int index, Object value) throws Exception {
		if (index < 0 || index >= size()) {
			throw new Exception();
		}
		if (size() == capacity()) {
			increaseCapacity();
		}
		for (int i = size() - 1; index <= i; i--) {
			objArray[i + 1] = objArray[i];
		}
		objArray[index] = value;
		elementCount++;

	}

}
