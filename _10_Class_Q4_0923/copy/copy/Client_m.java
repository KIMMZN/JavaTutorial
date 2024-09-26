package _10_Class_Q4_0923.copy.copy;

import java.util.Scanner;

public class Client_m {
	Scanner in = new Scanner(System.in);
	Client_one[] cList = new  Client_one[5]; //객체 타입의 배열생성
	//Event_one[] eList = new Event_one[5];
	
	int found = 0; //종료 플래그
	public void Client_m1 () {
		
		while(true) { // 고객관리	
					System.out.println("---고객 관리창---");
					System.out.println("1.고객가입");
					System.out.println("2.정보보기");
					System.out.println("3.수정하기");
					System.out.println("4.삭제하기");
					System.out.println("5.돌아가기");
					System.out.println("6.종료");
					System.out.println("7.현재진행중인이벤트");
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
					}else if(Select == 6) {
						System.out.println("종료");
						found= 1;
						break;
					}else if(Select == 7) {
						 
					}
					else {
						System.out.println("잘못된 접근");
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
		
		boolean found = false;
		for(int i =0; i<cList.length; i++) {
			if(cList[i] != null) {
				found = true;
				cList[i].info();
			}
		}
		if(!found) {
			System.out.println("정보가 없습니다");
		}
	}
	
	public void edit() { //수정
		System.out.println("id를 입력하시오");
		String idtemp = in.nextLine();
		
		boolean found = false;//정보없음판단
		int tf = 0; //정보일치판단
		
		for(int i =0; i<cList.length; i++) {
			if(cList[i] != null) {
				found = true;
				String idone = cList[i].getid();
				if(idtemp.equals(idone)) {
					System.out.println("수정할 이름을 입력하시오");
					String nametemp = in.nextLine();
					cList[i].setname(nametemp);
					tf = 1;
					break;
				}
			}	
		}
		
		if(tf == 0) { // 정보 불일치시
			System.out.println("정보 불일치");
		}
		
		if (!found) { // 정보가 없을시
			System.out.println("정보가 없습니다");
		}
	}
	
	public void delete() { // 삭제 메서드
		System.out.println("삭제할 id를 입력하시오");
		String idtemp = in.nextLine();
		
		boolean found = false;
		for(int i =0; i<cList.length; i++) {
			if(cList[i] != null) {
				found = true;
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
		if(!found) {
			System.out.println("정보가 없습니다");
		}
	}
	
	
	
	
}
