package javabasic;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestLinkedList {

	public static void main(String[] args) {
	
		LinkedList<String>  list=new LinkedList<String>();
		list.add("habiba");
		list.add("sha");
		
		//java.util.Iterator<String> itr=list.iterator();
		
	//	while(itr.hasNext()) {
			//System.out.println(itr.next());
		for(int i =0;i<list.size();i++)
			System.out.println(list);
		}


	}


	


