package _03FOR;

public class AAAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] a = {30, 40, 50, 55, 65};
		 
		 int sum = 0;
		 int cnta = 0;
		 int minvalue = 10000;
		 
		 for(int i=0; i<5; i++) {
			 if(minvalue > a[i]) {
				 minvalue = a[i];
				 					 					 
					 sum += a[i];
					 cnta++;
														 
			 }
		 }
		  System.out.println((double)sum/cnta);
		 
		  
	}

}
