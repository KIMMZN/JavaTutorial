package _16_Static_Final_Q0;

import java.util.Scanner;

public class Subject_Student_menu {
	Subject_mg subjectmg = null;
	Student_mg studentmg = null;
	Login_Apply_Subject lasmenu = null;
	int loginCheck = -1; // 로그인 했는지 확인하는 멤버변수
	String loginId = null;
	
	
		
	Subject_Student_menu () {
		
		
		if (subjectmg == null) {
			subjectmg = new Subject_mg();
		}
		if (studentmg == null) {
			studentmg = new Student_mg();
		}
		
		if(lasmenu == null) {
			lasmenu = new Login_Apply_Subject(this);
		}
		
		//lasmenu.ssmenu = 
	
		menu();
	
		
		
	}
	
	
	public void menu () {
		
		 while(true) {
			Scanner in = new Scanner(System.in);
			
					if(loginCheck == -1) {
						login();
						
					}
					while(loginCheck != -1) {
						System.out.println(studentmg.slist.get(loginCheck).getId()+"님 환영합니다");
						System.out.println("수강신청프로그램");
						System.out.println("1.학생관리");
						System.out.println("2.교과목관리");
						System.out.println("3.수강신청");			
						System.out.println("4.수강신청리스트");
						System.out.println("5.종료");
						System.out.println("숫자를 선택하시오 >>");
						
						int select = in.nextInt();
						in.nextLine();
						if(select == 1) {
							//System.out.println("1.학생관리");
							studentmg.menu();
						}else if(select == 2) {
							//System.out.println("2.교과목관리");
							subjectmg.menu();
						}else if(select ==3) {
							System.out.println("3.수강신청");
							lasmenu.menu();
						}else if(select == 4) {
							System.out.println("4.수강신청리스트");
							viewApply();
							//viewSubject ();
						}else if(select == 5) {
							System.out.println("종료");
						}
						else {
							System.out.println("잘못된 접근");
							break;
						}
					}
					if(loginCheck == -1) {
						System.out.println("수강신청프로그램");
						System.out.println("1.학생관리");
						System.out.println("2.교과목관리");
						System.out.println("3.종료");
						System.out.println("숫자를 선택하시오 >>");
						int select = in.nextInt();
						in.nextLine();
						if(select == 1) {
							//System.out.println("1.학생관리");
							studentmg.menu();
						}else if(select == 2) {
							//System.out.println("2.교과목관리");
							subjectmg.menu();
						}else if(select ==3) {
							System.out.println("종료");
						}
						else {
							System.out.println("잘못된 접근");
							break;
						}
					}
		}
	}

	
	public void login() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("로그인 하시겠습니까 ?  (1.yes/ 2.no)");
		int select1 = in.nextInt();
		in.nextLine();
		if(select1 == 1) {
			System.out.println("아이디를 입력하시오");
			String idtemp = in.nextLine();
			
			studentmg.idxcheck(idtemp);
			int ididx = studentmg.idxcheck(idtemp);
			//System.out.println("디버그용1");
			
			if(ididx != -1) {
				//System.out.println("디버그용2");
				loginId = idtemp; // 로그인한 아이디 저장
				loginCheck = ididx;
				System.out.println(loginCheck + " 디버그용 로그인첵 idx");
				System.out.println("로그인 되었습니다");
			}else if(ididx == -1) {
				System.out.println("등록된 id가 없습니다");
			}
			
	     }else if (select1 ==2) {
	    	 //System.out.println(""); // 디버그용
	    	 return;
	     }else {
	    	 System.out.println("잘못된 접근");
	     }
	    	 
	}
	
	/*
	public void viewSubject () {
		System.out.println("id : " + loginId);
		for(int i =0; i<lasmenu.laslist.size(); i++) {
			lasmenu.laslist.get(i).subjectInfo();
		}
	}*/
	
	public void viewApply() {
		for(Student_one students : studentmg.slist) {
			students.applyList();
		}
		
		
		//for(int i =0; i<studentmg.slist.size(); i++) {
		//	studentmg.slist.get(i).applyList();
		//}
		
	}

	
	
	
	
	
}
