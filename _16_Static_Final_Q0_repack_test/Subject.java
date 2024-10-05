package _16_Static_Final_Q0_repack_test;

public class Subject {
	private String subjectName = null;
	private String subjectClass = null;
	private String subjectProf = null;
	
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectClass() {
		return subjectClass;
	}
	public void setSubjectClass(String subjectClass) {
		this.subjectClass = subjectClass;
	}
	public String getSubjectProf() {
		return subjectProf;
	}
	public void setSubjectProf(String subjectProf) {
		this.subjectProf = subjectProf;
	}
	public void info() {
		System.out.println("이름: " + subjectName + "  클래스: " + subjectClass + "  담당교수: " + subjectProf);
	}
	
	
	

}
