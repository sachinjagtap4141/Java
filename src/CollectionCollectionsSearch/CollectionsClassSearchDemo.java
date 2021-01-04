package CollectionCollectionsSearch;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassSearchDemo {

	public static void main(String[] args) {
		
		
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");    
		l.add("a");

		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		
		System.out.println(Collections.binarySearch(l, "Z"));
		System.out.println(Collections.binarySearch(l, "J"));
		System.out.println(Collections.binarySearch(l, "j"));
		System.out.println(Collections.binarySearch(l, "n"));
		System.out.println(Collections.binarySearch(l, "L"));
		System.out.println(Collections.binarySearch(l, "N"));
		System.out.println(Collections.binarySearch(l, "O"));
	}	
	
	
}
