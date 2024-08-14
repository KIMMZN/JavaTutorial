package _04_Random_0814;

import java.util.Scanner;

public class _01_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
		
		Scanner in = new Scanner(System.in);
		
		int[] hJJ = new int[2];
		
		int sum = 0;
		
		for(int i =0; i < hJJ.length; i++) {
			System.out.println("입력하세요.");
			int k1 = in.nextInt();
			hJJ[i] = k1;
			
			sum += hJJ[i];
			
			//sum += hJJ[i];
			//System.out.println(sum);			
		}
		for (int i = 0; i < hJJ.length; i++) {
			if (i == hJJ.length - 1) { // 마지막 번호
				System.out.println("Sum : " + sum); 
				}
			
				
		}
		

		

	}
}


