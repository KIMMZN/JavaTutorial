package _04_Random_0814_R;

import java.util.Random;

public class _06_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
								/* 6. 
								컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
								가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
								오늘의 추천 로또 번호 하나를 출력하시오.  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다.  */
								
		
		
							Random r = new Random();
							
							int[] array = new int[46]; // 0 ~45 //0 번을 버릴것이다. 그럼 1~ 45;
							
							
							int sum = 0;
							
						
							int maxValue = 0;
							int k1 = 0;					
							for(int i=0; i < 10000; i++)  {
								
								int lotto = r.nextInt(45)+1; // 1 ~ 45 
								//System.out.println(lottoa);
								
								array[lotto] = array[lotto]+1; // 0 = 0 +1; counting ..//후 maxValue 구하기
								
																								
							}
							//System.out.println(array[0] + ", " + array[1] + ", "+ array[2] + ", "+ array[45] + ", ");
							for (int i =0; i<array.length; i++) {
								
								 sum += array[i];
								if (array[i] >= maxValue) {
									maxValue = array[i];
									k1 = i;
									
								}
							}
							
							System.out.println("오늘의 추천 로또번호: " + k1+ ", 가장 많이 뽑힌 로또 번호의 횟수: "+ maxValue);
							System.out.println(sum);
							
							
							//System.out.println(array[2]);
	}
}


