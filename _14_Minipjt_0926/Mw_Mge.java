package _14_Minipjt_0926;

import java.util.ArrayList;
import java.util.Scanner;

public class Mw_Mge {
	ArrayList<Mw_One> mwlist = new ArrayList<>();
	Scanner in = new Scanner(System.in);
	
	Mw_Mge() {
		
		menu();
		
	}
	
	public void menu() {
		
		while(true) {
			System.out.println("단어암기장");
			System.out.println("1.테스트");
			System.out.println("2.단어추가");
			System.out.println("3.단어삭제");
			System.out.println("4.단어수정");
			System.out.println("5.전체보기");
			System.out.println("6.종료");
			System.out.println("숫자를 입력하시오 >>");
			int select = in.nextInt();
			if(select == 1) {
				//System.out.println("1.테스트");
				test();
			}else if(select == 2) {
				//System.out.println("2.단어추가");
				addWord();
			}else if(select == 3) {
				//System.out.println("3.단어삭제");
				remove();
				
			}else if(select == 4) {
				System.out.println("4.단어수정");
				set();
				
				
			}else if(select == 5) {
				//System.out.println("5.전체보기");
				viewAll();
				
			}else if(select == 6) {
				System.out.println("6.종료");
				break;
			}
		}
	}
	
	public void addWord() {
		Mw_One wordOne = new Mw_One();
		System.out.println("영어 단어를 입력하시오");
		in.nextLine();
		String tempe = in.nextLine();
		
		if(jbcheck(tempe)==true) { // 단어 중복확인
			System.out.println("중복입니다");
		}else {
			wordOne.addEword(tempe);
			System.out.println("한글 뜻을 입력하시오");			
			String tempk = in.nextLine();			
			wordOne.addKword(tempk);	
			mwlist.add(wordOne);
			System.out.println("단어가 입력되었습니다");
			
		}
			
		
	}
	
	 public boolean jbcheck(String check) { // 영어단어 중복체크 메서드
		for(int i =0; i<mwlist.size(); i++) {	
			if(check.equals(mwlist.get(i).Eword)) {
				return true; // 트루 라면 중복.
			}
		}
		 return false;
	}
	 
	 public void viewAll() { //전체보기 메서드
			for(Mw_One w : mwlist) {
				w.prt();
			}
	 }
	 
	 public void remove() { //삭제 메서드
		 System.out.println("삭제할 영어 단어를 입력하시오");
		 in.nextLine();
		 String tempe = in.nextLine();
		 int removei = findidx(tempe);
		 if(removei != -1) {
			 mwlist.remove(removei);
			 System.out.println(removei+1 + "번 "+tempe + " 이/가 삭제 되었습니다");
		 }
		 
	 }
	 
	 public int findidx(String temp) { //중복이면 i값 리턴 메서드
		 for(int i =0; i<mwlist.size(); i ++) {
			 if(mwlist.get(i).Eword.equals(temp)) {
				 return i;
			 }
		 }
		 return -1;
	 }
	 
	 public void set () { // 수정 메서드
		 System.out.println("찾을 영어 단어를 입력하시오");
		 in.nextLine();
		 String tempe = in.nextLine();
		 int seti = findidx(tempe);
		 //mwlist.get(seti);
		 		 
			 if(seti != -1) {
				 System.out.println("단어를 찾았습니다");
				 System.out.println(mwlist.get(seti).Eword + " "+ mwlist.get(seti).Kword);
				 System.out.println("1. 영어 단어 수정");
				 System.out.println("2. 한글 단어 수정");
				 System.out.println("숫자를 입력하시오 >>");
				 
				 int select = in.nextInt();
				 in.nextLine();
				 
				 if(select == 1) {//영어 수정
					 System.out.println("수정할 영어 단어를 입력하시오");
					 String tempee = in.nextLine();
					 mwlist.get(seti).Eword = tempee;
					 System.out.println("수정 되었습니다");
					 
				 }else if(select == 2) { // 한글 수정
					 System.out.println("수정할 영어 단어를 입력하시오");
					 String tempee = in.nextLine();
					 mwlist.get(seti).Kword = tempee;
					 System.out.println("수정 되었습니다");
					 
				 }else {
					 System.out.println("잘못된 접근");
				 }
			 
			 
		     }
			 
			 if(seti == -1) {
				 System.out.println("찾는 단어가 없습니다");
				 return;
			 }
		 
		 
	 }
	 
	 public void test() {
		 Scanner in = new Scanner(System.in);
		 int cnt =0;
		 int wcntnum =0;
		
		 ArrayList wrlist = new ArrayList<>();
		 System.out.println("한글로 단어의 뜻을 입력하시오");
		 
		 for(int i =0; i< mwlist.size(); i++) {
			 
			 
			 System.out.println(mwlist.get(i).Eword);
			 String tempp = in.nextLine();
			 
			 if (tempp.equals(mwlist.get(i).Kword)) {
				 System.out.println("정답");
				 cnt++;
			 }else {
				 System.out.println("오답");
				 wrlist.add(mwlist.get(i));
				 //wrlist.add(i);
				 wcntnum++;
			 }
		 }
		 
		 System.out.println("정답은 총 " + cnt + " 개 입니다" );
		 System.out.println("오답은" +" " + wcntnum + "개 입니다");
		 
		 if(wcntnum >= 1) {
			
			 
			 System.out.println("오답 문제에 다시 도전하겠습니까");
			 System.out.println("1.yes");
			 System.out.println("2.no");
			 System.out.println("숫자를 선택하시오 >>");
			 
			 int select = in.nextInt();
			 in.nextLine();
			 
			 if(select == 1) {
				 for(int i=0; i < mwlist.size(); i++) {
					 wrlist.get(i);
					 
					 
				 }
			 }
			 
			 
			 
			 
		 }
		
	 }
	 
	 public int testk (String temp1) { //한글 답 확인 메서드
		 
		 for(int i = 0; i<mwlist.size(); i++) {
			 if (temp1.equals(mwlist.get(i).Kword)) {
				 return i;
			 }
		 }
		 
		 return -1;
	 }
	 
	
	 
	 
	
	

}
