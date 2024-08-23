package _03FOR_0812;

public class For0812_work_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//1 큰놈
		//int[] letter={8,12,4,13,2,14,4,5}
		//배열의 가장 큰수가 있는 인덱스를 출력하시오.
		//for문 
		// int i =0; i < letter.length; i++
		//letter[i]; maxValue;
		//if letter[i] < 
		
		
		
		int[] letter={8,12,4,13,2,14,4,5}; 
		int maxValue = 0;
		int maxIndex = 0;
		
		for (int i =0; i<letter.length; i++) {
			
			if (letter[i] > maxValue) {
				maxValue = letter[i];
				maxIndex = i;
			}
		}
		
			System.out.println("가장 큰수가 있는 인덱스: " + maxIndex + ", 값은 : "+maxValue);
		
		

	}

}
