package _08_Array2_2nd_Day_0911;

public class _00_Q5_913 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1, 4        ㅡ  3, 4
		// 중간에 이건 아닌줄 알앗지만..
		//규칙확인 ..
		//달팽이 무늬처럼 바깥에서 안쪽으로 회전하며 들어옴.
		
		
		
		int[][] a = new int[4][5];
		int num =1;
		
		//변수 선언.
		int row = a.length; //행의 길이
		int cul = a[0].length; // 열의 길이
		for(int i=cul-1; i>=0; i--) {
			
			
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[j][j]+"\t ");
				
			}
			System.out.println(i);
			
			
						
											
		}
		System.out.println();
	
		//배열 값 출력부.
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t ");
			}
			System.out.println();
			
		}
		
		
		
		/*if(cf == 2) {
			for(int c2 = cul-2; c2 >= 1; c2--  ) {
				System.out.println(c2);
				a[cf][c2] = a[cf-1][cul-2]+(c2-
			}
		} */
		
		

	}

}
