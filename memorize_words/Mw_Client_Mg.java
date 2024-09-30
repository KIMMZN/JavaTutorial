package memorize_words;

import java.util.ArrayList;
import java.util.Scanner;

public class Mw_Client_Mg {
	
	ArrayList<Mw_Clietnt_One> clientList = new ArrayList<>();
	Mw_Mge mwMge = null;
	//Mw_WordGamePlay wgplay = new Mw_WordGamePlay();
	
	
	public void clientMenu() {
		
		
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("회원정보관리");
			System.out.println("1.등록");
			System.out.println("2.수정");
			System.out.println("3.삭제");
			System.out.println("4.전체보기");
			System.out.println("5.돌아가기");
			System.out.println("6.단어장실행");
			System.out.println("숫자를 입력하시오 >>");
			int select = in.nextInt();
			if(select == 1) {
				//System.out.println("1.id 등록");
				addId();
			}else if(select == 2) {
				//System.out.println("2.회원정보 수정");
				editPassWord();
			}
			else if(select == 3) {
				//System.out.println("3.id 삭제");
				remove();
			}else if(select == 4) {
				//System.out.println("4.전체보기");
				viewAll();
				
				
			}else if(select == 5) {
				System.out.println("돌아가기");
				break;
			}else if(select == 6) {
				mwMge.menu();
			}
		}
	}
	
	public void addId() { // id 추가 메서드
		Scanner in = new Scanner(System.in);
		Mw_Clietnt_One clientOne = new Mw_Clietnt_One();
		System.out.println("id를 입력하시오");
		//in.nextLine();
		String tempe = in.nextLine();
		
		if(idCheck(tempe)==true) { // id 중복확인
			System.out.println("중복입니다");
		}else {
			
			clientOne.addId(tempe);
			
			System.out.println("패스워드를 입력하시오");
			String pass = in.nextLine();
			clientOne.addPassword(pass);
			
			System.out.println("이름을 입력하시오");
			String name = in.nextLine();
			clientOne.addName(name);
			
			
			System.out.println("전화번호를 입력하시오");
			String pNumber = in.nextLine();
			
			if(phoneCheck(pNumber)==true) { // 폰넘버 중복확인
				System.out.println("중복된 핸드폰번호");
				return;
			}else {
				clientOne.addPhoneNumber(pNumber);
				clientList.add(clientOne);
				System.out.println("회원정보 등록 완료");
				//
				//if(clientList.get(0).joinDate == null) {
					
				//}
			}
			
	
			
		}
	}
	
	 public boolean idCheck(String check) { // id 중복체크 메서드
			for(int i =0; i<clientList.size(); i++) {	
				if(check.equals(clientList.get(i).getId())) {
					return true; // 트루 라면 중복.
				}
			}
			 return false;
	 }
	 
	 public boolean phoneCheck(String check) { // 폰 넘버 중복체크 메서드
			for(int i =0; i<clientList.size(); i++) {	
				if(check.equals(clientList.get(i).getPhoneNumber())) {
					return true; // 트루 라면 중복.
				}
			}
			 return false;
	 }	 
	 
	 public void viewAll() { //전체보기 메서드
			for(Mw_Clietnt_One vll : clientList) {
				vll.prt();
			}
	 } 
	 
	 public void editPassWord() { // 수정 메서드
		 Scanner in = new Scanner(System.in);
		 System.out.println("아이디를 입력하시오");
		 //in.nextLine();
		 String tempe = in.nextLine();
		 System.out.println("패스워드를 입력하시오");
		 String tempPass = in.nextLine();
		 
		 int setPassi = findIdxOfIdPass(tempe,tempPass);
			 if(setPassi != -1) {
				 
				 System.out.println("수정 가능한 정보 ( 1.아이디 수정 / 2.패스워드 수정 )");
				 System.out.println("숫자를 입력하시오 >>");
				 
				 int select = in.nextInt();
				 in.nextLine();
				 
				 if(select == 1) {//아이디수정
					 System.out.println("현재id: " + clientList.get(setPassi).getId());
					 System.out.println("수정할 아이디를 입력하시오");
					 String tempee = in.nextLine();
					 int tmepId = findidx(tempee);
					 if(tmepId != -1) {// 수정할 이이디가 중복인지 확인
						 clientList.get(setPassi).addId(tempee);					 
						 System.out.println("수정 되었습니다");
					 }
					 
				 }else if(select == 2) { //패스워드 수정
					 System.out.println("수정할 패스워드를 입력하시오");
					 
					 String tempee = in.nextLine();
					 clientList.get(setPassi).addPassword(tempee);
					 System.out.println("수정 되었습니다");
					 
				 }else {
					 System.out.println("잘못된 접근");
				 }
		     } else {
      			 System.out.println("정보 없음");
				 return;
			 }
		 
	 }
	 //
	 
	 public void remove() { //id삭제 메서드
		 Scanner in = new Scanner(System.in);
		 System.out.println("id를 입력하시오");
		 //in.nextLine();
		 String tempe = in.nextLine();
		 int removei = findidx(tempe);
		 
		 if(removei != -1) {
			 clientList.remove(removei);
			 System.out.println("id "+tempe + " 이/가 삭제 되었습니다");
		 }
		 
	 }
	 	 	 	 
	 public int findidx(String temp) { //중복이면 i값 리턴 메서드
		 for(int i =0; i<clientList.size(); i ++) {
			 if(temp.equals(clientList.get(i).getId())) {
				 return i;
			 }
		 }
		 return -1;
	 }
	 
	 public int findIdxOfIdPass(String tId, String tPass ) { //아이디,비밀번호 중복 확인 메서드
		 for(int i =0; i<clientList.size(); i ++) {
			 if(tId.equals(clientList.get(i).getId())) {
				 if(tPass.equals(clientList.get(i).getPassword())) {
					 return i;
				 }
			 }
		 }
		 return -1;
	 }
	
	
	
	
}
