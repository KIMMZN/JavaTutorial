package _10_Class_Q4_0923.copy.copy;

import java.util.Scanner;


public class ClientEvent_Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client_m client = new Client_m(); //객체생성.. 클래스에 생성자가 없으면 자동으로 기본 생성자를 만들어준다
		Event_m event = new Event_m();		//객체생성 
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("고객관리 프로그램 및 이벤트관리 프로그램");
			System.out.println("1.고객관리");
			System.out.println("2.이벤트관리");
			System.out.println("3.종료");
			System.out.println("번호를 입력하시오 >> ");
			int select = in.nextInt();
			in.nextLine();
			
			if(select == 1) {
				client.Client_m1(); //참조변수 client를 통해 고객 관리 메서드 호출
				if(client.found == 1) { //종료// 플래그가 1이면 종료
					break;
				}
				
			}else if(select == 2) {
				event.Event_m1(); //참조변수 event를 통해 이벤트 관리 메서드 호출
				if(event.found == 1) { //종료// 플래그가 1이면 종료
					break;
				}
			}else if(select == 3) {
				System.out.println("종료");
				break;
			}
			else{
				System.out.println("잘못된 접근입니다");
			}
		}
		
		
		
		
	}
	
	
	
	

}
