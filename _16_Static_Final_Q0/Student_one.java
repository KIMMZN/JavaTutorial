package _16_Static_Final_Q0;

public class Student_one {
	
	private String id =null;
	private String name = null;
	private int phoneNumber = 0;
	private int grade = 0;
	private String subjectName = null;
	private String subjectName1 = null;
	private String subjectName2 = null;
	private String subjectName3 = null;
	private String subjectName4 = null;
	private String subjectName5 = null;
	
	public String getId() { // 아이디 조회
		return id;
	}
	public void setId(String id) { // 아아디 셋
		this.id = id;
	}
	
	public void nameinfo () {
		System.out.println("이름: " + name);
	}
	
	
	
	public String getName() { // 이름 조회
		return name;
	}
	public void setName(String name) { //이름 셋
		this.name = name;
	}
	
	
	public int getPhoneNumber() { // 전화번호조회
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) { ///전화번호 셋
		this.phoneNumber = phoneNumber;
	}
	
	
	public int getGrade() { // 학년조회
		return grade;
	}
	public void setGrade(int grade) { //학년 셋
		this.grade = grade;
	}
	
	public void studentList () {
		System.out.println("아이디: "+ id + "|  이름: " + name + "|  전화번호: " + phoneNumber + "|  학년 : " + grade);
		
	}
	
	public String getSubjectName() { // 과목조회
		return subjectName;
	}
	public void setSubjectName(String subjectName) { // 과목 셋
		this.subjectName = subjectName;
	}
	public String getSubjectName1() { // 1과목조회
		return subjectName1;
	}
	public void setSubjectName1(String subjectName1) { //1과목셋
		this.subjectName1 = subjectName1;
	}
	public String getSubjectName2() { // 2과목조회
		return subjectName2;
	}
	public void setSubjectName2(String subjectName2) { // 2과목셋
		this.subjectName2 = subjectName2;
	}
	public String getSubjectName3() { //3// 과목조회
		return subjectName3;
	}
	public void setSubjectName3(String subjectName3) { //3과목셋
		this.subjectName3 = subjectName3;
	}
	public String getSubjectName4() { // 4과목조회
		return subjectName4;
	}
	public void setSubjectName4(String subjectName4) { // 4과목셋
		this.subjectName4 = subjectName4;
	}
	public String getSubjectName5() { // 5과목조회
		return subjectName5;
	}
	public void setSubjectName5(String subjectName5) { // 6과목조회
		this.subjectName5 = subjectName5;
	}
	
	public void subjectInfo() {
		/*
		System.out.println("아이디 : " + this.id + "  |  이름 : " + this.name);
		int check = 0;
		for(int i =0; i<Student_mg.slist.size(); i++) {
			if(Student_mg.slist.get(i).getSubjectName() != null) {
				System.out.println("과목"+(i+1)+" :"+Student_mg.slist.get(i).getSubjectName());
				check = 1;
			}else if(Student_mg.slist.get(i).getSubjectName1() != null) {
				System.out.println("과목"+(i+1)+" :"+Student_mg.slist.get(i).getSubjectName1());
				
			}else if(Student_mg.slist.get(i).getSubjectName2() != null) {
				System.out.println("과목"+(i+1)+" :"+Student_mg.slist.get(i).getSubjectName2());
				
			}else if(Student_mg.slist.get(i).getSubjectName3() != null) {
				System.out.println("과목"+(i+1)+" :"+Student_mg.slist.get(i).getSubjectName3());
				
			}else if(Student_mg.slist.get(i).getSubjectName4() != null) {
				System.out.println("과목"+(i+1)+" :"+Student_mg.slist.get(i).getSubjectName4());
				
			}else if(Student_mg.slist.get(i).getSubjectName5() != null) {
				System.out.println("과목"+(i+1)+" :"+Student_mg.slist.get(i).getSubjectName5());				
			}
		}
		
		if(check == 0) {
			System.out.println("수강신청한 정보가 없습니다");
		}
		*/
	}
	
	
	
	
	
	
	

}
