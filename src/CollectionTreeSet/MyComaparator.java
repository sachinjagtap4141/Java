package CollectionTreeSet;

import java.util.Comparator;

public class MyComaparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

		Integer I1 = (Integer)o1;
		Integer I2 = (Integer)o2;
//		return I1.compareTo(I2);	//ascending order
//		return -I1.compareTo(I2);	//descending order
//		return I2.compareTo(I1);	//descending order
//		return -I2.compareTo(I1);	//ascending order
//		return +1;	//insertion order
//		return -1;	//Reverse of insertion order
//		return 0;
		
		//another way
		if(I1<I2) {
			return +1;
		}else if(I1>I2) {
			return -1;
		}else 
			return 0 ;
		
		
	}

}
