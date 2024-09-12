package _08_Array2_2nd_Day_0911;

public class _00_Q5_912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1, 4        ㅡ  3, 4
		// 중간에 이건 아닌줄 알앗지만..
		int [][] a = {{1,2,3,4,5},
					  {6,7,8,9,10},
					  {11,12,13,14,15},
					  {16,17,18,19,20},
					  {21,22,23,24,25} };
				
				
	
		
		// 0.0>>0.1 | 0.1 >> 0.2 >> || 0.2 >> 0.3 || 0.3 >> 0.4 ||0.4 >> 1.4
		// 1.0 >> 0.0 ||
		// 2.0 >> 1.0
		// 3.0 >> 2.0
		// 4.0 >> 3.0
		
		// 1.0 0.0 0.1 0.2 0.3
		// 2.0 2.1 1.1 1.2 0.4
		// 3.0 3.1 2.2 1.3 1.4
		// 4.4 3.2 3.3 2.3 2.4
		// 4.1 4.2 4.3 4.4 3.4
		
		// 일단 0.0열
		// 0.0열을 2중포문에
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<a[0].length; j++) {
				
			
				System.out.print(a[i][j]+"\t ");
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		
		int row = a.length;
		int cul = a[0].length;
		int right = 1;
		for(int i=0; i<row; i++) {
			
		//(int j =0; j++)
		//	System.out.print(a[i[j]);
		///	//for(int j)
			
			
			System.out.println("gg");
		}
			
		
	/*
		for(int j=0; j<1; j++) { //첫번째 열 회전
			System.out.print(a[i][j]+"\t ");
			
		}
		
		for(int j=0; j<4; j++) { // 첫번째 행 회전				
			System.out.print(a[i-1][j]+"\t ");
		}
	*/	
		
		
		
		
		
		
		
	}

}
