package _05_2FOR_Qt;

public class _02_2FOR_Qt_Rt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	3.
			000*
			00***
			0*****
			*******	*/
			for(int i =0; i<4; i++) {
				//System.out.println("*");
				
				for(int j=0; j<4+i; j++) { // j 4 5 6 7
					//System.out.print("*");
					if(j >=(4-i-1) ) { 					  // j>= 4 - 0 - 1 = 3
						System.out.print("*");			  // j>= 4 - 1 - 1 = 2
					}else {								  // j>= 4 - 2 - 1 = 1
						System.out.print("0");                                
					}
				}
				System.out.println();
			}

	}

}
