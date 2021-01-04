package CollectionWeakHashMap;

public class Temp {

	public String toString() {
		return "temp";
	}
	
	public void finalize() {
		System.out.println("finilize method called");
	}
}
