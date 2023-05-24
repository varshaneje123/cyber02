package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist extends Object{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList ();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("123");
		System.out.println("size of list:" +list.size());
		
		System.out.println("Elements of list:"+list);
		System.out.println("List through forloop:");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println("List through foe eachloop:");
			for(Object fruit :list) {
				System.out.println(fruit);
			}
			System.out.println("size of list:" +list.size());
			
			System.out.println("Elements of list:"+list);
			System.out.println("size of list:" +list.size());
			
			System.out.println("List through for each();method:");
			list.forEach(a -> {
				
				System.out.println(a);
			});
				
				System.out.println("List through Iterator:");
				Iterator Itr=list.iterator();
				while(Itr.hasNext()) {
					System.out.println(Itr.next());}
					
					System.out.println(Itr.hasNext());}
				}
		
		
	
	}
