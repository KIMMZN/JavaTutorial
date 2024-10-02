package _16_Static_Final;

public class Main {
	     //(공용변수)   
 // 접근제어자 정적변수 리턴타입 메서드명  매개변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = Thread.currentThread().getName();
		// 스레드는 코드를 실행한다.
		//현재 코드를 실행하는 스레드의 여러 정보 중
		//스레드의 이름을 가져오라.
		System.out.println(name+"스레드가 1초 뒤에 시작합니다");
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e ) {
			e.printStackTrace();
		}
		// static변수는 공용변수. 위치는 method area
		// 모든 스레드가 공용해서 사용가능 >> 즉, 변수값접근가능
		// 객체를 만들지 않고 클래스명과 변수또는 메서드명으로 접근
		String a = MemberADM.companyName;
		System.out.println(a);
		System.out.println(MemberADM.companyName);
		MemberADM.prt();
		MemberADM.companyName = "h0man";
		System.out.println(MemberADM.companyName);
		
		MemberADM mm = new MemberADM();
		mm.companyName = "abc";
		mm.name = "a";
		MemberADM mmm = new MemberADM();
		mmm.name = "b";
		mmm.companyName = "kkk";
		System.out.println(mm.name);
		System.out.println(mm.companyName);
		
		//MemberADM.teamName = "kkk";
		
		
		
		MemberADM m = new MemberADM();
		
		/* 새로운 스레드를 하나 만들어서 멀티스레드로 운용이 가능;
		Thread t1 = new Thread(); 
		t1.setName(("task1_thread"));
		String tname = t1.getName();
		System.out.println("새로만든 스레드 이름은 " + tname);
		*/
		

	}

}
