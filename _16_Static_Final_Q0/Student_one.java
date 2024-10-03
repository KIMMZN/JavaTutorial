package _16_Static_Final_Q0;

import java.util.ArrayList;

public class Student_one {
	
	private String id =null;
	private String name = null;
	private int phoneNumber = 0;
	private int grade = 0;
	//private ArrayList<Login_Apply_Subject_One> subjects;
	private ArrayList<String> subjects = new ArrayList<>();
	
	
	public String getId() { // 아이디 조회
		return id;
	}
	public void setId(String id) { // 아아디 셋
		this.id = id;
	}
	
	public void nameInfo () {
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
	
	// 과목 추가 메서드
    public void addSubject(String subject) {
        subjects.add(subject); // 과목을 리스트에 추가
    }
    
    // 신청한 과목 수와 리스트 출력
    public void viewSubjects() {
        System.out.println("신청한 과목 수: " + subjects.size());
        for (String subject : subjects) {
            System.out.println("과목: " + subject);
        }
    }
    
    //수강신청리스트
    public void applyList() {
    	System.out.println("아이디: " + id + " | 이름: " + name);
    	for(String subject : subjects) {
    		System.out.println("과목 : " + subject);
    	}
    }

    // 학생 정보 출력 메서드
    public void studentList() {
        System.out.println("아이디: " + id + " | 이름: " + name + " | 전화번호: " + phoneNumber + " | 학년: " + grade);
        viewSubjects(); // 과목 목록도 출력
    }
	
	

}
