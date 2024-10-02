package _16_Static_Final_Q0;

public class Student_one {
	
	private String id =null;
	private String name = null;
	private int phoneNumber = 0;
	private int grade = 0;
	private String subjectName = null;
	
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
	
	
	
	
	
	
	

}
