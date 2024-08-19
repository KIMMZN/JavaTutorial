package _05_2FOR_Qt;

public class _03_2FOR_Qt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
								
							/*	4. 
								*******
								0*****
								00***
								000*               */
		
		                    for(int i =0; i<4; i++) {
		                    	//System.out.println(i);
		                    	for(int j =i; j>0; j--) {
		                    		System.out.print("0");
		                    	}
		                    	for(int k=7-i; k>i; k--) { // 패턴을보고 계산하면 됨 .
		                    		  /*  7-i=7    k >0 == 7	k--
		                    		      7-i(1)=6    k >1 ==5
		                    		      7-i(2)=5	k> 2 ==3
		                    		      7-i(3)=4  k> 3 == 1     */
		                    		System.out.print("*");		                    		
		                    	}	                    		
		                    	System.out.println();	                    	
		                    }

	}

}
