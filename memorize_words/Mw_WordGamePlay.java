package memorize_words;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Mw_WordGamePlay {	
	ArrayList<Mw_WordGameCharcater> chlist = new ArrayList<>();
	ArrayList<String> typelist = new ArrayList<>();
	ArrayList<Mw_WordGameOne> wordglist = new ArrayList<>();
	
	
	public void JavaDragon() {
		Mw_WordGameCharcater chOne = new Mw_WordGameCharcater();
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("나의 이름은?");
			String name = in.nextLine();
			
			chOne.setName(name);
			chlist.add(chOne);
			
			String point = ".";		
			delay(point);
			
			chOne.CharcterInfo();
			typeSentences(chOne);
			
			
		}
		
		
		
		
		
		
		
		
		//String a2 = "";
		//String c = ""
		//delay(a,b);
		
		
	}
	
	
	public void delay (String delay) {
		
		try {			
		      for (int i = 0; i < 3; i++) {	    	  
		    	  System.out.println(delay);
		          TimeUnit.SECONDS.sleep(1);		        
		      }
		    } catch (Exception e) {
		      System.out.println(e);
		    }
	}
	
	public void typeSentences(Mw_WordGameCharcater chOne) {
		Scanner in = new Scanner(System.in);
		
		typelist.add("???: 오늘 하루 수고하셨습니다. (ENTER키를 입력하시오)");
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
		typelist.add("!!! 학원 근처 골목길에서 무슨 소리? 가 들리는듯하다");
		typelist.add("거기 무슨일 있나요 ? 무슨일이죠 ?");
		typelist.add("앗 ?");
		typelist.add("크어어어어어어엉");
		typelist.add("앗 저것은 ?");
		typelist.add("???: 나는 전설의 드래곤, 자바 드래곤이다");
		typelist.add("자바드래곤: 100000년 산 이몸을 노리고 온것인가?");
		typelist.add("자바드래곤: 아니면 나에게 먹힐 인간을 구하러 온것인가 ?");
		
		
		//System.out.println("");
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
		
		System.out.println("사람을 구하기위해  100000년산 자바드래곤과 싸우겠습니까?");
		System.out.println("1. Yes / 2. No");
		int temp = in.nextInt();
		in.nextLine();
		if(temp == 1) {
			System.out.println("용기있는 인간이군 ... 너의 자바 실력을 보도록 하겠다");
			 addWord();
			
		}else if(temp == 2) {
			System.out.println("용기없는 벌레는 죽어라 !!!");
			System.out.println("크아아아앙");
			System.out.println("Game Over");
			return;
		}
			
		
		}
	
	
	
	public void addWord() {
		Mw_WordGameOne wordgameOne = new Mw_WordGameOne();
		Scanner in = new Scanner(System.in);
		wordgameOne.setWord("자바에서 정수형 int는 몇 바이트(byte) 인가?", "4byte", "이런 easy한 문제는 힌트따위 없다");
		wordglist.add(wordgameOne);
		wordgameOne.setWord("자바에서 claas는 무엇과 무엇으로 구성되어 있는가? (ooㅇo/ooo 형태로 입력)", "멤버변수/메서드", "이런 easy한 문제는 힌트따위 없다");
		wordglist.add(wordgameOne);
		int ctn = 0;
		
			for(int i =0; i<wordglist.size(); i++) {
				System.out.println(i);
				System.out.println("자 " + i+1 +" 번째 문제다.");
				wordglist.get(i).getWordHint();
				String answer = in.nextLine();
				if(answer.equals(wordglist.get(i).getWord())) {
					System.out.println("정답이다.. 자바력이 높은 아이구나");
					ctn++;
				}else {
					System.out.println("wrong !");
				}
			}
			
		
		
	}
	
		
	
}
