package _04_Random_0814_R;

import java.util.Random;

public class _02_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2. 행운의 숫자 인지를 판별해 보자
		//   1부터 100까지 숫자 중 랜덤 수를 하나 뽑아서 출력한다.
		//   이 숫자가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 조심해야하는 숫자 입니다.
		// 일단 랜덤객체 필요;
		
		Random R = new Random();
		
		for (int i = 0; i<1; i++) {
			
			int Num = R.nextInt(100)+1;
			
			if (Num%7==0) {
				System.out.println(Num + ", 행운의 숫자 입니다.");
			}else {
				 System.out.println(Num + ", 조심해야되는 숫자 입니다.");
			}
						
		}

	}

}
