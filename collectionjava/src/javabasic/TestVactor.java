package javabasic;

import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestVactor {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		v.add("tt");
		v.add("pt");
		v.add("ct");

		java.util.Iterator<String> itr = v.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
