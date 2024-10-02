package _16_Static_Final_Q0;

import java.util.Scanner;

public class Login_Apply_Subject {
	
	
	
	public void menu( ) {
		Scanner in = new Scanner(System.in);
		System.out.println("1.수강신청");
		System.out.println("2.수강신청 가능한 과목확인");
		System.out.println("3.돌아가기");
		int select = in.nextInt();
		if(select ==1 ) {
			System.out.println("수강신청");
			add();
		}else if(select == 2) {
			System.out.println("수강신청 가능한 과목확인");
			Subject_mg.viewAll();
		}else if(select ==3) {
			System.out.println("돌아가기");
		}else {
			System.out.println("잘못된 접근");
		}
		
	}
	
	public void add() {
		Scanner in = new Scanner(System.in);
		System.out.println("수강하고 싶은 과목을 입력하시오");
		String temp = in.nextLine();
		
		if (Subject_mg.idxcheck(temp) != -1) {
			Student_mg.slist.get(Subject_mg.idxcheck(temp)).setSubjectName(temp);
			System.out.println("수강신청이 완료되었습니다");
		}else {
			System.out.println("정보 불일치");
		}
	    
	}
}
