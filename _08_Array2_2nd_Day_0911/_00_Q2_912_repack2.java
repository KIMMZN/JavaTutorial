package _08_Array2_2nd_Day_0911;

public class _00_Q2_912_repack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = new int[4][5];
		int num =1;
		//배열 값 입력부
		//(인덱스) 3행 열4번이 1로 시작하여 왼쪽으로 오면서 하나씩 증가하는 규칙 발친		
		//3.4 = 1 /2.4 =6 // 1.4 =11 // 0.4 = 16
		//3.3 = 2 /2.3 =7 //
		//3.2 = 3 /2.2 =8 //
		//3.1 = 4 /2.1 =9 //
		//3.0 = 5 /2.0 =10 //
		//3번부터 0번으로 숫자가 줄어들때마다.  4 3 2 1 0씩 회전하며 규칙확인
		
		//변수 언언
		int row = a.length;
		int cul = a[0].length;
		for (int i = row-1; i>=0; i--) {
			//System.out.println(i+"행값확인");
			for(int j =cul-1; j>=0; j--) {
				a[i][j] = num++;
				//System.out.print(j + "열값확인");
			}
			System.out.println();
		}
		
		
		
		
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t ");
			}
			System.out.println();
			
		}

	}

}
