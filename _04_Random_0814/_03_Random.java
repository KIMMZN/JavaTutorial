package _04_Random_0814;

import java.util.Random;

public class _03_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	/*    3. 2번 업그레이드, 랜덤 수를 하나 뽑아서 출력한다
		  7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑는다. */
	
			 	Random r = new Random();
				
			 	boolean flag = false;
			 	
			 	int k = 0;
			 	for(int i =0; i<1; i++) {
			 		k = r.nextInt(100)+1;
		 			 		
			 		//System.out.println(numbers[i]);
			 		
			 		if (k %7 == 0) {
			 			flag = true;
			 			break;
			 		}else {
			 			flag = false;
			 			i--;
			 		}
			 			 		
			 		
			 	}
			 	 			 		
			 		System.out.println("1-100까지의 랜덤숫자 : " + k + ", 행운의 숫자 입니까? : "+ flag);
			 		
			 		
			 		
			 	
	}

}
