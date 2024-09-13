package _08_Array2_2nd_Day_0911;

public class _00_Q1_912_repack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[][] a = new int[4][5];
		int num =1;
		//배열 값 입력부
		//각 컬럼의 규칙을 확인한 후 적용하여 풀었음.
		//개행문자 .검색. t의미는 tab 만큼 띄워라		
		//0   1  2//  0 3 =5               0 4 =1
		//        //1 3 =6               1 4 =2
		//        //2 3 =7               2 4 =3
		//        //3 3 =8               3 4 =4
		//열이 4 부터 0으로 줄어드는걸 발견.
		//행은 0123 반복한다
		// 열 4 에서 행 0123 반복
		// 열 3 에서 행 0123 반복
		
		//변수선언
		int row = a.length;
		int cul = a[0].length;
		for(int i=cul-1; i>=0; i--) {
			System.out.println(i + "i값");
			for(int j=0; j<row; j++) {
				System.out.print(j+ " 행");
				a[j][i] = num++;
			}
			System.out.println();
		}
		
		
		
		
		
		
		for(int i=0; i<4; i++) {
			//System.out.print ("행 " + i);
			for(int j=0; j<5; j++) {
				
				System.out.print(a[i][j]+"\t");
			}	
			System.out.println();
		}
		
	
	}

}
