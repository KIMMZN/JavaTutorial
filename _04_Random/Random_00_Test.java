package _04_Random;

import java.util.Random;
// ctrl+ shift + o
//Random이라는 class가 필요하기때문에 import 시켯다.

public class Random_00_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6개의 랜덤한 로too 번호
		
		//로또 번호 저장할 배열;
		int [] lotto = new int[6]; //변수명 , 길이, index
		
		// 랜덤한 번호룰 추출하기 위한 객체 만들기		
		Random r = new Random(); // ctrl shift o
		
		//로또 번호를 출력하는 반복문;
		for(int i = 0; i < lotto.length; i++) {			
			int k = r.nextInt(45)+1; // r변수를 참조하여 nestint라는 기능을 호출, 리턴받은 수에 +1을 한다.								// 매개변수: 45 리턴받은수는 0~44;에 +1 시킴.
			lotto[i] = k;		
		}
		//로또 번호를 출력하는 반복문
		for(int i = 0; i < lotto.length; i++) {
			if(i==lotto.length-1) { // 마지막 번호
				System.out.println("보너스 : "+ lotto[i]);
			}else {
				System.out.println(lotto[i]);
			}
			
			
		}
		
		

	}

}
