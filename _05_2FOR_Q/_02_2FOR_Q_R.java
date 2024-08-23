package _05_2FOR_Q;

public class _02_2FOR_Q_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*	3.
			000*
			00***
			0*****
			*******	*/
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<4+i; j++) {
				//System.out.print("j");
				if(j>=4-i-1) { // 
					System.out.print("*");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
		//j >= 4 - i -1
		//0 >= 4 - 0 -1 // 0>= 3
       // 0 >= 4 - 1 -1 = 2		

	}

}
