package _15_접근제어자_02;

public class MemberOne {
	String name=null; // 접근제어자 입력하지 않으면 "default", default는 같은 패키지 않에서만 접근 허용
	
	public void prt() {
		System.out.println(name);
	}
	
	public void setName(String n) {
		if(chkName(n)) {
			this.name=n; // true; name에 매개변수 n갑 저장
		}else {
			this.name = "err"; //false, name에 "err"값 저장
		}
		System.out.println(this.name);
		
	}
	
	private boolean chkName(String n) {
		if(n.charAt(0)=='4') {
			return false; // 첫글자가 4라면 리턴 false
		}
		return true; // 아니라면 return true;
	}

}
