package _03FOR_0812_R;

import java.util.Scanner;

public class For0812_work_05_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
								
							/*	5. 앞뒤가똑같은너
								키보드로 문자를 입력받는다. 
								문자로 입력 받는 방법은 
								Scanner in = new Scanner(System.in);
								String a  = in.nextLine();     숫자는  nextInt(), 문자열을 nextLine() 메서드를 사용한다. 
								이때 문자열의 길이는 0보다 크고 10보다 작으며 짝수만 가능하다.
								조건에 만족될때까지 문자 입력을 받는다.
								문자열을 앞으로 읽으나 뒤로 읽으나 같은 경우의 문자를 판별하는 코드를 작성하세요 */
		
								Scanner in = new Scanner(System.in);
								System.out.println("입력하세요.");
								
								
								for (int i = 0; i<2; i++) {
									String a  = in.nextLine();
									if (a.length() > 0 && a.length() < 10 && a.length()%2 ==0 ) {
										//a  = in.nextLine();
										String b = a;
									}else {
																			
											System.out.println("다시입력하시오.");
											i--;
											//i--;
										}
											
									
										
										
																	
								}
								
								
								
								
								
								
								
		
								

	}

}
