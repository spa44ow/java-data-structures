package dataStructures;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dictionary dict = new Hashtable<>();
		
		for(int i =0; i<20; i++) {
			
			dict.put(i, i*10);
		}
		System.out.println(dict);
		Enumeration elems = dict.elements();
		
		while(elems.hasMoreElements()) {
			System.out.println(elems.nextElement());
		}
		
		dict.put(10, 999);
		
		System.out.println(dict.get(10));
		
	}

}
