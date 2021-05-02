package com.srm.javatrainingex;

import java.util.Collections;
import java.util.LinkedList;

public class SortLinkedlist {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Berry");
		list.add("Dates");
		list.add("CustardApple");
		System.out.println("The Original linked list:\n"+list);
		Collections.sort(list);
		System.out.println("The Sorted linked list:\n"+list);
	}

}
