package _10_Class_Q;

import java.util.Scanner;

public class Parking_mng {
	Parking_info[] clist = new Parking_info[7];
	Scanner in = new Scanner(System.in);
	
		Parking_mng() {
			while(true) {
				System.out.println("주차등록 프로그램 관리*");
				System.out.println("1.등록");
				System.out.println("2.조회");
				System.out.println("3.삭제");
				System.out.println("4.전체보기");
				
				int selnum = in.nextInt();
				in.nextLine();
				System.out.println(selnum + "을 선택함");
				if(selnum == 1) {
					add(); 
					//System.out.println("등록");
					
				}else if (selnum ==2) {
					search();
				}else if(selnum == 3) {
					delete();
				}
				else if(selnum == 4) {
					allList(); 
					//System.out.println("전체보기");
				}else {
					break;
				}
				
			}
			
		}
		
		public void add() {
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
		
		
		
		public void search() {
			System.out.println("정보를 조회합니다");
			//Parking_info searchin = new Parking_info();
			System.out.println("자동차 번호를 입력하세요");
			String searchin = in.next();			
			for(int i=0; i < clist.length; i++) {
				if(clist[i].carnum.equals(searchin)) {
					clist[i].info();					
					break;
				}else {
					System.out.println("없는 차량입니다.");
				}
			}
		}
		
		public void delete() {
			System.out.println("정보를 삭제합니다.");
			//Parking_info searchin = new Parking_info();
			System.out.println("자동차 번호를 입력하세요");
			String delete = in.next();
			for(int i=0; i < clist.length; i++) {
				if(clist[i].carnum.equals(delete)) {
					clist[i].carnum = null;
					clist[i].owner = null;
					break;
					
				}
			}
			
		}
		
		public void allList () {
			System.out.println("전체보기");
			for(int i=0; i < clist.length; i++) {
				if(clist[i] != null) {
					clist[i].info();
					
				}
			}
		}
		
		

}
