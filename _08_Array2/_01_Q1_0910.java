package _08_Array2;

public class _01_Q1_0910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = { {1,2,3,4,5},
					  {6,7,8,9,10},
					  {11,12,13,14,15},
					  {16,17,18,19,20},
					  {21,22,23,24,25} };
	
	//1. 2차원 배열 a의 2번째 행의 모든 값을 출력하시오. 
	//a[2]의 값
			       System.out.print("a의 2번째 행의 모든 값은 : ");
			for (int i=1; i<2; i++) {
				
				for(int j=0; j<a[i].length; j++) {
					
					System.out.print(a[i][j]+" ");
				}
				
				System.out.println();
				
			}
		
		
		
		
		
		

	}

}
