package _05_2FOR_Qt;

public class _00_2FOR_Qt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*<1-6> 필수 코스 -------------------------------------
		1. 
		1*1=1  1*2=2   1*3=3
		2*1=2  2*2=4   2*3=6
		3*1=3  3*2=6   3*3=9
		4*1=4  4*2=8   4*3=12 */
		
		for(int i=1; i<5; i++) { // 아래로 1234 출력
			
			for(int j=1; j<4; j++) {//오른쪽으로 숫자 출력, i가 1일때 j=1 ,2,3//
				System.out.print(i + "*" + j+"" + "="+ (i*j)+" ");
			}
			
			System.out.println();
		}


	}

}
