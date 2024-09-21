package _10_Class_Q3;

import java.util.Scanner;

public class Train_mn {
	Scanner in = new Scanner(System.in);
	Train_info[] tList = new Train_info[5];
	
	Train_mn() {
		while(true) {
			Train_info Train = new Train_info();
			pannel(); //전광판 메서드
			System.out.println("1.등록");
			System.out.println("2.전체보기");
			System.out.println("3.수정");
			System.out.println("4.종료");	
			System.out.println("5.수리정보");
			System.out.println("번호를 선택하시오 >> ");
			
			int sellect = in.nextInt();
			in.nextLine();
			
			if(sellect == 1) {
				registration();
				//System.out.println("등록");
			}else if(sellect == 2) {
				//System.out.println("전체보기");
				viewAll();
			}else if (sellect == 3) {
				//System.out.println("수정");
				edit();
			}else if (sellect == 4) {
				System.out.println("종료");
				break;
			}else if (sellect == 5) {
				//System.out.println("수리정보");
				repair();
			}
			else {
				break;
			}
		}
		
	}
	
	public void registration() { // 등록 메서드
		System.out.println("등록할 기차의 번호를 입력하시오");
		Train_info Train = new Train_info();
		Train.number = in.nextInt();
		
		boolean found1 = false;
		for(int i =0; i<tList.length-1; i++) {
			if(Train.number == (i+1) * 1111 ) {
				found1 = true;
				break;
			}
		}
		if(found1 == false) {
			System.out.println("일치하는 정보가 없습니다.");
			return;
		}
		
		Train.typeNumber();// 기차 번호에 따라 종류 설정
		
		System.out.println("등록할 기차의 도착시간을 입력하시오");
		Train.time = in.nextInt();
				
		for(int i =0; i < tList.length; i++) { // 등록 포문
			if(tList[i] == null) {
				tList[i] = Train;
				break;
			}
		}
	}
	
	public void viewAll() { // 전체정보 메서드
		System.out.println("전체정보를 출력합니다");
		for(int i =0; i < tList.length; i++) {
			if(tList[i] != null) {
				
				tList[i].info();
			}
		}
		
	}
	
	public void edit() { // 수정 메서드
		System.out.println("기차의 번호를 입력하시오");
		Train_info Train = new Train_info();
		int editn = in.nextInt();
		System.out.println("도착 시간을 입력하시오");
		int editm = in.nextInt();
		
		for(int i =0; i < tList.length; i++) {
			if(tList[i].number == editn && tList[i] != null && tList[i].time == editm) {
				System.out.println("수정하고싶은 도착시간을 입력하시오");
				editm = in.nextInt();
				tList[i].time = editm;
				break;
			}else {
				System.out.println("오류");
				break;
			}
		}
	}
	
	public void repair() { // 수리중 메서드
		Train_info Train = new Train_info();
		System.out.println("수리가 필요한 기차정보 확인");
		System.out.println("1.수리할 기차등록 / 2. 수리중인 기차정보 확인");
		System.out.println("번호를 입력하시오 >> ");
		int menu = in.nextInt();
		if (menu == 2) { // 2. 수리중인 기차정보 확인
			for(int i =0; i < tList.length; i++) { 
				if(tList[i].repair != null) {
					tList[i].infoR();
					break;
				}else {
					System.out.println("수리가 필요한 기차가 없습니다.");
					break;
				}
			}
			
		}else if (menu == 1) { // 1.수리가 필요한 기차 등록
			for(int i =0; i < tList.length; i++) {
				if(tList[i].repair == null) {
					System.out.println("수리가 필요한 기차의 번호를 입력하시오");
					menu = in.nextInt();
					if(menu == tList[i].number) {
						tList[i].repair = "수리중";
						tList[i].infoR();
						return;
						
					}else {
						System.out.println("일치하는 기차정보가 없습니다");
						break;
					}
				}
			}
		}
	}
	
	public void pannel () { // 전광판 메서드
		
		//Train_info Train = new Train_info();			
		int found = 0;
		for(int i =0; i<tList.length; i++) { // 전광판
			if (tList[i] != null) {									
				found++;
				if(found == 1) {
					System.out.println("------------------전광판------------------");
				}
				tList[i].pan();	
			}
		}
		if(found >=1 ) {
			System.out.println("----------------------------------------");
		}
		
	}
}
