package _05_2FOR_Q;

public class _03_2FOR_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
				/*  4. 
		 0 0개		*******   *7개
		 0 1개		0*****    *5개
		 0 2개		00***     *3개
		 0 3개		000*      *1개              */
		
		int row = 4;
		
		for(int i=0; i<row; i++) {
			//System.out.println(i);
			
			for(int k = (row +i)-4; k>0; k--) {
				       System.out.print("0");				       
			}
			
			for(int j=7-(i*2); j >0 ; j--) {
				 	
				 	System.out.print("*");
				
				   /* 7 - 0*2 = 7	
				      7 - 1*2 = 5
				      7 - 2 *2 = 3
				      7 - 3 *2 = 1 */			
			}
			
			System.out.println();
		
		}
		

	}
}
