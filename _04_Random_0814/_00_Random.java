package _04_Random_0814;

import java.util.Scanner; // utill 패키지를 통해 scanner 클래스를 호출함.

public class _00_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		
		Scanner in = new Scanner(System.in); 				// Scanner 클래스 // int는 nextInt // String은 nextLine //Scanner 클래스 작성후 ctrl + shift + o를 누르면 utill패키지를 통해 scanner 자동호출
																															
		int[] hJJ = new int[1];								// Scanner 을 사용할 시 utill 패키지를 경로의 Scanner 클래스를 호출해야 한다.
															// 주의할 것은 Scanner 을 생성할 때 (System.in) 이 들어간다는 점이다.
															//System.in 은 사용자로부터 입력을 받기 위한 입력 스트림이다.	
															
		
	
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
