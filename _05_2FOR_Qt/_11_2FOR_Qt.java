package _05_2FOR_Qt;

public class _11_2FOR_Qt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
				/*	11.
					000*
					00***
					0*****
					*******
					0*****
					00***
					000*            */
					
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
			
			 for(int i =0; i<3; i++) {
             	//System.out.println(i);
             	for(int j =i; j>=0; j--) {
             		System.out.print("0");
             	}
             	for(int k=i; k<6-i-1; k++) {
             		System.out.print("*");   //531
             	}
                                		
             	System.out.println();	                    	
             }
			

	}

}
