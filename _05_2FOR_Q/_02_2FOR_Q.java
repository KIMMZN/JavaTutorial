package _05_2FOR_Q;

public class _02_2FOR_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
			/*	3.
				000*
				00***
				0*****
				*******	*/
		//2 j 5
		
			for (int i =0; i<4; i++) {
				
				for(int j = 4-i -1; j>0; j--) {
					System.out.print("0");
				}
		
				for(int k=2*i+1; k >0 ; k--) {
					
					String ab = "*";
					System.out.print(ab);

				}
				
				System.out.println();			
			}	
			
	}
}
