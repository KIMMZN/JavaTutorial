package _03FOR_0812;

public class For0812_work_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		//0 선택받은너
		//int[] letter={8,12,4,13,2,14,4,5}
		//짝수만 출력하시오.
		
		int[] letter={8,12,4,13,2,14,4,5};
	    // i =0;  i > letter.length; i++
		// letter[i];
		
	    
		for (int i =0; i < letter.length; i++) {
			
			
			if((letter[i]) %2 ==0) {
				System.out.println("배열의 짝수는 " + letter[i]);
			}
			
			
			
		}
	
	
		

	}

}
