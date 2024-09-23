package _10_Class_Q4_0923.copy;

import java.util.Scanner;

public class ClientEvent_Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("고객관리 프로그램 및 이벤트관리 프로그램");
		
		System.out.println("1.고객관리");
		System.out.println("2.이벤트관리");		
		System.out.println("번호를 입력하시오 >> ");
		int select = in.nextInt();
		in.nextLine();
		
		if(select == 1) {
			

			Client_m client = new Client_m();
		}
		
		
		
		
		

	}

}
