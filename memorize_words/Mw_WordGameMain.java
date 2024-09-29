package memorize_words;

import java.util.Scanner;

public class Mw_WordGameMain {
	
	Mw_WordGamePlay wgplay = new Mw_WordGamePlay();
	
	public void gameMenu() {
		
		//if(clientMg.findIdxOfIdPass(tempi, tempp) != -1) {
			
		//}else {
		//	System.out.println("아이디 / 비밀번호가 일치하지 않습니다");
			
		//}	
		
		//System.out.println("id를 입력하시오");
		//String tempi = in.nextLine();ㅂ
		//System.out.println("패스워드를 입력하시오");
		//String tempp = in.nextLine();
		
		while(true) {
			System.out.println("1.게임시작");
			System.out.println("2.점수확인");
			System.out.println("3.종료");
			Scanner in = new Scanner(System.in);
			int select = in.nextInt();
			in.nextLine();
			
			if (select ==1) {
				System.out.println("1.게임시작");
				wgplay.JavaDragon();
			}else if(select ==1) {
				System.out.println("2.점수확인");
			}else if(select ==2) {
				System.out.println("3.종료");
			}
		}
		
		
		
	}
}
