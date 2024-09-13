package _08_Array2_2nd_Day_0911;

public class _00_Q5_912_repack {

	public static void main(String[] args) {
		//리팩토링..
		
		int[][] a = new int[4][5];
		int num = 1;
		
		//변수 4개 만들기;
		int 행최소값=0;
		int 행최대값=3;
		int 열최소값=0;
		int 열최대값=4;
		for(int s=0; s<2; s++) {
			//맨 위에쪽 부분숫자 채우기;
			// 맨 위는 행최소값0 열최소값 0 열최대값 4
			// 맨위(두번째는 행최소값 1, 열최소값1 열최대값3)
			for(int i=열최소값; i<=열최대값; i++) {
				a[행최소값][i]=num++;
			}
			//위 반복문이 완료되었다면 0번행은 채울 필요없다.
			//행의 최소값을 증가시켜 버리자.
			행최소값++;
			for(int i=행최소값; i<=행최대값; i++) {
				a[i][열최대값] = num++;
			}
			열최대값--;
			for(int i =열최대값; i>=열최소값; i--) {
				a[행최대값][i] = num++;
			}
			행최대값--;
			for(int i =행최대값; i>=행최소값; i--) {
				a[i][열최소값] = num++;
				
			}
			열최소값++;
			
			
		}
		
		
		
		
		System.out.println();
		
		

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
	}

}
