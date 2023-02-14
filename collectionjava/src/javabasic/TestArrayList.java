package javabasic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestArrayList {

	public static void main(String[] args) {

		// declare List interface ,which implement by ArrayList class
		List list = new ArrayList();
		//Set list = new HashSet();
		// HashSet list=new HashSet();
		// Add values
		list.add("habib");
		list.add("MUkit");
		list.add(500);
		list.add(500);
		// System.out.print(list);printout all collection object in one line, if i need
		// to separete
		// every object in the collection we have to use iterator method
		// print values by different ways : way 1 by Iterator
		// Iterator itr = list.iterator();///////////////////////////
		//
		// while(itr.hasNext()) {
		// System.out.println(itr.next());
		//
		// }

		// print values by different ways : way 2 by for loop

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));//*********
//		}
//		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list);//*********
		}

	}


	
}
