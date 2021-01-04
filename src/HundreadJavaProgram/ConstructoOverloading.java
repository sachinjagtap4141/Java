package HundreadJavaProgram;

public class ConstructoOverloading {

	String name;

	ConstructoOverloading() {
		System.out.println("Constructor method called.");
	}

	ConstructoOverloading(String t) {
		name = t;
	}

	public static void main(String[] args) {
		ConstructoOverloading cpp = new ConstructoOverloading();
		System.out.println("1 "+cpp.name);
				
		ConstructoOverloading java = new ConstructoOverloading("Java");
		System.out.println("2 "+java.name);
//		ConstructoOverloading cp = new ConstructoOverloading();
//		System.out.println(cp.name);
		System.out.println("2 "+cpp.name);
		cpp.setName("C++");
		System.out.println("3 "+cpp.name);
//		System.out.println(cp.name);
		java.setName("Kava");
		System.out.println("4 "+java.name);
		
		ConstructoOverloading cp = new ConstructoOverloading();
		ConstructoOverloading c = new ConstructoOverloading("sachin");
		java.getName();
		cpp.getName();
		java.getName();
		System.out.println(cp.getClass());
		cp.getName();
		c.getName();
		
		c.setName("Naveen");
		c.getName();
		c.getName();
	}

	void setName(String t) {
		name = t;
	}

	void getName() {
		System.out.println("Language name: " + name);
	}

}



