package _08_Array2_0910;

public class _01_Q7_911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//7.위와 같은 게임 배열에서 같은 번호가 세로로 연속 3개 이상이면 제거가 가능하다.
		//제거가 가능한 블록의 좌표를 출력하시오.
		
		int[][] a = { {1,1,0,2},
				  	  {3,2,1,2},
				      {0,0,3,2},				      
				      {4,4,4,4},
				      {2,4,3,1},
				      {2,4,1,3} };
			System.out.println("세로: ");
			for (int i =2; i<a.length; i++) {
				//System.out.println(i);				
				for(int j=0; j<a[0].length; j++) {
					//System.out.print(j);
					if(a[i][j] == a[i-1][j] && a[i][j] == a[i-2][j] && a[i-1][j] ==a[i-2][j] ) {
						//System.out.print(a[i][j] + " ");
						for(int k=-2; k<=0; k++) {
							//System.out.println(a[(i)+(k)][j] + " ");
							System.out.println("행:"+ (i+k) +", 열 :"+ j +", 숫자: "   +a[(i)+(k)][j] + " ");
						}
											}
					
				}
			}
	
	}

}
