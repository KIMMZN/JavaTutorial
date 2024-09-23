package _10_Class_Q4_0923.copy.copy;

import java.util.Scanner;

public class Event_m {
	
	Scanner in = new Scanner(System.in);
	Client_one[] cList = new  Client_one[5];
	Event_one[] eList = new Event_one[5];
	
	Event_m() {
	
		while(true) {
			
			System.out.println("1.이벤트 등록");
			System.out.println("2.전체보기");
			System.out.println("3.돌아가기");
			System.out.println("번호를 입력하시오 >>");
			
			int Select1 = in.nextInt();
			in.nextLine();
			
			if(Select1 == 1) {
				eventadd();
				//System.out.println("이벤트등록");
				
			}else if(Select1 == 2) {
				eventall();
				//System.out.println("전체보기");
				
			}else if(Select1 == 3) {
				System.out.println("돌아가기");
				break;
			}else {
				System.out.println("잘못됩 입력입니다");
			}
		}
		
			
	}
	
	
	/// 이벤트
	
		public void eventadd() { //이벤트 등록 메서드
			
			Event_one event = new Event_one();
			System.out.println("등록할 이벤트 제목을 입력하시오");
			event.title = in.nextLine();
			
			System.out.println("이벤트의 내용을 입력하시오");
			event.text = in.nextLine();
			
			for(int i=0; i<eList.length; i++) {
				if(eList[i] == null) {
					eList[i] = event;
					break;
				}
			}
			
		}
		
		public void eventall() { //이벤트 전체보기 메서드
			
			for(int i=0; i<eList.length; i++) {
				if(eList[i] != null) {
					eList[i].info();
					
				}
			}
			
		}
		
	
	
	
}
