package CollectionCollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionClassSortDemo2 {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("Z");
		l.add("A");
		l.add("K");    
		l.add("L");
	
		System.out.println("Before Sorting : "+l);

		Collections.sort(l, new MyComparator());
	
		System.out.println("After Sort : "+l);
		
		
		
	}
	
}
