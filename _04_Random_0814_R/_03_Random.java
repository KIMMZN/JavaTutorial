package _04_Random_0814_R;

import java.util.Random;

public class _03_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3. 2번 업그레이드, 랜덤 수를 하나 뽑아서 출력한다
		//  7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑는다.
		  
		Random R = new Random();
		
		for (int i = 0; i<1; i++) {
			
			int Num = R.nextInt(100)+1;
			
			if (Num%7==0) {
				System.out.println(Num + ", 행운의 숫자 입니다.");
				
			}else {				
					i= i-1;					
				//System.out.println(Num + ", 조심해야되는 숫자 입니다.");
			}
						
		}
		  
		  

	}

}
