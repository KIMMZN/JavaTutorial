package _08_Array2_2nd_Day_0911;

public class _00_Q1_0911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[][] a = new int[4][5];
		int num =1;
		//배열 값 입력부
		
		//여기에 문제풀기.
		//0 4 = 1
		//1 3 = 2
		//2 1 = 3
		//3 0 = 4	
		//첫번째 행을 17부터 ++1하게 설정하고
		//각 컬럼의 규칙을 확인한 후 적용하여 풀었음.
		num =17;
		for(int i=0; i<a.length; i++) {
			
			a[i][0] = num++;
			for(int j=1; j<a[0].length; j++) {
				a[i][j] += a[i][j-1]-4;
				
			}
			System.out.println();
			
			
		}
		
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
