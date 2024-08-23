package _04_Random_0814_R;

import java.util.Random;

public class _04_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 4. . 숫자 10개를 저장할수 있는 배열을 만들고
		   0부터 99숫자중 랜덤으로 10개를 뽑습니다.
		   이중 짝수만 저장하고 홀수는 무시합니다.(다시 뽑지 않습니다.)
		  0번째 번호 98이라면   0번 인덱스에 저장
		  1번째 번호 97이라면   무시  1번 인덱스는 선언시 초기값
		  2번째 번호 88이라면   2번  인덱스에 저장 */
		
		int[] array = new int[10]; // 0 ~9
		
		Random r = new Random();
		
		for (int i =0; i < array.length; i++) {
			
			int random = r.nextInt(100); // 랜덤숫자 0 ~ 99 생성; int random 에 저장;
					
			if (random%2 ==0) { // random이 짝수라면 ,
				array[i] = random; // array[i]에 random을 저장. 즉 홀수는 저장 안함;
			}
			//System.out.println(array[i]);
			
		}
	
		for (int i =0; i < array.length; i++) {
			System.out.println("index "+i + ": " + array[i]);
		}
		

	}

}
