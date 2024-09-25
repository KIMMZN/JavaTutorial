package _13_ArrayList_quiz_01;

import java.util.ArrayList;
import java.util.Scanner;

import _10_Class_Q4_0923_repack.MemberOne;

public class Word_m {
	ArrayList<Word_one> wlist = new ArrayList<>();
	 
	
	Word_m() {
		
		menu();
		
		
	}
	
	
	public void menu() {
		
		while(true) {
			System.out.println("JavaWord");
			System.out.println("1.등록");
			System.out.println("2.전체조회");
			System.out.println("3.삭제");
			System.out.println("4.수정");
			System.out.println("5.종료");
			System.out.println("번호를 입력하시오 >>>");
			
			Scanner in = new Scanner(System.in);
			int sellect = in.nextInt();
			in.nextLine();
			
			if(sellect == 1) {
				//System.out.println("등록");
				add();
			}else if(sellect == 2) {
				//System.out.println("전체조회");
				vAll();
			}else if(sellect == 3) {
				//System.out.println("삭제");
				remove();
			}else if(sellect == 4) {
				//System.out.println("수정");
				edit();
			}else if(sellect == 5) {
				//System.out.println("종료");
				break;
			}
		}				
	}
	
	public void add() { // 등록 메서드
		//Word_one wordOne = new Word_one();
		
		System.out.println("등록할 단어를 입력하시오");
		System.out.println("형태는 : 영어단어/한글뜻");
		
		Scanner in = new Scanner(System.in);
		String eng = in.nextLine();
		Word_one wordOne = new Word_one();
		
		wordOne.eWord = eng;
		
		wlist.add(wordOne);
		
		
	}
	
	public void vAll() { // 전체보기 메서드
		for(int i=0; i<wlist.size(); i++) {
			wlist.get(i).info();
		}
		
	}
	
	public void remove() { //삭제 메서드
		
		System.out.println("영어 단어를 입력하시오");
		Scanner in = new Scanner(System.in);
		String temp = in.nextLine();
		
		
		// 
		for(int i =0; i<wlist.size(); i++) {
			if(wlist.get(i).eWord.contains(temp)) { 
					
				if(temp == wlist.get(i).eWord.substring(wlist.get(i).eWord.indexOf(temp), 
						wlist.get(i).eWord.indexOf("/"))) {
					
					wlist.remove(i);
					
					//if(wlist.get(i).eWord.contains(temp)) {
					
					// sj.substring(sj.indexOf(temp), sj.indexOf("/"))
					
     			}
			}
		}
		
	}
	
	public void edit() { //수정 메서드
		
		System.out.println("영어 단어를 입력하시오");
		Scanner in = new Scanner(System.in);
		String temp = in.nextLine();
		
		// title.contains(w)
		for(int i =0; i<wlist.size(); i++) {
			if(wlist.get(i).eWord.contains(temp)) {
				System.out.println("형태는 : 영어단어/한글뜻");
				String temp1 = in.nextLine();
				wlist.get(i).eWord = temp1;
			}
			
		}
		
	}
	
	
	
	
}
