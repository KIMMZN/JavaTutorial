package _08_Array2;

public class _01_Q7_0910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7.위와 같은 게임 배열에서 같은 번호가 세로로 연속 3개 이상이면 제거가 가능하다.
		//제거가 가능한 블록의 좌표를 출력하시오.
		
		int[][] a = { {1,1,0,2},
			  	  {1,1,1,2},
			      {0,0,3,2},				      
			      {4,4,4,4},
			      {2,4,3,1},
			      {2,4,1,3} };
		
			for (int j =0; j<a[0].length; j++) {
					//System.out.println(j);
				int count = 1;
				for (int i=0; i<a.length-1; i++) {
					
					if(a[i][j] == a[i+1][j]) {
						count++;
						if(count >= 3) {
							//System.out.println(a[i][j]);
							for(int x=-1; x<=1; x++) {
								
								System.out.println(i-x + ", "+ j + " :" + a[i-x][j]);
								
							}
						}
					}else {
						count = 1;
					}
				}
				System.out.println();
				
			}
		
	

	}

}
