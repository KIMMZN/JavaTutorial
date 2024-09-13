package _08_Array2_2nd_Day_0911;

public class _00_Q4_912_repack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 > 2 >> 4 >>> 7 >>>> 11
		// 행은 1, 2 , 3, 4 더하기;
		//규칙이뭐지..
		// 1 2 3 4
		// 2 3 4 3
		// 3 4 3 2
		int[][] a = new int[4][5];
		int num =1;		
		
		
		System.out.println();	
		//배열 값 출력부.		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t ");
			}
			System.out.println();
		}
		
		
		

	}

}
