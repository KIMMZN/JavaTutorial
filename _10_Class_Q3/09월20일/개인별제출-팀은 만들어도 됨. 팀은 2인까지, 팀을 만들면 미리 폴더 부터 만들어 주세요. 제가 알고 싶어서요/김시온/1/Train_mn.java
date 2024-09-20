package _10_Class_Q2;

import java.util.Scanner;

public class Train_mn {
	Scanner in = new Scanner(System.in);
	Train_info[] tList = new Train_info[5];
	
	Train_mn() {
		while(true) {
			System.out.println("1.등록");
			System.out.println("2.전체보기");
			System.out.println("3.수정");
			System.out.println("4.종료");	
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
			}else {
				break;
			}
		}
		
	}
	
	public void registration() { // 등록 메서드
		System.out.println("등록할 기차의 번호를 입력하시오");
		Train_info Train = new Train_info();
		Train.number = in.nextLine();
		System.out.println("등록할 기차의 시간을 입력하시오");
		Train.time = in.nextLine();
		for(int i =0; i < tList.length; i++) {
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
		String editm = in.nextLine();
		
		for(int i =0; i < tList.length; i++) {
			if(tList[i].number.equals(editm) && tList[i] != null) {
				System.out.println("수정할 기차의 시간을 입력하시오");
				editm = in.nextLine();
				tList[i].time = editm;
				break;
			}
		}
	}
	
	
}
