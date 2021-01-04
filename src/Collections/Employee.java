package Collections;

public class Employee implements Comparable {

	
	String name;
	int eid;
	
	Employee(String name, int eid){
		this.name = name;
		this.eid = eid;
		
	}
	
	
	public String toString() {
		return name+"--"+eid;
	}
	

	@Override
	public int compareTo(Object o) {

		int eid1 = this.eid;
		System.out.println(eid1);
		Employee e = (Employee)o;
		int eid2= e.eid;
		System.out.println(eid2);
		System.out.println("-------------------");
		if(eid1<eid2)
		return -1;
		else if(eid1>eid2)
		return 1;
		else
		return 0;
		
	}
	
	
}
