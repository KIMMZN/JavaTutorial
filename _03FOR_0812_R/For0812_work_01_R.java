package _03FOR_0812_R;

public class For0812_work_01_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
										
									/*  1 큰놈
										int[] letter={8,12,4,13,2,14,4,5};
										배열의 가장 큰수가 있는 인덱스를 출력하시오. */
		
										int[] letter={8,12,4,13,2,14,4,5};
										//maxVal구하기;
										
										int maxValue = 0;
										int indexN = 0;
										
										for(int i = 0; i<letter.length; i++) {
											
											if(letter[i] > maxValue) {
												maxValue = letter[i];
												indexN = i;
											}
										}
										
										System.out.println("가장 큰 수가 있는 인덱스: " + indexN);
										System.out.println("가장 큰수인지 확인: " + letter[5]);
										

	}

}
