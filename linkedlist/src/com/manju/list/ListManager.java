package com.manju.list;

public class ListManager {
	
	public static void main(String[] args) {
		SinglyLinkedList<Integer> iList = new SinglyLinkedList<>();
		for (int i = 0; i < 10; i++) {
			iList.insert(i);
		}
		iList.print();
	}

}
