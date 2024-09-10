package _08_Array2;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		int[][] a = { 
			{1, 1, 0, 2},
			{3, 2, 1, 2},
			{0, 0, 3, 2},				      
			{4, 4, 4, 4},
			{2, 4, 3, 1},
			{2, 4, 1, 3} 
		};
		
		// 행을 2번째 행부터 탐색 시작해야 이전 두 행과 비교 가능
		for (int i = 2; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				// 현재 요소가 이전 두 행의 같은 열의 요소와 모두 같은지 확인
				if (a[i][j] == a[i - 1][j] && a[i][j] == a[i - 2][j]) {
					System.out.println(a[i][j]);
				}
			}
		}
	}
}