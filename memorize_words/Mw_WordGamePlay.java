package memorize_words;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Mw_WordGamePlay {	
	ArrayList<Mw_WordGameCharcater> chlist = new ArrayList<>();
	ArrayList<String> typelist = new ArrayList<>();
	boolean skip = true;
	
	
	public void JavaDragon() {
		Mw_WordGameCharcater chOne = new Mw_WordGameCharcater();
		System.out.println("나의 이름은?");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		chOne.setName(name);
		chlist.add(chOne);
		
		String point = ".";		
		delay(point);
		
		
		
		chOne.CharcterInfo();
		typeSentences(chOne);
		
		
		
		
		
		
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
		typelist.add("???: 이몸은 매우 배고프니 죽기 싫으면 입다물고 돌아가거라");
		
		
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
	}
	
}