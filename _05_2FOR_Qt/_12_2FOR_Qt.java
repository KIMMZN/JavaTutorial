package _05_2FOR_Qt;

public class _12_2FOR_Qt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
/*			11.
			000*               - 0
			00***              - 1
			0*****             - 2
			*******            - 3
			0*****1 1          - 4
			00***12 2
			000*123 3
			
			12. 11번 문제에서 for문 2개만 사용하기 if문은 갯 수 상관없음. */
		
			for(int i =0; i<7; i++) {
				//System.out.println("*");
				
			for(int j=0; j<4+i; j++) { // j 4 5 6 7
					//System.out.print("*");
					
				 if ( i<4){						
					
					if(j >=(4-i-1)) { 					  // j>= 4 - 0 - 1 = 3
						System.out.print("*");
						
					}else {								  // j>= 4 - 2 - 1 = 1
						System.out.print("0");						
					}
				 }
				
				 else {
					 j= 5-i;
					 System.out.print("*");
				/*	if( j> i-4 ) {
						
							System.out.print("*");								// j>= 4 - 1 - 1 = 2
					}else {
						System.out.print("0");
					} */
			           								// j>= 4 - 1 - 1 = 2					
				 }
				} 
				System.out.println();
			}

	}

}
