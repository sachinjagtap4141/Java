package CollectioninJava;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {

		// my practice
		List<String> l = new LinkedList<String>();
		l.add("Rajendra");
		l.add("Mahendra");
		l.add("Raja");
		l.add("Prem");

		// using iterator
		// Iterator<String> itr = l.iterator();
		//
		// while (itr.hasNext()) {
		// System.out.println(itr.next());
		// }

		// using ListIterator
		ListIterator<String> litr = l.listIterator();
		while (litr.hasNext()) {

			String s= litr.next();
			System.out.println(s);
		}

		
		
		
		
		// pdf
		// LinkedList<String> al=new LinkedList<String>();
		// al.add("Rajendra");//Adding object in LinkedList
		// al.add("Mahendra");
		// al.add("Raja");
		// al.add("Technolamror");
		//
		//
		// Iterator<String> itr=al.iterator();
		// while(itr.hasNext()){
		// System.out.println(itr.next());
		// }

	}
}
