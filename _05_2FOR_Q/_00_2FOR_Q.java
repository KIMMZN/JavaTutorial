package _05_2FOR_Q;

public class _00_2FOR_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	<1-6> 필수 코스 -------------------------------------
		1. 
		1*1=1  1*2=2   1*3=3
		2*1=2  2*2=4   2*3=6
		3*1=3  3*2=6   3*3=9
		4*1=4  4*2=8   4*3=12 */
		
		for(int i=1; i<5; i++) {
			
			for(int j=1; j<4; j++) {
				System.out.print(i + "*" + j + "=" + (i*j)+"  ");
			}
			System.out.println();
		}
		
	/*	i = 1 2 3		//단은 i , j는 dan 곱하기수
		j = 1 1 1
			2 2 2
			3 3 3   */	
	}

}
