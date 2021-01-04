package CollectioninJava;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayListExample {

	public static void main(String[] args) {

		TreeSet<StringBuffer> al = new TreeSet<StringBuffer>();
//		TreeSet al = new TreeSet();
//		ArrayList al = new ArrayList();
		al.add(new StringBuffer("a"));
		al.add(new StringBuffer("z"));
		al.add(new StringBuffer("b"));
		al.add(new StringBuffer("c"));
		al.add(new StringBuffer("j"));
		System.out.println(al);

	}

}
