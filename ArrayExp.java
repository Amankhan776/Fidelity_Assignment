package com.Assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayExp {
	

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.add("Banana");
		a.add("Apple");
		a.add("Orange");
		a.add("Grapes");
		a.add("Guava");
		a.add("Pineapple");
		
		a.add("Delhi");
		a.add("Bnglr");
		
		a.add("Cricket");
		a.add("Singing");
		
		System.out.println(a);
		System.out.println("-------------------------------------------------------");
		
		a.remove("Cricket");
		System.out.println("After removing one hobby "+a);
		System.out.println("-------------------------------------------------------");
		
		
		if (a.contains("Cricket")) {
			System.out.println("Cricket found");		
		}
		else {
			System.out.println("Cricket Not Found");
		}
		System.out.println("-------------------------------------------------------");
		
		a.remove("Delhi");
		a.remove("Apple");
		System.out.println("After removing 1 city and 1 fruit"+a);
		System.out.println("-------------------------------------------------------");
		
		if(a.size() >= 6) {
			System.out.println("4th & 6th Element"+a.get(3)+"  "+a.get(5));
		}
		System.out.println("-------------------------------------------------------");
		
		
		int index = a.indexOf("Singing");
		if(index != -1) {
			a.set(index, "Dancing");
		}
		System.out.println("After replacing hobby "+a);
		System.out.println("-------------------------------------------------------");
		
		
		Collections.reverse(a);
		System.out.println("Reversed list "+a);
		System.out.println("-------------------------------------------------------");
		
		a.add(3, "kerala");
		
		a.add(1, "mango");
		
		System.out.println("After adding Kerala & Mango "+a);
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Length of arraylist "+a.size());
		System.out.println("-------------------------------------------------------");
		
		a.clear();
		System.out.println("After removing all elements : "+a);
		
		
		
	}

}
