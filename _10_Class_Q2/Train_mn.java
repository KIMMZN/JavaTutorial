package _10_Class_Q2;

import java.util.Scanner;

public class Train_mn {
	
	Scanner in = new Scanner(System.in);
	Train_info[] tList = new Train_info[5];// Train_mn은 Train_info 객체를 의존하고있다.
	
	Train_mn() {
		while(true) {
			System.out.println("1.등록");
			System.out.println("2.전체보기");
			System.out.println("3.수정");
			System.out.println("4.종료");	
			System.out.println("번호를 선택하시오 >> ");
			
			int select = in.nextInt();
			in.nextLine();
			
			if(select == 1) {
				registration();
				//System.out.println("등록");
			}else if(select == 2) {
				//System.out.println("전체보기");
				viewAll();
			}else if (select == 3) {
				//System.out.println("수정");
				edit();
			}else if (select == 4) {
				System.out.println("종료");
			}else {
				break;
			}
		}
		
	}
	
	public void registration() { // 등록 메서드
		System.out.println("등록할 기차의 번호를 입력하시오");
		//Train 객체 생성
		Train_info Train = new Train_info();
		Train.number = in.nextLine();
		System.out.println("등록할 기차의 시간을 입력하시오");
		Train.time = in.nextLine();
		//배열의 빈칸에 저장, 빈칸은 배열의 값이 null
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
		
		//조건을 걸어 본다. 기차번호는 유니크 하다.
		for(int i =0; i < tList.length; i++) {
			
			String mnum = tList[i].getNumber(); //호출하고 리턴값 받아옴.  
			if(mnum.equals(editm) && tList[i] != null) {
			//if(tList[i].number.equals(editm) && tList[i] != null) {	
				System.out.println("수정할 기차의 시간을 입력하시오");
				editm = in.nextLine();
				tList[i].time = editm;
				break;
			}
		}
	}
	
	
}
