package _05_2FOR_Q;

public class _01_2FOR_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					
				/*	2. 
					*****
					****
					***
					**
					*           */
		
			for(int i =0; i<5; i++) {
				//System.out.println("*");
				for(int j=4; j>=i; j--) {	//for (int j=0; j<=4-i; i++)
					System.out.print("*");
				}
				System.out.println();
			}
			
			//수식:단서는 i값 ㅡ> 4-i ;
			// i =0;     j=4
			// i = 1     j=3
			// i = 2     j=2
			// i =3		 j=1
			// i= 4      j=0

	}

}
