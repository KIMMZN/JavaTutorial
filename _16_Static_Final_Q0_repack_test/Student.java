package _16_Static_Final_Q0_repack_test;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private String id = null;
	
	
	private String name = null;
	private String pnumber = null;
	private int grade = 0;
	
	private SubjectMge subjectmge1 = null;
	private ArrayList<Subject>saddlist = new ArrayList<>(); //과목추가
	//subjectmge1 = subjectm
	
	//수강신청리스트 필요 // 주소 불러오기
	public void menu(SubjectMge subjectmge) {
		subjectmge1 = subjectmge;
		
		while(true) {
			Scanner in = new Scanner(System.in);
			
			System.out.println("1.수강신청");
			System.out.println("2.신청리스트");
			int seln = in.nextInt();
			in.nextLine();
			if(seln == 1) {
				System.out.println("수강신청");
				add();
			}else if(seln == 2) {
				System.out.println("신청리스트");
				mylist();
			}else {
				System.out.println("잘못된접근");
			}
		}
	}
	
	private void add() {
		ArrayList<Subject>getList = subjectmge1.getSublist();
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int i =0;
		
		for(Subject getList1 : getList) {
			System.out.println("번호는 : " + i);
			getList1.info();
			i++;
		}
		int seln = in.nextInt();
		in.nextLine();
		saddlist.add(saddlist.get(seln));
		
	}
	private void mylist() {
		for(Subject Slist : saddlist) {
			Slist.info();
		}
		
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPnumber() {
		return pnumber;
	}
	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void info() {
		System.out.println(id + "  " + name + "  " + pnumber + "  " + grade);
		
	}

	
	
	

}
