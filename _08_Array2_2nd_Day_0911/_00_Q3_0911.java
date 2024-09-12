package _08_Array2_2nd_Day_0911;

public class _00_Q3_0911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//일단 규칙 확인.
		//0.0의 값은 1.
		//행의 첫번째 값이 홀수면 +1,
		//행의 첫번재 값이 짝수면 -1
		//짝수일 경우와 홀수일 경우를 if문으로 설정함.
		
		int[][] a = new int[4][5];
		int num =1;

		for(int i=0; i<a.length; i++) {
			a[i][0] = num;
			
			for(int j=1; j<a[0].length; j++) {
				
				if(a[i][0]%2==1) {
					a[i][j] = a[i][j-1] +1; 
					
				}else if(a[i][0]%2==0) {
					a[i][j] = a[i][j-1] -1;
					
				}
				System.out.print(a[i][j]+"\t ");
				
				//j가 열의 a[0]의 인덱스 길이와 같고(즉 포문이 다 돌았을 경우),
				//num이 홀수일 경우, num에 num +9, num이 짝수일 경우 num에 num +1;
				if(j==a[0].length-1 && num%2==1) {
					num = num +9;
				}else if(j==a[0].length-1 && num%2==0) {
					num = num +1;
				}
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
