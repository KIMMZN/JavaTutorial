package _16_Static_Final_Q0_repack_test;

public class Student {
	private String id = null;
	
	
	private String name = null;
	private String pnumber = null;
	private int grade = 0;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	//public String getId() {
	//	return id;
	//}
	
	//public void setId(String id) {
	//	this.id = id;
	//}
	
	//public void setId(String id) {
		// TODO Auto-generated method stub
	//	this.id = id;
		
	//}
	
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
