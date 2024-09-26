package _10_Class_Q4_0923;

import java.util.Scanner;

public class Client_m {
	Scanner in = new Scanner(System.in);
	Client_one[] cList = new  Client_one[5];
	
	Client_m () {
		while(true) {
			
			System.out.println("1.고객가입");
			System.out.println("2.정보보기");
			System.out.println("3.수정하기");
			System.out.println("4.삭제하기");
			System.out.println("5.종료");
			
			
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
				System.out.println("종료");
				break;
			}else {
				break;
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
					cList[i].setWordname(nametemp);
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
	
	
}
