package _08_Array2_2nd_Day_0911;

public class _00_Qb1_0913 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//33은 33 + 3 +3 = 39
		//39는 39  + 3 +9 =51
		// 하나씩 가져오자
		int num = 33;
		//
		int num1 = 3485;				
		
		//(num/10) + (num%10) + (num) // 백의 자리num1/100
		//num/1000 천의자리 
		//System.out.println(num1/100);
		//
	    
		int sum =0;
	    for(int i =1; i<5000; i++) {
	    	
	    	for(int j=1; j<5000; j++) {
	    		
	    		if((i/1000)+(i/100)+ (i/10) + (i%10) + (i) == j) {
	    			//System.out.println(j+"의 생성자는"+i);
	    			
	    		}
	    		
	    	
	    	}
	    	 
	    	
			
	    }
	    
		
	}

}
