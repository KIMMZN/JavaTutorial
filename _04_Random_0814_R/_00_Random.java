package _04_Random_0814_R;

import java.util.Scanner;

public class _00_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		
							Scanner in = new Scanner(System.in);
							
							for (int i = 0; i < 1; i++) {
								System.out.println("숫자를 입력하세요.");
								int Result = in.nextInt(); // 키보드로 숫자.
								
								
								if (Result%2==0) {
									System.out.println("짝수입니다.");	
								}else {
									System.out.println("홀수입니다.");
								}
								
								
							}
	}

}
