package _16_Static_Final_Q0;

import java.util.Scanner;

public class Login_Apply_Subject {
	//ArrayList<Login_Apply_Subject_One> laslist = new ArrayList <>();
	Subject_Student_menu subjectMenu;
	
	 public Login_Apply_Subject(Subject_Student_menu subjectMenu) {
	        this.subjectMenu = subjectMenu;
	 }
	 
	public void menu( ) {
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("1.수강신청");
			System.out.println("2.수강신청 가능한 과목확인");
			System.out.println("3.돌아가기");
			int select = in.nextInt();
			if(select ==1 ) {
				System.out.println("수강신청");
				add(subjectMenu);
			}else if(select == 2) {
				System.out.println("수강신청 가능한 과목확인");
				Subject_mg.viewAll();
			}else if(select ==3) {
				System.out.println("돌아가기");
				break;
			}else {
				System.out.println("잘못된 접근");
			}
		}
		
	}
	
	public void add(Subject_Student_menu subjectMenu) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("수강하고 싶은 과목을 입력하시오");
		String temp = in.nextLine();
		if (Subject_mg.idxcheck(temp) != -1) {
					String loginIdCheck= subjectMenu.loginId;
					for(int i =0; i<Student_mg.slist.size(); i++) {
						if(Student_mg.slist.get(i).getId().equals(loginIdCheck)) {
							Student_mg.slist.get(i).addSubject(temp);
							return;
						}
						
					}
					
					
					// 학생 객체 찾기
		            for (Student_one student : Student_mg.slist) {
		                if (student.getId().equals(loginIdCheck)) {
		                    student.addSubject(temp); // 학생 객체에 과목 추가
		                    System.out.println("수강신청이 완료되었습니다");
		                    return;
		                }
		            }
			
			System.out.println("수강신청이 완료되었습니다");
		}else {
			System.out.println("정보 불일치");
		}
	    
	}
}
