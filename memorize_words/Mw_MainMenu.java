package memorize_words;

import java.util.Scanner;

public class Mw_MainMenu {

	Mw_Mge mw_mge = null;
	Mw_Client_Mg mw_client_mg = null;
	
	
	Mw_MainMenu () {
		
		
		if(mw_mge == null) {
			mw_mge = new Mw_Mge();
		}
		
		if(mw_client_mg == null) {
			mw_client_mg = new Mw_Client_Mg();
		}
		
		mw_mge.clientMg = mw_client_mg;
		mw_client_mg.mwMge = mw_mge;    
		
		menu();
	}
	
	public void menu() { //메인메뉴,메뉴정의
		
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("Memorize Words");
			System.out.println("1.회원정보등록");
			System.out.println("2.단어장실행");
			System.out.println("3.프로그램종료");
			System.out.println(" 숫자를 입력하시오 >>");
			
			int select = in.nextInt();
			in.nextLine();			
			if(select==1) {
				mw_client_mg.clientMenu();
			}else if(select==2) {
				 mw_mge.menu();
			}else if(select ==3) {
				break; //
			}
	     }	
	}
	
	
	
	
	
	
}
