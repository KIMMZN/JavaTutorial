package _Mini_Project_1;

import java.util.Random;
import java.util.Scanner;

public class _점심시간_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		
		String[] S = {"쓰레기통", "스타크래프트", "김밥천국", "멍청이", "아메리카노", "휴먼교육센터", "컴퓨터", "고양이","음바페","크레파스"}; //난이도 하 , 기본 배열//
		String[] SS = {"나랏말싸미듕귁에달아", "도널드트럼프", "맑은눈의광인", "킬리만자로산", "단팥맛통찐빵", "공간감각무감각", "게살샥스핀", "최참판댁","간장공장공장장","앗살라무알라이쿰"}; //난이도 상, 어려움
		String[] temp = {"쓰레기통", "스타크래프트", "김밥천국", "멍청이", "아메리카노", "휴먼교육센터", "컴퓨터", "고양이","음바페","크레파스"}; //상 선택한뒤 다시 하 선택시 배열s에 다시 저장용.temp//
		
		while(true ) {
		System.out.println("게임 시작합니다.");		
		System.out.println("엔터를 입력하세요.");
		in.nextLine();
		
		System.out.println("난이도를 입력하세요. [하] / [상] ");
		String level = in.nextLine();
		
		while (true) { //난이도 선택 while 반복문. while (true)는 조건이 참이라 계속 반복함.
		    if (!level.equals("상") && !level.equals("하")) {  // 문자열 전체 비교
		        System.out.println("잘못된 입력입니다. 다시 입력하세요. [하] / [상]");
		        level = in.nextLine(); // 다시 입력 받기
		        continue;
		    }
		
		    // 난이도 '상' 선택 시
		    if (level.equals("상")) {  // 문자열 전체 비교
		        for (int q = 0; q < S.length; q++) {
		            S[q] = SS[q];
		        }
		        System.out.println("난이도 상을 선택하셨습니다.");
		        break;
		    }
		
		    // 난이도 '하' 선택 시
		    if (level.equals("하")) {  // 문자열 전체 비교
		        for (int q = 0; q < S.length; q++) {
		            S[q] = temp[q];
		        }
		        System.out.println("난이도 하를 선택하셨습니다.");
		        break;
		    }
		}
				
		System.out.println("맞히면 +1점, 틀리면 -1점입니다");
		System.out.println("제시된 단어를 따라서 타이핑해 주세요.");
		System.out.println("--------------------");
		
		
		//중복 금지 어레이
		int array[] = new int[S.length];
		int ctn = 0;
		//포인트
		int point =0;
		//메인 포문 문자열에 있는 문자와 내가 입력한 문자가 맞는지 확인한다.
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
				ctn++;
			}else {
				System.out.println("오답 입니다.");
				point -= 1;
				ctn=0;
			}
			
			 if (ctn >= 3) {
	
					point += ctn-2;
					System.out.println(ctn +"연속으로 정답을 맞혔습니다. " + "( + " + (ctn-2) +" 포인트 )" );
					System.out.println("----------");
					System.out.println("ㅣ참잘했어요 ㅣ");
					System.out.println("----------");
					
					
			 }
			System.out.println("포인트: " + point+", 연속된 정답의 갯수: " + (ctn));
			System.out.println("------------------ ");
		 
		}
		System.out.println("------------------");
		System.out.println("총포인트: " + point);
		
		if (point < 10) {
			System.out.println("바보입니다. 다시 도전 하세요.");
		}else if(point > 42) {
			System.out.println("참 잘했습니다! 하산하십시오.");
		}else {
			System.out.println("조금 더 노력 합시다. Do it again!");		
		}
		
		System.out.println("--------------------------------");
		
		}//while문
	
	}

}
