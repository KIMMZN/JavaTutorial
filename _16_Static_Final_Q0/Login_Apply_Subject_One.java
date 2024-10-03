package _16_Static_Final_Q0;

public class Login_Apply_Subject_One {
	
	private String id = null;
	private String subject = null;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setSubjectId(String subject, String id) { // 과목 입력시 id도 셋 
		this.subject = subject;
		this.id = id;
	}
	
	public void subjectInfo() { // 신청한과목정보
		System.out.println("신청한 과목 : " + subject );
	}
	

}
