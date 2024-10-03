package _16_Static_Final_Q0;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_mg {
	 static ArrayList<Student_one> slist = new ArrayList<>();

	
	public void menu() {
		while(true) {
			Scanner in = new Scanner(System.in);
			
			System.out.println("학생관리메뉴");
			System.out.println("1.학생등록");
			System.out.println("2.학생검색");
			System.out.println("3.학생삭제");
			System.out.println("4.학생전체보기");
			System.out.println("5.뒤로가기");
			System.out.println("숫자를 선택하시오 >>");
			int select = in.nextInt();
			in.nextLine();
			if(select == 1) {
				//System.out.println("1.학생등록");
				add();
			}else if(select == 2) {
				//System.out.println("2.학생검색");
				nameSearch();
			}else if(select == 3) {
				//System.out.println("3.학생삭제");
				idDelete();
			}else if(select == 4) {
				viewAll();
				//System.out.println("4.학생전체보기");
				
			}else if(select == 5) {
				break;
			}
			else{
				System.out.println("잘못된 접근");
			}
		}
		
		
	}
	
	
	
	public void add() {
		Student_one studentOne = new Student_one();
		System.out.println("등록할 아이디를 입력하시오");
		Scanner in = new Scanner(System.in);
		String tempid = in.nextLine();
		
		if(slist.size() < 10) { // 등록인원 10명 이하 확인
			if(idxcheck(tempid) == -1) {
				studentOne.setId(tempid);
				System.out.println("아이디가 등록 되었습니다");
				System.out.println("등록할 이름을 입력하시오");
				String tempname = in.nextLine();
				studentOne.setName(tempname);
				System.out.println("등록할 전화번호를 입력하시오 (예)01012345678");
				int temppnum = in.nextInt();
				in.nextLine();
				studentOne.setPhoneNumber(temppnum);
				System.out.println("등록할 학년을 입력하시오");
				int tempgrade = in.nextInt();
				in.nextLine();
				studentOne.setGrade(tempgrade);
				slist.add(studentOne); // arraylist에 객체 주소 저장
				
			}else {
				System.out.println("아이디가 중복 되었습니다");
			}
		}else {
			System.out.println("등록 인원이 초과되었습니다");
			return;
		}
	}
	
	public int idxcheck (String temp) { // 아이디 중복확인 메서드 // 중복 i return
		for(int i=0; i<slist.size(); i++) {
			if(temp.equals(slist.get(i).getId())) {
				return  i;
			}
		}
		return -1;
	}
	
	public void nameSearch() { // 이름으로 조회
		System.out.println("검색할 이름을 입력하시오");
		Scanner in = new Scanner(System.in);
		String tempname = in.nextLine();
		String tempname1 = tempname;
		
		for(int i=0; i<slist.size(); i++)
				if(slist.get(i).getName().contains(tempname1)) {
					slist.get(i).nameInfo();
				}
	}
	
	public void idDelete() { // 삭제 메서드
		System.out.println("삭제할 아이디를 입력하시오");
		Scanner in = new Scanner(System.in);
		String temid = in.nextLine();
		String tempid1 = temid;
		
		if (idxcheck(tempid1) != -1) {
			int tmep = idxcheck(tempid1);
			slist.remove(tmep);
			System.out.println("삭제되었습니다");
			
		}else {
			System.out.println("조회한 아이디가 없습니다");
		}
	}
	
	public void viewAll() { // 리스트모두보기 메서드
		for(int i =0; i<slist.size(); i++) {
			slist.get(i).studentList();
		}
	}
	
	
	
}
