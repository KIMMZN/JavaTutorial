package _10_Class_Q2;

public class Train_info {
	
	String number = null;
	//private String number = null; // 은닉화. 하면 다큰 클래스에서 접근불가. 호출하고 리턴 받아야만 사용가능.
	String time = null;
	
	public void info () { //void 는 return x
		
		System.out.println("---기차 정보---");
		System.out.println(number);
		System.out.println(time);
	}
	
	public String getNumber() { 
		return number;			//호출하면 값을리턴함
	}
	
}
