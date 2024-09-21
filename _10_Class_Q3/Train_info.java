package _10_Class_Q3;

public class Train_info {
	
	Train_mn[] tList = new Train_mn[5];
	
	int number = 0;
	int time = 0;
	String type = null;
	String repair = null;
	
	public void info () {
		
		System.out.println("---기차 정보---");		
		System.out.println("기차번호 " + number);
		System.out.println("기차종류 " + type );
		System.out.println("도착시간 " + time);
		
	}
	
	public void infoR () {
		System.out.println("---수리가 필요한 기차---");		
		System.out.println("기차번호 " + number);
		System.out.println("상태 " + repair);
	}
	
	public void pan () { //전광판
	
		System.out.println("기차번호 :" + number + " 기차종류 :" + type + " 도착시간 :" + time );
		
		
	}
	
	
	public void typeNumber() {
		 if(number == 1111 || number == 3333) {
				type = "무궁화호";
				
			}else if (number == 2222 || number == 44444 ) {
				type = "새마을호*";
			}else {
				type = "알수업음";
				
			}
	
	}
	
	
}
