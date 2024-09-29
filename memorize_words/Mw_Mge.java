package memorize_words;

import java.util.ArrayList;
import java.util.Scanner;

public class Mw_Mge {
	ArrayList<Mw_One> wordList = new ArrayList<>();
	ArrayList<Mw_One> wrongAnswerList = new ArrayList<>();
	Mw_WordGameMain wordGame = null;
	
	
	Mw_Mge() {
		
		
		menu();
		
	}
	
	public void menu() {
		if (wordGame == null) {
			wordGame = new Mw_WordGameMain();
		}
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("단어암기장");
			System.out.println("1.테스트");
			System.out.println("2.단어추가");
			System.out.println("3.단어삭제");
			System.out.println("4.단어수정");
			System.out.println("5.전체보기");
			System.out.println("6.종료");
			System.out.println("7.자바드래곤");
			System.out.println("숫자를 입력하시오 >>");
			int select = in.nextInt();
			if(select == 1) {
				//System.out.println("1.테스트");
				testWords();
			}else if(select == 2) {
				//System.out.println("2.단어추가");
				addWord();
			}else if(select == 3) {
				//System.out.println("3.단어삭제");
				remove();
				
			}else if(select == 4) {
				System.out.println("4.단어수정");
				setWord();
				
				
			}else if(select == 5) {
				//System.out.println("5.전체보기");
				viewAll();
				
			}else if(select == 6) {
				System.out.println("6.종료");
				break;
			}else if(select ==7) {
				System.out.println("자바 드래곤");
				wordGame.gameMenu();
				
			}
		}
	}
	
	public void addWord() {
		Scanner in = new Scanner(System.in);
		Mw_One wordOne = new Mw_One();
		System.out.println("영어 단어를 입력하시오");
		//in.nextLine();
		String tempe = in.nextLine();
		
		if(ewordCheck(tempe)==true) { // 단어 중복확인
			System.out.println("중복입니다");
		}else {
			wordOne.addEword(tempe);
			System.out.println("한글 뜻을 입력하시오");			
			String tempk = in.nextLine();			
			wordOne.addKword(tempk);	
			wordList.add(wordOne);
			System.out.println("단어가 입력되었습니다");
			
			
		}
			
		
	}
	
	 public boolean ewordCheck(String check) { // 영어단어 중복체크 메서드
		for(int i =0; i<wordList.size(); i++) {	
			if(check.equals(wordList.get(i).Eword)) {
				return true; // 트루 라면 중복.
			}
		}
		 return false;
	}
	 
	 public void viewAll() { //전체보기 메서드
			for(Mw_One w : wordList) {
				w.prt();
			}
	 }
	 
	 public void remove() { //삭제 메서드
		 Scanner in = new Scanner(System.in);
		 System.out.println("삭제할 영어 단어를 입력하시오");
		 //in.nextLine();
		 String tempe = in.nextLine();
		 int removei = findidx(tempe);
		 if(removei != -1) {
			 wordList.remove(removei);
			 System.out.println(removei+1 + "번 "+tempe + " 이/가 삭제 되었습니다");
		 }
		 
	 }
	 
	 public int findidx(String temp) { //중복이면 i값 리턴 메서드
		 for(int i =0; i<wordList.size(); i ++) {
			 if(wordList.get(i).Eword.equals(temp)) {
				 return i;
			 }
		 }
		 return -1;
	 }
	 
	 public void setWord () { // 수정 메서드
		 Scanner in = new Scanner(System.in);
		 System.out.println("찾을 영어 단어를 입력하시오");
		 //in.nextLine();
		 String tempe = in.nextLine();
		 int setWordi = findidx(tempe);
		 //wordList.get(setWordi);
		 		 
			 if(setWordi != -1) {
				 System.out.println("단어를 찾았습니다");
				 System.out.println(wordList.get(setWordi).Eword + " "+ wordList.get(setWordi).Kword);
				 System.out.println("수정하고 싶은 단어를 입력하시오 ( 1.영어단어 수정 / 2.한글 단어 수정 )");
				 System.out.println("숫자를 입력하시오 >>");
				 
				 int select = in.nextInt();
				 in.nextLine();
				 
				 if(select == 1) {//영어 수정
					 System.out.println("수정할 영어 단어를 입력하시오");
					 String tempee = in.nextLine();
					 wordList.get(setWordi).Eword = tempee;
					 System.out.println("수정 되었습니다");
					 
				 }else if(select == 2) { // 한글 수정
					 System.out.println("수정할 한글 단어를 입력하시오");
					 String tempee = in.nextLine();
					 wordList.get(setWordi).Kword = tempee;
					 System.out.println("수정 되었습니다");
					 
				 }else {
					 System.out.println("잘못된 접근");
				 }
			 
			 
		     }
			 
			 if(setWordi == -1) {
				 System.out.println("찾는 단어가 없습니다");
				 return;
			 }
		 
		 
	 }
	 
	 public void testWords() { //단어 테스트 메서드
			 if(wordList.isEmpty() != true) {
				 
				 Scanner in = new Scanner(System.in);
				 
				 int ctcnt =0;
				 System.out.println("한글로 단어의 뜻을 입력하시오");
				 
				 for(Mw_One word : wordList) {
					 System.out.println(word.Eword + "의 뜻: ");
					 String tempp = in.nextLine();
					 
					 if (tempp.equals(word.Kword)) {
						 System.out.println("정답!");
						 ctcnt++;
					 }else {
						 System.out.println("오답");
						 //생각하자. i가 필요하다. 아니면 주소값을 또다른 리스트에 저장하자
						 wrongAnswerList.add(word);
						 
					 }
				 }
				 
				 System.out.println("정답은 총 " + ctcnt + " 개 입니다" );
				 System.out.println("오답은" +" " + wrongAnswerList.size() + "개 입니다");
				 
				 if(wrongAnswerList.isEmpty() != true) {
					 wrongAnswer();
				 }
			 }else {
				 return;
			 }
			 
	}
	 
	 public void wrongAnswer() { //틀린정답 재확인 메서드
		 Scanner in = new Scanner(System.in);
		 	while(true) {
		 		 System.out.println("오답 문제에 다시 도전하겠습니까 (1.Yes / 2. No) ");
				 System.out.println("숫자를 선택하시오 >>");
				 //이부분에 들어가야 될듯//
				 int select = in.nextInt();
				 in.nextLine();
				 
			     if(select == 1) {
				      for(int i=0; i < wrongAnswerList.size(); i++) {
				    	  
						  System.out.println(wrongAnswerList.get(i).Eword + " 의 뜻 ");
						  String temp1 = in.nextLine();
						  
						  if(wrongAnswerList.get(i).Kword.equals(temp1)) {
							 System.out.println("정답!");
							 wrongAnswerList.remove(i);
						 
				          }else {
				        	  System.out.println("오답!");
				          }
				        	  
				       }
				      
				      if(wrongAnswerList.isEmpty()) {
				    	  System.out.println("오답을 모두 맞혔습니다");
				    	  break;
				      }
					 
			      }else if(select == 2) {
			    	  break;
			      }else {
			    	  System.out.println("잘못된 접근");
			      }
	         }	 
			 
	 }
		
	 
	 
	 public int kwordCheck (String temp1) { //한글 답 확인 메서드
		 
		 for(int i = 0; i<wordList.size(); i++) {
			 if (temp1.equals(wordList.get(i).Kword)) {
				 return i;
			 }
		 }
		 
		 return -1;
	 }
	 
	
	 
	 
	
	

}
