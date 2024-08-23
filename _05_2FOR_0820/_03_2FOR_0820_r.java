package _05_2FOR_0820;

public class _03_2FOR_0820_r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		/*	3. 팩토리얼의 합 구하기 (2중 for로 해결)
			1부터 10까지 숫자의 각패토리얼의 합을 구하시오
			예를들어 4의 팩토리얼은  1*2*3*4
			             5의 팩토리얼은 1*2*3*4*5            */
		
		int sum=1;
		int facto = 0;
		for (int i = 1; i<=10; i++) {
			//System.out.println(i);
			sum = 1;
			for(int j =1; j<=10; j++) {									
						if( j <= i) {
							sum = sum*j;
						}else {
							break;
						}
						
			}
			facto += sum;		
		}
		System.out.println(facto);


	}

}
