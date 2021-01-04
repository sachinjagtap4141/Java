package CollectioninJava;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExampleNotInPdf {
	public static void main(String[] args) {

		SortedSet<Integer> s= new TreeSet<Integer>();
		s.add(72);
		s.add(10);
		s.add(23);
		s.add(68);
		s.add(90);
		System.out.println(s);
		System.out.println("********");
//		Iterator<Integer> itr = s.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(68));
		System.out.println(s.tailSet(68));
		//SubSet()
		
		 
//		Comparator<? super Integer> c = s.comparator();
//		System.out.println(c);
	}

}
