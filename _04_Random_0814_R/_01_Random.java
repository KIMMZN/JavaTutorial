package _04_Random_0814_R;

import java.util.Scanner;

public class _01_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
		
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 0; i < 2; i++) {
			System.out.println((i+1)+ ".숫자를 입력하세요.");
			int kn = in.nextInt();			
			sum += kn;
						
		}
		for(int i = 0; i < 2; i++) {			
			if (i == 2-1) { 
				System.out.println("합계: " + sum);
			}
		}
		
		

	}

}
