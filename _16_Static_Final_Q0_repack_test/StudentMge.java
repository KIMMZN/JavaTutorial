package _16_Static_Final_Q0_repack_test;

import java.util.ArrayList;
import java.util.Scanner;

import _16_Static_Final_Q0_repack.Stu;

public class StudentMge {
	private ArrayList<Student> slist = new ArrayList<>();
	
	
	public ArrayList<Student> getSlist() { // arraylist getter
		return slist;
	}

	StudentMge() {
		
		
	}
	
	public void menu() {
		while(true) {
			menuSelect(); 
			Scanner in = new Scanner(System.in);
			int sel = in.nextInt();
			in.nextLine();
			if(sel == 1) {
				System.out.println("1.등록");
				add();
			}else if(sel == 2) {
				System.out.println("2.검색");
			}else if(sel == 3) {
				System.out.println("3.삭제");
			}else if(sel == 4) {
				System.out.println("4.전체리스트");
				viewAll();
			}else {
				System.out.println("잘못된 접근");
				break;
			}
		}
	}
	private void menuSelect() {
		System.out.println("학생관리");
		System.out.println("1.등록");
		System.out.println("2.검색");
		System.out.println("3.삭제");
		System.out.println("4.전체리스트");
	}
	
	private void add() {
		
		Student studentOne = new Student();
		System.out.println("등록할 아이디를 입력하시오");
		Scanner in = new Scanner(System.in);
		String tempId = in.nextLine();
		
		if(findidx(tempId) == -1) {
			studentOne.setId(tempId);
			
			System.out.println("이름을 입력하시오");
			String tempName = in.nextLine();
			studentOne.setName(tempName);
			
			System.out.println("전화 번호를 입력하시오");
			String tempNumber = in.nextLine();
			studentOne.setPnumber(tempNumber);
			
			System.out.println("학년을 입력하시오");
			int tempGrade = in.nextInt();
			studentOne.setGrade(tempGrade);
			in.nextLine();
			System.out.println("입력 완료");
			slist.add(studentOne); //ArrayList에 객체 주소 저장
		}else {
			System.out.println("중복입니다");
		
		}
		
	}
	
	private int findidx(String id) {
		
		//for(int i =0; i<slist.size(); i++) {
		
			int i =0; // i값 리턴을 위한 변수
			for(Student object : slist) {
				if(object.getId().equals(id)) {
					return i; //-1이 아니면 중복
				}
				i++;
			}
			return -1; //-1이면 중복아님
		//}
	}
	
	private void viewAll() { //전체보기
			for(Student student : slist) {
				student.info();
			}
		
	}
	
	public Student loginID(String id) {
		int idx = findidx(id);
		if(idx != -1) {//-1이 아니면 중복
			return slist.get(idx);
		}
		return null;
	}
	
	
	
}
