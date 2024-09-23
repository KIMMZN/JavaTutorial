package _10_Class_Q4_0923.copy;

import java.util.Scanner;

public class Client_m {
	Scanner in = new Scanner(System.in);
	Client_one[] cList = new  Client_one[5];
	Event_one[] eList = new Event_one[5];
	
	Client_m () {
		
		while(true) { // 고객관리
			System.out.println("1.고객관리");				
			System.out.println("2.이벤트관리");
			System.out.println("3.프로그램종료");
			System.out.println("번호를 입력하시오 >> ");
			int Select3 = in.nextInt();
			in.nextLine();
			
			if(Select3 == 1) {
				 
				while(true) {
					
					System.out.println("1.고객가입");
					System.out.println("2.정보보기");
					System.out.println("3.수정하기");
					System.out.println("4.삭제하기");
					System.out.println("5.돌아가기");
					
					
					
					System.out.println("번호를 입력하시오 >>");
					int Select = in.nextInt();
					in.nextLine();
					
					if(Select == 1) {
						add();
						//.out.println("고객가입");
						
					}else if(Select == 2) {
						listall();
						//System.out.println("정보보기");
						
					}else if(Select == 3) {
						edit();
						//System.out.println("수정하기");
						
					}else if(Select == 4) {
						delete();
						//System.out.println("삭제하기");
						
					}else if(Select == 5) {
						System.out.println("돌아가기");
						break;
					}else {
					    break;	
					}
						
				}		
						
			}else if(Select3 == 2) { // 이벤트관리
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
			}else if (Select3 ==3) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 입력입니다");
		    }
	 }
}
	
	
	
	public void add () { //회원가입 메서드;
		
		Client_one client = new  Client_one();
		System.out.println("회원가입할 id를 입력하시오");
		//String id1 = client.pid(); //호출하고 리턴값 받아옴. 
		
		client.id = in.nextLine();
		System.out.println("이름을 입력하시오");
		//String name1 = client.pname();
		client.name = in.nextLine();
		
		for(int i =0; i<cList.length; i++) {
			//String id1 = cList[i].pid();
			if(cList[i] == null) {				
				cList[i] = client;
				break;
			}
		}
	}
	
	public void listall() { //정보보기 메서드
		
		for(int i =0; i<cList.length; i++) {
			if(cList[i] != null) {				
				cList[i].info();
			}
		}
	}
	
	public void edit() { //수정
		System.out.println("id를 입력하시오");
		String idtemp = in.nextLine();
				
		for(int i =0; i<cList.length; i++) {
			if(cList[i] != null) {
			String idone = cList[i].getid();
				if(idtemp.equals(idone)) {
					System.out.println("수정할 이름을 입력하시오");
					String nametemp = in.nextLine();
					cList[i].setname(nametemp);
					break;
				}else {
					System.out.println("정보 불일치");
					break;
				}
			}	
			
		}
	}
	
	public void delete() { // 삭제 메서드
		System.out.println("삭제할 id를 입력하시오");
		String idtemp = in.nextLine();
		
				
		for(int i =0; i<cList.length; i++) {
			if(cList[i] != null) {
			String idone = cList[i].getid();
				if(idtemp.equals(idone)) {				
					cList[i] = null;
					break;
				}else {
					System.out.println("정보 불일치");
					break;
				}
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
