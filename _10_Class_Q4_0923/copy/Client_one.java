package _10_Class_Q4_0923.copy;

public class Client_one {
	
	 String id = null;
	 String name = null;
	
	public void info () { //void 는 return x
		System.out.println("회원정보");
		System.out.println(id);
		System.out.println(name);
	}
	
	public String getid() { // id리턴 메서드
		return id;
	}
	
	public String getname() { //name리턴 메서드
		return name;
	}
	
	public void setWordname(String newname) {
		
		name = newname;
	}
	
	
 
}
