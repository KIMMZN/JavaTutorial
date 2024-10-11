package _24_Gui_Swing_SERVICE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import _24_Gui_Swing_DAO.WordDAO;
import _24_Gui_Swing_DTO.WordDTO;

public class WordService {
	
	WordDAO worddao = null;
	
	public WordService() {
		init();
		menu();
		
	}
	
	private void init() { //init;
		if(worddao == null) {
			worddao = worddao.getInstance();
		}
	}
	
	private void menu() {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("1.등록 2.삭제 3.수정 4.전체보기 5.검색 6.종료");
			int selnum = in.nextInt();
			in.nextLine();
			switch(selnum) {
				case 1: wordAdd(); break;
				//case 2: ideaDel(); break;
				case 3: wordmod(); break;
				case 4: wordList(); break;
				//case 5: ideaSearch(); break;
				case 6:	flag = false; break;
			}
		}
	}
	
	private void wordAdd() {
		System.out.println("단어를 등록하시오");
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("한글단어를 입력");
		String kword = in.nextLine();

		System.out.println("영어 단어를 입력");
		String eword = in.nextLine();
		
		WordDTO worddto = new WordDTO();
		
		worddto.setKword(kword);
		worddto.setEword(eword);
		
		
		worddao.insert(worddto);
	}
	private void wordList() { //전체보기
		ArrayList<WordDTO> wlist = worddao.selectAll();
		for(WordDTO t : wlist ) {
			System.out.println(t.toString());
		}
	}
	private void wordmod() {
		Scanner in = new Scanner(System.in);
		wordTitleList();
		System.out.println("수정할 번호를 입력하시오");
		int modnum = in.nextInt();
		in.nextLine();
		WordDTO worddto = worddao.selectOne(modnum);
		System.out.println("현재정보");
		System.out.println("한글단어수정하세요");
		String kword = in.nextLine();
		worddto.setKword(kword);
		System.out.println("영어단어수정하세요");
		String eword = in.nextLine();
		worddto.setEword(eword);
		worddao.update(worddto);
	}
	private void wordTitleList() { // 숫자 타이틀
		ArrayList<WordDTO> wlist = worddao.selectAll();
		for(WordDTO t : wlist) {
			System.out.println(t.getNum() + " : "+t.getEword() + "  "+ t.getKword());
		}
			
	}
	
	
	
	
	
	

}
