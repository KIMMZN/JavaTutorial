package _10_Class_Q;

import java.util.Scanner;

public class Parking_mng {
	Parking_info[] clist = new Parking_info[7];
	Scanner in = new Scanner(System.in);
	
		Parking_mng() {
			while(true) {
				System.out.println("*주차등록 프로그램 관리*");
				System.out.println("1.등록");
				System.out.println("2.조회");
				System.out.println("3.삭제");
				System.out.println("4.전체보기");
				System.out.println("5.회원정보수정");
				System.out.println("6.종료");
				System.out.println("번호를 선택 하시오 >>");
				int selnum = in.nextInt();
				in.nextLine();
				System.out.println(selnum + "을 선택함");
				if(selnum == 1) {
					add(); //등록
					//System.out.println("등록");
					
				}else if (selnum == 2) {
					search(); // 조회
				}else if(selnum == 3) {
					delete(); // 삭제
				}else if(selnum == 4) {
					allList();  // 전체보기
					//System.out.println("전체보기");
				}else if(selnum == 5) {
					mod(); // 회원정보수정(회원이름)
				}
				else if (selnum == 6) {
					System.out.println("종료합니다.");
					break;
				}
				else {
					break;
				}
				
			}
			
		}
		
		public void add() { // 자동차 등록 메서드
			System.out.println("자동차 등록");
			Parking_info car = new Parking_info();
			//Parking_info name = new Parking_info();
			System.out.println("자동차 번호를 입력하세요");
			car.carnum = in.next();
			in.nextLine();
			System.out.println("소유주 이름을 입력하세요");
			car.owner = in.next();
			for(int i=0; i < clist.length; i++) {
				if(clist[i] == null) {
					clist[i] = car;
					break;
				}
			}
		}
		
		public void search() { //자동차 번호로 회원 정보 조회 메서드
			System.out.println("정보를 조회합니다");
			//Parking_info searchin = new Parking_info();
			System.out.println("자동차 번호를 입력하세요");
			String searchin = in.next();
			int found = 0;
			for(int i=0; i < clist.length; i++) {
				if(clist[i] != null && clist[i].carnum.equals(searchin)) {
					clist[i].info();
					found = 1;
				break;
				}
			}
			if (found == 0) {
				System.out.println("찾는 정보가 없습니다.");
			}
			
		}
		
		public void delete() { //자동차 번호로 회원 정보 삭제 메서드
			System.out.println("정보를 삭제합니다.");
			//Parking_info searchin = new Parking_info();
			System.out.println("삭제할 자동차의 번호를 입력하세요");
			String delete = in.nextLine();
			int found = 0;
			for(int i=0; i < clist.length; i++) {
				if(clist[i].carnum.equals(delete)) {					
					clist[i] = null;
					found = 1;
					break;
				}
			}
			if (found == 0) {
				System.out.println("찾는 정보가 없습니다.");
			}
		}
		
		public void mod() { // 회원정보 수정 메서드
			System.out.println("회원정보를 수정니다.");
			
			System.out.println("수정할 자동차의 번호를 입력하세요");
			String modNumber = in.nextLine();
			int found = 0;
			for(int i=0; i < clist.length; i++) {
				if(clist[i].carnum.equals(modNumber) && clist[i] != null) {
					found = 1;
					System.out.println("변경할 소유자의 이름을 입력하세요");
					String newUser = in.nextLine();
					//입력된 값의 유효성을 체크 하는등
					//무결성 코드 추가가능					
					clist[i].owner = newUser;
					break;
				}
			}
			if (found == 0) {
				System.out.println("찾는 정보가 없습니다.");
			}
		}
			
			
		
		
		
		public void allList () { //회원 전체보기 메서드
			System.out.println("전체보기");
			for(int i=0; i < clist.length; i++) {
				if(clist[i] != null) {
					clist[i].info();
					
				}
			}
		}
		
}
