package _04_Random_0814;

import java.util.Random;

public class _Test3_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	String[] word ={"apple","banana","car","dog","cat","computer"};
		단어를 출력할 때
		순차적으로 출력하지 않고
		랜덤으로 모든 단어를 출력하고 싶다.
		단어는 딱 한 번만 출력할 수 있으며 모든 단어가 모두 출력되어야 한다. */
		
		String[] word ={"apple","banana","car","dog","cat","computer"};
		
		Random r = new Random();
		
		
		//System.out.println(word[1] + word[2] + word[0] + word[4]);
		
		int[] array = new int[6];
		
		for(int i = 0; i < word.length; i++) {
		        
			int ab = r.nextInt(5);		     
			if (array[ab] != 1) {				
				System.out.println(word[ab]);
				array[ab] = 1;				
			}else {
				i = i-1; // i--
			}
			//System.out.println(word[ab]);
		}
		
		
		

		

	}

}
