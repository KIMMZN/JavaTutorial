package _18_Engish_Word;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class WordMge {
	
	WordMge() {
		
	}
	
	public void menu() {
		
		while(true) {
			System.out.println("1.단어입력");
			System.out.println("2.단어모두보기");
			System.out.println("3.단어검색");
			System.out.println("4.단어삭제");
			//Scanner in = new Scanner(System.in);
			//int sel = in.nextInt();
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int sel = Integer.parseInt(br.readLine());
				//String str = br.readLine();
				if(sel == 1) {
					System.out.println("1.단어입력");
					add();
				}else if(sel == 2) {
					System.out.println("2.단어모두보기");
					search();
					
				}else if(sel == 3) {
					System.out.println("3.단어검색");
					searchOne();
				}else if(sel == 4) {
					System.out.println("4.단어삭제");
					delete();
				}
				else {
					System.out.println("잘못된 접근");
				}
			}catch (Exception e) {
			     e.getStackTrace(); 
			 }	
			
			
		}
		
	}
	private void add() {
	
		System.out.println("단어를 입력하시오");
		//Scanner in = new Scanner(System.in);
		//String temp = in.nextLine();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			
			WordOne wordone = new WordOne();
			wordone.seteWord(str);
			String str1 = wordone.geteWord();
			
		    File file = new File("Output.txt"); 
		    FileReader file_reader = new FileReader(file); 
		    BufferedReader bufferedReader = new BufferedReader(file_reader); 
		    
		    while (true) {
		        String line = bufferedReader.readLine(); 
				if (line == null) {
					addtry(str1);
					break;
				}else {
					addplus(str1);
					
				}
				 bufferedReader.close();
		    }
		}catch (Exception e) {
	     e.getStackTrace(); // 예외 발생 시 오류 추적
		 }	
		
	}
	
	private void addtry(String temp) { // 첫 단어 입력
		try {
			File file = new File("Output.txt");
			FileWriter writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(temp+"\n");
			System.out.println("입력완료");
			//bufferedWriter.write(" my test");
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (Exception e) {
	            e.getStackTrace();
		}
		
	}
	
	private void addplus(String temp) { // 단어 추가입력
		
		try {
			File file = new File("Output.txt");
			FileReader file_reader = new FileReader(file); // 임시
			BufferedReader bufferedReader = new BufferedReader(file_reader); // 임시
			
			int search = 0;//서치 플래그
			String line;
			while((line = bufferedReader.readLine()) != null) {
				 if(temp.equals(line)) {
					 System.out.println("중복된 단어입니다");
					 search = 1;
					 break;
				 }
			}
			bufferedReader.close();
			
			if(search == 0) {
				FileWriter writer = new FileWriter(file, true); 
				BufferedWriter bufferedWriter = new BufferedWriter(writer);
				 bufferedWriter.write(temp+"\n");
				 System.out.println("입력완료");
				 bufferedWriter.flush();
				 bufferedWriter.close();
			}
			
			
		} catch (Exception e) {
		    e.getStackTrace();
		}
		
	}
	
	
	private void search() { // 단어 모두보기
		try {
		    File file = new File("Output.txt"); // 파일 객체 생성
		    FileReader file_reader = new FileReader(file); // FileReader는 파일로부터 텍스트를 읽기 위한 클래스
		    BufferedReader bufferedReader = new BufferedReader(file_reader); // BufferedReader는 성능 향상을 위해 사용
		    
		    while (true) {
		        String line = bufferedReader.readLine(); // 파일에서 한 줄씩 읽음
		        if (line == null) break; // 읽을 줄이 없으면 종료
		        System.out.println(line); // 읽은 줄을 콘솔에 출력
		    }
		    bufferedReader.close(); // 파일 닫기
		} catch (Exception e) {
		    e.getStackTrace(); // 예외 발생 시 오류 추적
		}
		
	}
	
	private void searchOne() { // 단어검색
		System.out.println("검색할 단어를 입력하시오");
		//Scanner in = new Scanner(System.in);
		//String temp = in.nextLine();
		
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			
		    File file = new File("Output.txt"); // 파일 객체 생성
		    FileReader file_reader = new FileReader(file); //
		    BufferedReader bufferedReader = new BufferedReader(file_reader);
		    
		    int search = 0;//서치
		    int ctn = 0; //순서
		    String line;
		    while ((line = bufferedReader.readLine()) != null) {
		     	ctn++;
		        if (line.equals(str)) {
		        	System.out.println(ctn+"번째 단어 :" + line); 
		        	search = 1;
		        	break; 
		        }
		    }
		    if(search == 0) {
		    	System.out.println("찾는 대상이 존재하지 않음");
		    }
		    bufferedReader.close(); 
		} catch (Exception e) {
		    e.getStackTrace(); 
		}
		
	}
	
	private void delete() {
			System.out.println("삭제할 단어를 입력하시오");
			//음 삭제할 방법이
			//Scanner in = new Scanner(System.in);
			//String temp = in.nextLine();
			
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			
		    File file = new File("Output.txt"); // 파일 객체 생성
		    FileReader file_reader = new FileReader(file); //
		    BufferedReader bufferedReader = new BufferedReader(file_reader);
		    
		    int search = 0;//서치
		    int ctn = 0; //순서
		    String line;
		    while ((line = bufferedReader.readLine()) != null) {
		     	ctn++;
		        if (line.equals(str)) {
		        	System.out.println(ctn+"번째 단어 :" + line); 
		        	search = 1;
		        	
		        	break; 
		        }
		    }
		    if(search == 0) {
		    	System.out.println("찾는 대상이 존재하지 않음");
		    }
		    bufferedReader.close(); 
		} catch (Exception e) {
		    e.getStackTrace(); 
		}
		
	}
	
	
	
	
}
