package _11_method;

public class TestMethod {
	//생성자는 눈에 안 보이지만 생략되어 있음
	//이름뒤에 마스킹을 해 주는 메서드 만들기
	// 호풀할 때 문자열로 마스킹 문자를 지정하면,
	// 이름뒤에 마스킹 문자를 연결하여 리턴한다.
	// 메서드명은 maskName
	
	String name = null;
	
	public String maskName1() { //받은 매개변수값을  maksing에 정의 string ***을 받아서 name+masking함.)
		String masking = "****";
		String maskingName = name+masking;
		return maskingName;
	}
	
	
	
	
	public String maskName(String masking) { //받은 매개변수값을  maksing에 정의 string ***을 받아서 name+masking함.)
		String maskingName = name+masking;
		return maskingName;
	}
	
	
	
	public String getName2(String pwd) {
		if(pwd.equals("1111")) {
			return name;
		}else {
			return null;
		}
	}
	
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}

	

}
