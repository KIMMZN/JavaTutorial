package memorize_words;

import java.util.Scanner;

public class Mw_WordGameMain {
	
	Mw_WordGamePlay wgplay = null;
	//Mw_WordGamePlay wgplay = new Mw_WordGamePlay();
	Mw_Client_Mg clientmg = null;
	String tempi = null;
	
	
	public void gameMenu() {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("id를 입력하시오");
		tempi = in.nextLine();
		System.out.println("패스워드를 입력하시오");
		String tempp = in.nextLine();
		
		if(clientmg.findIdxOfIdPass(tempi, tempp) != -1) {
			//clientmg.
			String idtemp = tempi;
			while(true) {
				System.out.println("1.게임시작");
				System.out.println("2.점수확인");
				System.out.println("3.뒤로가기");
				//Scanner in = new Scanner(System.in);
				int select = in.nextInt();
				in.nextLine();
				if (select ==1) {
					System.out.println("1.게임시작");
					wgplay.JavaDragon();
				}else if(select ==2) {
					//System.out.println("2.점수확인");
					System.out.println("아이디: " + tempi);
					wgplay.ScoreInfo();
				}else if(select ==3) {
					System.out.println("3.뒤로가기");
				}
			}
		}else {
			System.out.println("아이디 / 비밀번호가 일치하지 않습니다");
		}
	
		
		
		
		
	}
}
