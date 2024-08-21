package _Mini_Project_1;

import java.util.Random;
import java.util.Scanner;

public class _점심시간_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		
		String[] S = {"오이", "당근", "바보", "멍청이", "과자", "자바", "컴퓨터", "고양이"};
		System.out.println("게임 시작합니다.");		
		System.out.println("엔터를 입력하세요");
		in.nextLine();
		System.out.println("맞히면 +1점, 틀리면 -1점");
		System.out.println("--------------------");
		
		
		//중복 금지 어레이
		int array[] = new int[S.length];
		//포인트
		int point =0;
		for(int i=0; i<S.length; i++) {
			int rr = r.nextInt(S.length); //
			
			//in.nextLine();
			//중복 금지
			if(array[rr] != 1) {
				System.out.println(S[rr]);
				array[rr] = 1;
			}else {
				i--;
				continue;
			}
		
			String a =in.nextLine();			
			
			if (S[rr].equals(a)) {
				System.out.println("정답 입니다.");
				point += 1;
			}else {
				System.out.println("오답 입니다.");
				point -= 1;
			}
			System.out.println("포인트: " + point);
			System.out.println(" ");
		 
		}
		System.out.println("------------------");
		System.out.println("총포인트: " + point);
	
	}

}
