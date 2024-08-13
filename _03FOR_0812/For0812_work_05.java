package _03FOR_0812;

public class For0812_work_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


				 /* 6
					String a ="23-56+45*2-56";
					수식을 계산하는 프로그램을 작성하세요.
					수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.
					지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다.
					메서드는 최대한 적게 사용하세요 */
					// - 23
		
		// 56 +
		
		
		
		           String a ="23-56+45*2-56";
		           String a1 = "";
		           
		           int sum=0;
		           
		           for(int i =0; i<a.length(); i++) {
		        	   char rahc = a.charAt(i);
		        	   
		        	   if (rahc != '-') {
		        		   a1 += rahc;
		        	   }
		        	   else {
		        		   int minusInt = Integer.valueOf(a1);
		        		   sum = minusInt;
		        		   a1 = "";
		        		   
		        	   }
		        	   
		        	   if (rahc != '+') {
		        		   a1 += rahc;
		        	   }
		        	   else {
		        		   int minusInt = Integer.valueOf(a1);
		        		   sum = minusInt;
		        		   a1 = "";
		        		   
		        	   }
		        	   
		        	   
		        	   
		           }
		           
		           System.out.println(sum);
		           
		           
		           
		           
		          
		          
		           //int aint = Integer.parseInt(a);
		         
	
				
								
	 


	}

}
