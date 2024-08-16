package _04_Random_0814;

import java.util.Random;

public class _06_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  /*6. 
	컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
	가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
	오늘의 추천 로또 번호 하나를 출력하시오.  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다. */
		
		//랜덤.
		
					Random r = new Random();
					
					int[] array = new int[46];
					for(int i =0; i < 10000; i++) {
						//System.out.println(i);
						
						int nn = r.nextInt(45)+1; // 
						array[nn] = array[nn]+1; //   0 = 0 + 1; count..
						
						//array[1] = array[1] +1
						
						System.out.println("test" + array[3]);
									
					}
					
					
					int sum = 0;
					int maxValue = 0;
					
					
					
					int nnum = 0;
					for(int i =0; i < array.length; i++) {
						
						//sum += array[i];
						//System.out.println(array[i]);
						
						if (array[i] >= maxValue) {
							maxValue = array[i];
							nnum = i;
							
							
							
							//System.out.println(maxValue+","+nnum );
							//System.out.println(i);
						}
						
						
						
						
					}
					System.out.println("횟수: " + maxValue+","+" 추천번호: " +nnum );
					
		

		
		

	}

}
