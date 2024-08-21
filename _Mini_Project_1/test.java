package _Mini_Project_1;

import java.util.Random;
import java.util.Scanner;

public class test {


		// TODO Auto-generated method stub
		
		public static void main(String[] args) {
			
			String[] arrLevel1 = {"ㅂ","ㅈ","ㄷ","ㄱ","ㅅ","ㅁ","ㄴ","ㅇ","ㄹ","ㅎ","ㅋ","ㅌ","ㅊ","ㅍ","ㅛ","ㅕ","ㅑ","ㅐ","ㅔ","ㅗ","ㅓ","ㅏ","ㅣ","ㅠ","ㅜ","ㅡ"};
			Random r = new Random();
			Scanner in = new Scanner(System.in);
			int score=0;
			double avg=0;
			int cnt=0;
			for(int i=0; i<16; i++) {
				
				int level1Word = r.nextInt(26);
				System.out.println(arrLevel1[level1Word]);
				String level1Typing = in.nextLine();
				
				
				if(arrLevel1[level1Word].equals(level1Typing)) {
					score += 10;
					cnt++;
					avg += 100;
					System.out.println("정답입니다. +10점!");
					if(avg!=0) {
						System.out.println("정확도는 "+(avg/cnt)+"% 입니다.");
					}else {
						System.out.println("정확도는 50% 입니다.");
					}
					
					
				}else {
					score -= 10;
					cnt++;
					avg -= 100;
					System.out.println("오답입니다.. -10점");
					if(avg!=-100) {
						System.out.println("정확도는 "+(avg/cnt)+"% 입니다.");
					}else {
						System.out.println("정확도는 0% 입니다.");
					}
					
				}
				
//				if(score<=30) {
//					
//					
//				}else if(score<100) {
//					
//					
//				}else {
//					
//					
//				}
				
			}
			
			
		}

	}

