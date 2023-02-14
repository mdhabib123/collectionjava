package javabasic;

import java.util.HashSet;
import java.util.LinkedHashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		

			HashSet<Integer> hs=new HashSet<Integer>();
			
			hs.add(657);
			hs.add(563224);
			
		
			java.util.Iterator<Integer> itr=hs.iterator();
			
			while(itr.hasNext()) {
				//System.out.println(itr.next());
				
			}
    //System.out.println();
		}

	
}


