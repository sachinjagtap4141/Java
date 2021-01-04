package CollectioninJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String args[]) {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("Rajendra");
		set.add("Raja");
		set.add("Ravi");
		set.add("Technolamror");
		
		System.out.println(set);
		System.out.println("************");
		for(String s:set) {
			System.out.println(s);
		}
		
		System.out.println("************");
		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*
		
		//my practice
		HashSet<Book> set=new HashSet<Book>();
		//Creating Books
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Java Program Questation","Rajendra","Technolamror",4);
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		//Adding Books to list
		set.add(b1);
		set.add(b2);
		set.add(b3);
		

		//method1
		System.out.println("Original content of list is: ");
		//Traversing list
		for(Book b:set){
		System.out.println(b.id+"	 "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
		//method2
		
		Iterator<Book> itr = set.iterator();
		while(itr.hasNext()) {

		Book k = itr.next();

		System.out.println(k.id+" "+k.name+" "+k.author+" "+k.publisher+"	"+k.quantity);
		}
		
		
		*/
	
		
		
	}
}
