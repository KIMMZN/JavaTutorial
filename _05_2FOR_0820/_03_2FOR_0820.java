package _05_2FOR_0820;

public class _03_2FOR_0820 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	3. 팩토리얼의 합 구하기 (2중 for로 해결)
		1부터 10까지 숫자의 각패토리얼의 합을 구하시오
		예를들어 4의 팩토리얼은  1*2*3*4
		             5의 팩토리얼은 1*2*3*4*5              */
		// 전체 팩토리얼의 합을 저장할 변수
	    int Sum = 0;

	    
	    for (int i = 1; i <= 10; i++) {        
	        int factorial = 1;       
	        for (int j = 1; j <= i; j++) {
	            factorial *= j;
	        }       
	        Sum += factorial;       
	        //System.out.println(i + "의 팩토리얼: " + factorial);
	    }

	    // 전체 팩토리얼의 합을 출력
	    System.out.println("1부터 10까지 팩토리얼의 합: " + Sum);
		
		
	}

}
