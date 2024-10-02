package _16_Static_Final_Q0;

import java.util.ArrayList;
import java.util.Scanner;

public class Subject_mg {
		static ArrayList<Subject_one> sublist = new ArrayList<>();
	
	public void menu() {
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("교과목관리메뉴");
			System.out.println("1.교과목등록");
			System.out.println("2.전체보기");
			System.out.println("3.뒤로가기");		
			System.out.println("숫자를 선택하시오 >>");
			int select = in.nextInt();
			in.nextLine();
			if(select == 1) {
				//System.out.println("1.과목등록");
				add();
			}else if(select == 2) {
				System.out.println("2.전체보기");
				viewAll();
			}else if( select == 3) {
				break;
			}
			else{
				System.out.println("잘못된 접근");
			}
		}
		
	}
	
	public void add() { // 과목등록
		Subject_one subjectone = new Subject_one();
		System.out.println("등록할 과목명를 입력하시오");
		Scanner in = new Scanner(System.in);
		String tempname = in.nextLine();
		String tempname1 = tempname;
				if(idxcheck(tempname1) == -1) {
					subjectone.setSubjectName(tempname1);
					System.out.println("과목이 등록 되었습니다");
					System.out.println("등록할 강의실을 입력하시오");
					String tempclass = in.nextLine();					
					subjectone.setClassroom(tempclass);
					System.out.println("등록할 담당교수를 입력하시오");
					String tempprof = in.nextLine();
					subjectone.setProfInCharge(tempprof);
					sublist.add(subjectone); //sublist에 객체주소 저장
					System.out.println("모든 등록이 완료되었습니다");
				} else {
				System.out.println("과목이 중복 되었습니다");
			}
	}


	static public int idxcheck (String temp) { // 교과목 중복확인 메서드 // 중복 i return
	for(int i=0; i<sublist.size(); i++) {
		if(temp.equals(sublist.get(i).getSubjectName())) {
			return  i; // 중복이면 i값 리턴
		}
	}
	return -1;
	}
	
	static public void viewAll() { // 전체보기
		for(int i =0; i<sublist.size(); i++) {
			sublist.get(i).list();
		}
		
	}
	

}
