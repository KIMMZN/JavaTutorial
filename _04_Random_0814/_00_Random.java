package _04_Random_0814;

import java.util.Scanner;

public class _00_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		
		Scanner in = new Scanner(System.in);
		int[] hJJ = new int[1];
		
	
		for (int i=0; i< hJJ.length; i++) {
			System.out.println("입력하세요");
			int k1 = in.nextInt();	//nextint는 키보드로 숫자만.
			//in.nextInt(); 		// 버퍼 지우기			
			//hJJ[i] = k1;
			
			int result = k1;
			
			if(result%2 == 0) {
				System.out.println("짝수입니다");
			}else {
				System.out.println("홀수입니다.");
			}
												
		}
		
		
		

	}

}
