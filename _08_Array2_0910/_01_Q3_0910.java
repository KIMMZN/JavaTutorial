package _08_Array2_0910;

public class _01_Q3_0910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. 2차원 배열의 2열의 모든 값을 행의 순서대로 출력하시오. 예)3 8 13 23
		//a[i][1] 인듯?
		
		int[][] a = { {1,2,3,4,5},
				  {6,7,8,9,10},
				  {11,12,13,14,15},
				  {16,17,18,19,20},
				  {21,22,23,24,25} };
		
/*				System.out.print("2열의 모든값: ");
		for (int i = 0; i<a.length; i++) {
			
			for(int j=1; j<2; j++) {
				System.out.print(a[i][j]+", ");
			}
		}
		
		*/
		
		
		//음 ... 생각해보니 하나의 포문으로 해결가능한듯 하다 .. 
		//2열은 고정이고, 행은 변함
			System.out.print("2열의 모든값: ");
		for (int j=0; j<a.length; j++) {
			
			System.out.print(a[j][1]+" ");
			
		}

	}

}
