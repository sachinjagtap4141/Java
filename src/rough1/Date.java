package rough1;

public class Date {

	
	
	
	public static void main(String[] args) {
		
		String date = "22-9-2023";
		String dateArray [] = date.split("-");
		int [] val = new int[dateArray.length];	
		for(int i =0;i<dateArray.length;i++) {
			 val[i] = Integer.parseInt(dateArray[i]);
			 System.out.println(val[i]);
		}
		int dateval = val[0];
		int monthval = val[1];
 		int yearval = val[2];
 		
 		String currentdate = "30-2-2020";
 		String dateArray1 [] = currentdate.split("-");
 		for(int i =0;i<dateArray1.length;i++) {
			 val[i] = Integer.parseInt(dateArray1[i]);
			 System.out.println(val[i]);
		}
 		
 		int currentdateval = val[0];
		int currentmonthval = val[1];
 		int currentyearval = val[2];
 		
 		if(yearval-currentyearval==1) {
 			int done = (12-currentmonthval)+monthval;
 			System.out.println("check this :"+done);
 		}else if(yearval-currentyearval>=1) {
 			int donedone = (((yearval-currentyearval)-1)*12)+((12-currentmonthval)+monthval);
 			System.out.println("check this :"+donedone);
 		}

	
	
	
	
	}
	
	
	
	
	
	
}
