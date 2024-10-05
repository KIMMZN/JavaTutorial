package _16_Static_Final_Q0_repack_test;

import java.util.Scanner;

public class MainMenu {
	StudentMge studentmge = null;
	SubjectMge subjectmge = null;
	Student student = null; // 초기화
	
	MainMenu() {
		
		
		menu();
	}
	
	private void menu () {
		init();
		while(true) {
			menuSelect();
			Scanner in = new Scanner(System.in);
			int sel = in.nextInt();
			in.nextLine();
			if(sel == 1) {
				System.out.println("1.학생관리");
				gotoStudent();
			}else if(sel == 2) {
				System.out.println("2.교과목관리");
				gotoSubject();
			}else if(sel == 3) {
				System.out.println("3.로그인");
				login();
				
			}else {
				System.out.println("잘못된접근");
			}
		}
	}
	
	private void menuSelect() {
		System.out.println("1.학생관리");
		System.out.println("2.교과목관리");
		System.out.println("3.로그인");
	}
	
	private void init() {
		if(studentmge == null) {
			studentmge = new StudentMge();
		}
		if(subjectmge == null) {
			subjectmge = new SubjectMge();
		}
	}
	
	private void gotoStudent() {
		studentmge.menu();
	}
	
	private void gotoSubject() {
		subjectmge.menu();
	}
	
	
	private void login() {
		Scanner in = new Scanner(System.in);
		System.out.println("로그인할 아이디를 입력하시오");
		String temp = in.nextLine();
		Student nowUser = studentmge.loginID(temp);
		
		if(nowUser != null) {
			System.out.println("로그인 되었습니다");
		}else {
			System.out.println("정보없습니다");
		}
		
	}
	

}
