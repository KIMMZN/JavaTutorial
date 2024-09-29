package memorize_words;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Mw_WordGamePlay {	
	ArrayList<Mw_WordGameCharcater> chlist = new ArrayList<>();
	ArrayList<String> typelist = new ArrayList<>();
	ArrayList<Mw_WordGameOne> wordglist = new ArrayList<>();
	//ArrayList<Mw_WordGameOne> dupWordglist = new ArrayList<>();
	Mw_Client_Mg mgemge = null;
	public String dEvaluation;
	
	public int ctn = 0;  // 맞힌 문제 수를 저장할 변수
	private boolean prologue = false;  // 프롤로그 출력 여부를 확인하는 변수
    
    public int getCtn() {
        return ctn;
    }
    
	
	
	public void JavaDragon() {
		
		while(true) {
			Mw_WordGameCharcater chOne = new Mw_WordGameCharcater();
			Scanner in = new Scanner(System.in);
			System.out.println("진행하시겠습니까?    1.Yes / 2.No");
			int temp = in.nextInt();
			in.nextLine();
			
			if(temp == 1) {
				System.out.println("나의 이름은?");
				String name = in.nextLine();			
				chOne.setNameGradeHealth(name);
				chlist.add(chOne);
				
				String point = ".";		
				delay(point);
				typeSentences(chOne);
					
			}else if (temp == 2) {
				System.out.println("돌아가기");
				break;
				
			}
		}
	}
	
	
	public void delay (String delay) { // . 시간초 딜레이 메서드
		
		try {			
		      for (int i = 0; i < 3; i++) {	    	  
		    	  System.out.println(delay);
		          TimeUnit.SECONDS.sleep(1);		        
		      }
		    } catch (Exception e) {
		      System.out.println(e);
		    }
	}
	public void addText() {
		typelist.add("여기는 자바력이 세상을 좌지우지하는 세계.. (ENTER키를 입력하시오)");
		typelist.add("???: 오늘 하루 수고하셨습니다. ");
		typelist.add("아 .. 오늘 하루도 끝났구나 ...");
		typelist.add("자바 학원을 다닌지 벌써 며칠째인데 ..");
		typelist.add("하나도 이해가 안된다 ... 휴..");
		typelist.add("후 .. ");
		typelist.add("터벅 터벅 ...");
		typelist.add("터벅 터벅 ...");
		typelist.add("빨리 집에가서 쉬자 ..");
		typelist.add("오늘 하루종일 집중하느라 너무 힘들었다 .. 하..");
		typelist.add("???: 꺄 ~~~~~~~ 악 !");
		typelist.add("???: 사람살려 ~~~~");
		typelist.add("  _______\r\n"
				+ "    /       \\\r\n"
				+ "   /  O   O  \\\r\n"
				+ "  |     _     |\r\n"
				+ "  |    (_)    |   \"헉!! 무슨 소리지?\"\r\n"
				+ "   \\         /     /\r\n"
				+ "    \\       /     /\r\n"
				+ "     \\____ /   \r\n"
				+ "       |  |      \r\n"
				+ "      /|  |\\     \r\n"
				+ "     / |  | \\    \r\n"
				+ "    /  |  |  \\   \r\n"
				+ "   /   |  |   \\  \r\n"
				+ "  /    |  |    \\ \r\n"
				+ " /     |  |     \\\r\n"
				+ "/_____/    \\_____\\");
		
		typelist.add("!!! 학원 근처 골목길에서 무슨 소리? 가 들리는듯하다");
		typelist.add("거기 무슨일 있나요 ? 무슨일이죠 ?");
		typelist.add("앗 ?");
		typelist.add("크어어어어어어엉");
		typelist.add("앗 저것은 ?");
		typelist.add("???: 나는 전설의 드래곤, 자바 드래곤이다");
		typelist.add("자바드래곤: 100000년 산 이몸을 노리고 온것인가?");
		typelist.add("자바드래곤: 아니면 나에게 먹힐 인간을 구하러 온것인가 ?");
		
	}
	
	
	
	public void typeSentences(Mw_WordGameCharcater chOne) {
		Scanner in = new Scanner(System.in);
		if(prologue == false) {
			addText();
			prologue = true;
			try {	
				for(int i =0; i<typelist.size(); i++) {
					chOne.CharcterInfo();
					System.out.println(typelist.get(i));
					String temp = in.nextLine();
					// TimeUnit.SECONDS.sleep(2);
				}   
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		
		
		//System.out.println("");
		
		
		System.out.println("사람을 구하기위해  100000년산 자바드래곤과 싸우겠습니까?");
		System.out.println("1. Yes / 2. No");
		int temp = in.nextInt();
		in.nextLine();
		if(temp == 1) {
			System.out.println("용기있는 인간이군 ... 너의 자바 실력을 보도록 하겠다");
			 addWord(chOne);
			
		}else if(temp == 2) {
			System.out.println("용기없는 벌레는 죽어라 !!!");
			delayO ();
			System.out.println("크아아아앙");
			delayO ();
			System.out.println("Game Over");
			return;
		}
			
		
		}
	
	
	
	public void addWord(Mw_WordGameCharcater chOne) {
		Mw_WordGameOne wordgameOne1 = new Mw_WordGameOne();
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> checkdup= new ArrayList<>();
		
		wordgameOne1.setWord("자바에서 정수형 int는 몇 바이트(byte) 인가?", "4byte", "이런 easy한 문제는 힌트따위 없지만 숫자와 영어로 써라");
		wordglist.add(wordgameOne1);
		
		Mw_WordGameOne wordgameOne2 = new Mw_WordGameOne();
		wordgameOne2.setWord("자바에서 claas는 무엇과 무엇으로 구성되어 있는가? (ooㅇo/ooo 형태로 입력)", "멤버변수/메서드", "oooo/o서o이다 아둔한 아이야");
		wordglist.add(wordgameOne2);
		
		Mw_WordGameOne wordgameOne3 = new Mw_WordGameOne();
		wordgameOne3.setWord("자바에서 배열의 인덱스는 몇부터 시작하는가?", "0", "틀리면 바로 pc를 끄고 집에 가라");
		wordglist.add(wordgameOne3);
		
		Mw_WordGameOne wordgameOne4 = new Mw_WordGameOne();
		wordgameOne4.setWord("자바에서 객체를 생성할 때 사용하는 키워드는?", "new", "old한 시대가 그립군..");
		wordglist.add(wordgameOne4);
		
		Mw_WordGameOne wordgameOne5 = new Mw_WordGameOne();
		wordgameOne5.setWord("자바에서 boolean 데이터 타입은 어떤 값들을 가질 수 있는가?", "true/false", "ooo/oooo형식으로 답해라 초보야");
		wordglist.add(wordgameOne5);
		
		Mw_WordGameOne wordgameOne6 = new Mw_WordGameOne();
		wordgameOne6.setWord("자바에서 문자열을 저장하는 데 사용하는 데이터 타입은?", "String", "힌트가 필요할까?");
		wordglist.add(wordgameOne6);
		
		Mw_WordGameOne wordgameOne7 = new Mw_WordGameOne();
		wordgameOne7.setWord("자바에서 두 값을 비교할 때 사용하는 연산자는?", "==", "연산자만 입력해라");
		wordglist.add(wordgameOne7);
		
		Mw_WordGameOne wordgameOne8 = new Mw_WordGameOne();
		wordgameOne8.setWord("자바에서 산술 연산자 중 나머지를 구하는 연산자는?", "%", "연산자만 입력해라. 답도 없는 녀석아");
		wordglist.add(wordgameOne8);
		
		Mw_WordGameOne wordgameOne9 = new Mw_WordGameOne();
		wordgameOne9.setWord("자바에서 메서드를 정의할 때 반환값이 없을 경우 사용하는 키워드는?", "void", "메서드가 값을 반환하지 않을 때 사용한다... 이제 지치는군");
		wordglist.add(wordgameOne9);
		
		Mw_WordGameOne wordgameOne10 = new Mw_WordGameOne();
		wordgameOne10.setWord("자바에서 루프를 즉시 종료할 때 사용하는 키워드는?", "break", "반복문을 빠져나갈때 사용한다 .. 알겠나?");
		wordglist.add(wordgameOne10);
		
		
		
		
		
		int wctn = 2; // 오답
			for(int i =0; i<wordglist.size(); i++) {
				Random random = new Random();
				int ran;
				do {
					ran = random.nextInt(wordglist.size());
				} while (checkdup.contains(ran));
				checkdup.add(ran);
				
				System.out.println("자 " + (i+1) +" 번째 문제다.");
				chOne.CharcterInfoLife();
				
				wordglist.get(ran).getWordHint();
				String answer = in.nextLine();
				if(answer.equals(wordglist.get(ran).getmeaning())) {
					System.out.println("정답이다.. 자바력이 있는것 같구나");
					ctn++;
				}else {
					wctn--;
					
					if(wctn == 0) {
						System.out.println("Game Over");
						break;
					}
					System.out.println("wrong !");
					chOne.setHealth(wctn);
				}
					
			}
			
			//mgemge.clientList.g
			getScore(ctn, wordglist.size());
			
	}
	
	
	public void getScore(int ctn, int totalSize) { // 점수확인 메서드
		String ab = null;
	    int scorePercentage = ctn * 100 / totalSize;

	    System.out.println("===== 점수 확인 =====");
	    System.out.println("맞힌 문제 수: " + ctn);
	    System.out.println("전체 문제 수: " + totalSize);
	    System.out.println("정답률: " + scorePercentage + "%");
	    
	    // 정답률에 따른 평가
	    if (scorePercentage >= 80) {
	    	dEvaluation = "드래곤 평가: 자바 용기가 있는 아이군 ..";
	        System.out.println( dEvaluation);
	    } else if (scorePercentage >= 50) {
	    	dEvaluation = "드래곤 평가: 답도 없다 !!!";
	        System.out.println(dEvaluation);
	        return;
	    } else {
	    	dEvaluation = "드래곤 평가: 욕하고 싶지도않다 ....힘내라..";
	        System.out.println(dEvaluation);
	        System.out.println("Gave Over");
	    }
	    System.out.println("=====================");
	}
	
	public void ScoreInfo() { // 이름별 점수확인 메서드
		for(int i=0; i<chlist.size(); i++) {
			
			System.out.println("이름: " + chlist.get(i).getName()+"  맞힌갯수: "+ ctn +"  정답률:"+ctn*100/wordglist.size()+"%" + "  " + dEvaluation);
			
		}
	}
	
	public void delayO () { // 딜레이 메서드
	try {			
	      for (int i = 0; i < 1; i++) {	    	  
	    	  System.out.println("");
	          TimeUnit.SECONDS.sleep(1);		        
	      }
	    } catch (Exception e) {
	      System.out.println(e);
	    }
    }
	
		
	
}
