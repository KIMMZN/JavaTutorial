package _16_Static_Final_Q0_repack_test;

import java.util.ArrayList;
import java.util.Scanner;

public class SubjectMge {
	ArrayList<Subject>sublist = new ArrayList<>();
	
	SubjectMge() {
		
	}

	public void menu() {
		while(true) {
			menuSelect(); 
			Scanner in = new Scanner(System.in);
			int sel = in.nextInt();
			in.nextLine();
			if(sel == 1) {
				System.out.println("1.과목등록");
				add();
			}else if(sel == 2) {
				System.out.println("2.전체보기");
				viewAll();
			}else {
				System.out.println("잘못된 접근");
				break;
			}
		}
	}
	private void menuSelect() {
		System.out.println("교과목 관리");
		System.out.println("1.등록");
		System.out.println("2.전체리스트");
	}
	
private void add() { // 등록
		Subject subject = new Subject();
		Student studentOne = new Student();
		System.out.println("등록할 과목을 입력하시오");
		Scanner in = new Scanner(System.in);
		String tempSubject = in.nextLine();
		
		if(findidx(tempSubject) == -1) {
			subject.setSubjectName(tempSubject);
			
			System.out.println("강의실을 입력하시오");
			String tempClass = in.nextLine();
			subject.setSubjectClass(tempSubject);
			
			System.out.println("담당교수를 입력하시오");
			String tempProf = in.nextLine();
			subject.setSubjectProf(tempSubject);
			System.out.println("입력 완료");
			sublist.add(subject); //ArrayList에 객체 주소 저장
		}else {
			System.out.println("중복입니다");
		
		}
		
	}
	
	private int findidx(String tempSubject) { //중복확인. i값 리턴
		
		//for(int i =0; i<slist.size(); i++) {
		
			int i =0; // i값 리턴을 위한 변수
			for(Subject subject : sublist) {
				if(subject.getSubjectName().equals(tempSubject)) {
					return i; //-1이 아니면 중복
				}
				i++;
			}
			return -1; //-1이면 중복아님
		//}
	}
	private void viewAll() { //전체보기
			for(Subject subject : sublist) {
				subject.info();
			}
	}
	
}
