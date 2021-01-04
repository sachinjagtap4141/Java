package CollectionTreeMap;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		

		TreeMap m = new TreeMap();
		m.put(100, "ZZZ");
		m.put(103, "YYY");
		m.put(101, "XXX");
		m.put(104, 106);
//		m.put("FFFF", "XXX");//CCE
//		m.put(null, "ZZZ");//NPE
		System.out.println(m);
	}
	
	
}
