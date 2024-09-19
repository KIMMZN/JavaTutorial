package _10_Class_Ex;

import java.util.Scanner;

public class Cat_m {
	// 클래스 바로 안쪽이라서 멤버변수라고 합니다.
	// 여기서 선언한 이유는 클래스 내부 어느곳에서든 참조가능 하게 하려고.
	//참조변수타입 배열의 기본값은 null이다.
	
	Cat_Obj[] clist = new Cat_Obj[5];
	Scanner in = new Scanner(System.in);
	Cat_m() {
		
	 while(true) {
		 
		 System.out.println("고양이 관리자");
		 System.out.println("1. 등록");
		 System.out.println("2. 삭제");
		 System.out.println("3. 수정");
		 System.out.println("4. 전체보기");
		 System.out.println("  선택 >>");
		 int selNum = in.nextInt();
		 in.nextLine();
		 System.out.println(selNum + "을 선택함");
		 if(selNum ==1) {
			 add(); // 메서드 호출
		 }else if (selNum ==4) {
			 allList();  // 메서드 호출
		 }else {
			 break;
		 }
		 
		 
	 }
	}
	public void add() { //메서드 정의
		//Scanner in = new Scanner(System.in);
		System.out.println("고양이 등록");
		//새로운 고양이 만들어야 함.
		Cat_Obj cat = new Cat_Obj();
		System.out.println("고양이 이름을 입력");
		cat.name = in.nextLine();		
		for(int i=0; i< clist.length; i++) {
			if(clist[i]==null) {
				clist[i] = cat;
				break;
			}
		}
		//in.close();
				
	}
	public void allList() {// 메서드 정의
		System.out.println("고양이 전체 보기");
		for(int i=0; i< clist.length; i++) {
			if(clist[i]!=null) {
				clist[i].prt();
				
			}
		}
	}
	
	
	
}
