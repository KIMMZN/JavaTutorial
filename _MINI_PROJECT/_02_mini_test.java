package _MINI_PROJECT;

import java.util.Random;
import java.util.Scanner;


	
	        // 단어 블록 깨기

	       /*String[] S = {"쓰레기통", "스타크래프트", "김밥천국", "멍청이", "아메리카노", "휴먼교육센터", "컴퓨터", "고양이", "음바페", "크레파스"}; 
	        String[] SS = {"나랏말싸미듕귁에달아", "도널드트럼프", "맑은눈의광인", "킬리만자로산", "단팥맛통찐빵", "공간감각무감각", "게살샥스핀", "최참판댁", "간장공장공장장", "앗살라무알라이쿰"}; 
	        String[] SSS = {"크리스티아노 호날두", "리그오브레전드", "아버지 가 방에 들어 가신다.", "새나라의 어린이는 1시(am)전에 잔다.", "맥주 한잔 마시고 싶은 날이다.",
	                        "One Punch Man", "GTA6는 언제 발매 되는 것인가?", "아르다 귈러가 호드리구 보다 낫다.", "영어는 너무 어렵다", "What is your name?"};
			*/

public class _02_mini_test {

    public static void main(String[] args) {
        // 단어 블록 깨기

        String[] words = {"쓰레기통", "스타크래프트", "김밥천국", "멍청이", "아메리카노", "휴먼교육센터", "컴퓨터", "고양이", "음바페", "크레파스"}; 
        Scanner sc = new Scanner(System.in);
        int point = 0;

        System.out.println("게임을 시작합니다.");
        System.out.println("제시된 단어를 빠르게 입력하세요.");
        
        sc.nextLine();

        while (true) {
            boolean isEmpty = true;

            // 현재 남아있는 단어 출력
            System.out.print("남아있는 단어들: ");
            for (String word : words) {
                if (!word.equals("")) {
                    System.out.print(word + " ");
                    isEmpty = false;
                }
            }
            System.out.println();

            // 단어가 모두 제거되었는지 확인
            if (isEmpty) {
                break;
            }

            // 사용자 입력 받기
            String userInput = sc.nextLine();

            // 입력된 단어가 배열에 있는지 확인하고 제거
            boolean found = false;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(userInput)) {
                    words[i] = ""; // 단어 제거
                    found = true;
                }
            }

            if (found) {
                point += 5;
                System.out.println("정답입니다! 단어가 제거되었습니다.");
            } else {
                point -= 5;
                System.out.println("오답입니다.");
            }

            System.out.println("현재 점수: " + point);
            System.out.println("----------------------------");
        }

        System.out.println("모든 단어를 제거했습니다. 최종 점수는: " + point + "입니다.");
    }
}