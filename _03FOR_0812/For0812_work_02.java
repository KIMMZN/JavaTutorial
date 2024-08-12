package _03FOR_0812;

public class For0812_work_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2 현상수배
		//int[] letter={8,12,4,13,25,14,4,5}
		//범인을찾으시오
		//범인은 짝수이면서 가장큰 값이다. 
		//범인은 14입니다. 
		
		int[] letter={8,12,4,13,25,14,4,5};
		
		int maxNumber = 0;
		int maxNumber1 = 0;
		for(int i =0; i < letter.length; i++) {
			
			if(letter[i]%2==0) {				
				maxNumber = letter[i];
				System.out.println("test" + letter[i]);				
			} if (maxNumber > maxNumber1) {
				maxNumber1 = maxNumber;
			}
						
		}
		
		System.out.println("가장큰 짝수는 : " + maxNumber1);
		
	}

}
