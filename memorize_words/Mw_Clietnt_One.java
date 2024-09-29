package memorize_words;

import java.util.Calendar;

public class Mw_Clietnt_One {

	//Calendar calendar = Calendar.getInstance();
	
	String id = null;
	String password = null;
	String name = null;
	String phonenumber = null;
	
	public void prt() { // 전체보기 메서드
		System.out.println("회원정보");
		System.out.println("아이디: " + id);
		System.out.println("이름 " + name);
		System.out.println("핸드폰번호 " + phonenumber);
		//System.out.println(calendar.get(Calendar.YEAR)) + "년 " + calendar.);
	}
	
	public void addId(String id) { // 아이디 등록 메서드
		this.id  = id;
		
	}
	public String getId() {    // 아이디 조회 메서드
    	 return id;
    }
	public void addName(String name) { // 이름 등록 메서드
		this.name = name;
		
	}
	public void addPassword(String password) { // 패스워드 등록 메서드
		this.password = password;
		
	}
	public String getPassword() { // 패스워드 조회 메서드
		return password;
	}
	
	public void addPhoneNumber(String phonenumber) { // 폰넘버 등록 메서드
		this.phonenumber = phonenumber;
		
	}
	
	public String getPhoneNumber() { // 폰넘버 조회 메서드
   	 			return phonenumber;
    }
	
    
	
	
	
	
}
