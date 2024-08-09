package _03FOR;

public class for_workc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num33 = 0;
		  int numtenth = 0;
		 for(int i=100; i <= 999; i++) {
			 
			 if (i%3 == 0) {
				 num33 = i;
				 numtenth = (i%100)/10;
				 
				 System.out.println(num33);
				 System.out.println(num33 +", "+ numtenth);
				 
			 } 
			 
		 }
		 

			//9번
		  	 int temp = 0;
		  	 int bint = 0;
		  	 
		     
			 for(int i=1; 1<20; ) {
				 
				 System.out.println(i);
				 temp = i;
				 i = bint +i;
				 bint=temp;
			 }
			 

	}

}
