package _05_2FOR_Qt;

public class _02_2FOR_Qt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
				/*	3.
					000*
					00***
					0*****
					*******   	*/
		
					for(int i=0; i<4; i++) {
						//System.out.println(i);
						for(int j=3; j>i; j--) {
							System.out.print("0");
						}
						for(int k=1+i*2; k>0; k--) { //휴... 위에서부터 몇개씩 늘어나는지 그 패턴을 확인하고 식을 구하면 된다.;
							/*  k 1+0*2 =1    k>0;     k--
							    k 1+1*2 =3    k>0;
							    k 1+2*2 =5    k>0;
							    k 1+3*2 =7    k>0;       */
							System.out.print("*");
							    
									
						}
							//
						System.out.println();
					}
		
		

	}

}
