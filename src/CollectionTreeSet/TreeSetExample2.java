package CollectionTreeSet;

import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
//		TreeSet t= new TreeSet(new MyComparator2());
//
//		t.add(new StringBuffer("a"));
//		t.add(new StringBuffer("z"));
//		t.add(new StringBuffer("b"));
//		t.add(new StringBuffer("c"));
//		t.add(new StringBuffer("j"));
//		System.out.println(t);
		

		TreeSet<StringBuffer> al = new TreeSet<StringBuffer>(new MyComparator2());
		al.add(new StringBuffer("a"));
		al.add(new StringBuffer("z"));
		al.add(new StringBuffer("b"));
		al.add(new StringBuffer("c"));
		al.add(new StringBuffer("j"));
		System.out.println(al);

		
		
		
	}
}
