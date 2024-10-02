package _16_Static_Final_Q0;

public class Subject_one {
	
	private String subjectName = null;
	private String classroom = null;
	private String profInCharge = null;
	
	
	public String getSubjectName() { // 과목명조회
		return subjectName;
	}
	public void setSubjectName(String subjectName) { // 과목명셋
		this.subjectName = subjectName;
	}
	
	public String getClassroom() { // 강의실 조회
		return classroom;
	}
	public void setClassroom(String classroom) { // 강의실 셋
		this.classroom = classroom;
	}
	
	public String getProfInCharge() { // 담당교수 조회
		return profInCharge;
	}
	public void setProfInCharge(String profInCharge) { // 담당교수 셋
		this.profInCharge = profInCharge;
	}
	
	public void list() {
		System.out.println("과목명: "+ subjectName + "  |  강의실 : " + classroom + "  |담당교수 : +" + profInCharge);
		
	}
	
	
	
	
	
	
}
