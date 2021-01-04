package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("chiranjeevi", 700);
		m.put("blaiah", 800);
		m.put("venkatesh", 200);
		m.put("nagarjuna", 500);
	
	System.out.println(m);
	System.out.println(m.put("chiranjeevi", 1000));
//	System.out.println(m);
	//get only keys
	Set s = m.keySet();
	System.out.println(s);

	
	Collection c = m.values();
	System.out.println(c);
	
	
	Set s1 = m.entrySet();
	System.out.println(m);
	
	Iterator itr = s1.iterator();
	
	while(itr.hasNext()) {
		Map.Entry me= (Map.Entry)itr.next();
		System.out.println(me.getKey()+"------"+me.getValue());
		if(me.getKey().equals("chiranjeevi")) {
			me.setValue(10000);
		}
		
	}
	System.out.println(m);
	
	
	
	}
	
	
	
	
	
}
