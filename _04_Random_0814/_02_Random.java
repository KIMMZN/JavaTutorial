package _04_Random_0814;

import java.util.Random;

public class _02_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	/*	2. 행운의 숫자 인지를 판별해 보자
		   1부터 100까지 숫자 중 랜덤 수를 하나 뽑아서 출력한다.
		   이 숫자가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 조심해야하는 숫자 입니다. */
		 // 랜덤숫자. 필요
		
		 	Random r = new Random();
		 	
		 	
		 	boolean flag = false;
		 	
		 	int k = 0;
		 	for(int i =0; i< 1; i++) {
		 		k = r.nextInt(100)+1;
	 			 		
		 		//System.out.println(numbers[i]);
		 		
		 		if (k %7 == 0) {
		 			flag = true;
		 		}else {
		 			flag = false;
		 		}
		 			 		
		 		
		 	}
		 	 			 		
		 		System.out.println("1-100까지의 랜덤숫자 : " + k + ", 행운의 숫자 입니까? : "+ flag);
		 	
		


	}

}
