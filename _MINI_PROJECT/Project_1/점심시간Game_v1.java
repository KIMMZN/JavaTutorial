// 프로젝트명: Middle
// 개발자: 최진석, 이명균, 김시온
// 개발일자: 2024-08-21
// 프로젝트 설명: 단어 맞추기를 기본으로 한 프로젝트. 기존의 단어 맞추기에서 벗어나 가운데 글자를 추론하여 맞히는 것으로 목표를 설정.
//			  두 가지의 난이도를 설정하였고, 3문제 이상 연속으로 맞혔을 경우 높은 정확도로 인하여 추가 점수를 부여.
//			  최대 140점.
package _MINI_PROJECT.Project_1;

import java.util.Random;
import java.util.Scanner;

public class 점심시간Game_v1 {

    public static void main(String[] args) {
        // 기본 array
        String[] a = new String[20];
        // 난이도 상 array
        String[] aA = {"마라탕","똠양꿍","회덮밥","깐풍기","라볶이","설렁탕","돈부리","만두국","돈까스","된장국","떡볶이","파스타","삼겹살","김치찜","잡채밥","수제비","물냉면","전복죽","삼계탕","아욱국"};
        // 난이도 하 temp array
        String[] tempa = {"탕수육","연포탕","팥빙수","비빔밥","햄버거","짜장면","순대국","감자전","순두부","육개장","갈비찜","불고기","막국수","갈비탕","쌀국수","콩국수","매운탕","리조또","닭갈비","김치전"};
        
        //색깔
        final String red = "\u001B[31m";
        final String blue = "\u001B[34m";
        final String yellow = "\u001B[33m";
        final String exit = "\u001B[0m";

        Scanner in = new Scanner(System.in);
        Random r = new Random();

        System.out.println("점심 메뉴 맞추기 (빈칸을 채워라!!!)");
        String c = in.nextLine();
        
        
        while (true) {
        	
        	// do while문을 이용한 난이도 조절 반복문
            do {
                System.out.println(yellow + "난이도" + exit + "를 선택하세요.");
                System.out.println("--------");
                System.out.println("|상| |하|");
                System.out.println("--------");
                c = in.nextLine();
            } while (!c.equals("상") && !c.equals("하"));
            
            //c 가 "상"이면 a[i]에 aA[i] 어레이의 값을 저장함. else 즉 "하"라면 a[i]에 tempa[i]를 저장함.
            if (c.equals("상")) {
                for (int i = 0; i < a.length; i++) {
                    a[i] = aA[i];
                }
            } else {
                for (int i = 0; i < a.length; i++) {
                    a[i] = tempa[i];
                }
            }

            System.out.println();
            System.out.println("가운데 글자를 맞혀보세요.");
            System.out.println();
            
            // 반복금지를 위한 변수 arr
            int[] arr = new int[20];
            // 콤보 기능을 위한 변수 cnt
            int cnt = 0;
            // 점수 기능을 위한 변수 point
            int point = 0;
            // life 기능을 위한 int
            int life = 2;

            for (int i = 0; i < 10; i++) {
            	
                int num = r.nextInt(20);
                //중복 금지하고 문제 출제를 위한 if문
                if (arr[num] != 1) {
                    System.out.println(a[num].charAt(0) + "[ ]" + a[num].charAt(2));
                    arr[num] = 1;
                } else {
                    i--;
                    continue;
                }

                String b = in.nextLine();
                
                //엔터를 입력하면 나오던 오류 수정. enter 입력시 오답으로 처리하였다.
                if (b.equals("")) {
                	
                	System.out.println("");
                	System.out.println(red + "오답" + exit);
                	System.out.println("");
                	cnt = 0;
                	life--;
                	if (life <= 0) {
                		System.out.println("[" + "Game Over" + "]");
                		break;
                	}
                }
                
                //정답시 효과, 오답시 효과등을 구현하기 위한 if문
                 if (a[num].charAt(1) == b.charAt(0)) {
                    System.out.println("");
                    System.out.println(blue + "정답" + exit);
                    System.out.println("");
                    point += 10;
                    cnt++;
                } else {
                	System.out.println("");
                	System.out.println(red + "오답" + exit);
                	System.out.println("");
                	cnt = 0;
                	life--;
                	if (life <= 0) {
                		System.out.println("[" + "Game Over" + "]");
                		break;
                	}
                	
                  }

                if (cnt >= 3) {
                    point += 5;
                    System.out.println(cnt + "연속으로 정답을 맞혔습니다. (+5 점)");
                }
                
                //숫자인 life를 string ♥로 표현하기 위한 삼항 연산자
                String lifeS = life >= 2 ? "♥♥" : "♥♡";

                System.out.println("----------------------------");
                System.out.println(" 점수: " + point + " , 콤보: " + cnt);
                System.out.println(" 생명: " + red + lifeS + exit);
                System.out.println("----------------------------");
            }

            if (life <= 0) {
                System.out.println("");
                continue;
            }
            
            //점수에 따라 출력 및 위치이동을 
            System.out.println("총 점수: " + point);

            if (point > 130) {
                if (c.equals("하")) {
                    System.out.println("참 잘했습니다. 다음단계에 도전하세요!");
                    System.out.println("--------------------------");
                    continue;
                } else if (c.equals("상")) {
                    System.out.println("참 잘했습니다. 하산하십시오!");
                    break;
                }
            } else {
                System.out.println("당신은 덜 배고픕니다. 다시 도전하세요.");
                System.out.println("--------------------------");
                continue;
            }
        }

        in.close();
    }
}