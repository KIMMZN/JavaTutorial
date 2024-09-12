package _08_Array2_2nd_Day_0911;

public class _00_Q2_0911 {

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
		//먼저 규칙 확인.
		//num을 첫번째열 첫번째행 값에 넣고
		//for문 으로 -1씩 되게 함.
		//포문이 한번 돌아거서 첫번째 행을 완료하면
		//첫번째 열의 첫번째 행 값이 -5가 되도록 함.
		num =20;
		int b = 0;
		for(int i=0; i<a.length; i++) {			
			a[i][0] = num;		 
			for(int j=1; j<a[0].length; j++) {//행 실행. 첫번째 값에서 -1씩 되게함.
				
					a[i][j] += a[i][j-1] -1 ;
					
			}
				System.out.println();
				//포문이 한번 돌아간후 넘값이 -5가 되로록 num값 조정.
				num = a[i][4]-1;			
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
