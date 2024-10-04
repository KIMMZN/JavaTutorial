package _18_Engish_Word;

import java.util.Scanner;

public class MainMenu {
	WordMge wordmge = null;

	
	MainMenu() {
		init();
		while(true) {
			menu();
			
			Scanner in = new Scanner(System.in);
			int sel = in.nextInt();
			in.nextLine();
			if(sel == 1) {
				wordmge.menu();
			}else {
				System.out.println("잘못된 접근");
			}
		}
	}
	
	private void menu() {
		System.out.println("영어단어장");
		System.out.println("1.영어단어입력");
	}
	
	private void init() {
		if(wordmge == null) {
			wordmge = new WordMge();
		}
	}
	
	
}
