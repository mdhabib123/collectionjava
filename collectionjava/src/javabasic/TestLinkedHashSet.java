package javabasic;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class TestLinkedHashSet {

	public static void main(String[] args) {

		//Set lhs = new LinkedHashSet();
  LinkedHashSet lhs =new LinkedHashSet();
		lhs.add(657);
		lhs.add(563224);
		lhs.add("habib");
		lhs.add(34.78899);

		Iterator itr = lhs.iterator();
       
		while (itr.hasNext()) {
			System.out.println(itr.next());
 
		}

		// what is collection? collection is framework can store different group of
		// object. collection contains
		// some calssand interface.

	}

}
