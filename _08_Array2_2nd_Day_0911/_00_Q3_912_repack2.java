package _08_Array2_2nd_Day_0911;

public class _00_Q3_912_repack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//음 ... 0행 ~ 4열 값증가 , 1행 감소, 2행 증가,3행 감소..
		//짝수일때 값 증가. 홀수일때 값이 감소하는 증상 확인.
		//그럼 짝수일때와 홀수일때의 경우를 나눠서 해보자.
		/*	0.0 = 1 /	0.1 = 2 / 0.2 = 3 / 0.3 = 4 /0.4 = 5 / 증가
		 * 
		 * 	1.4 = 6 /	1.3 = 7 / 1.2 = 8 / 1.1 = 9 /1.0 = 10/ 감소
		 * 
		 *  2.0 = 11 // 2.1 = 12           !!!       2.4 = 15/ 증가
		 *  
		 *  3.4 = 16 // 3.3 = 17 // 3.2 = 18     ~  3.0 = 20   감소   
		*/  
		//짝수행일때, 01234 돌며 증가함
		//홀수행일대, 4 3 2 1 0 돌며 감소함
		//행은 0부터 3,하나씩 증가함.
		
		int[][] a = new int[4][5];
		
		//변수 선언;
		int num =1;		
		int row = a.length;
		int cul = a[0].length;
		
		for(int i = 0; i<row; i++) { //행
			System.out.println("i값 "+ i);
			
			if(i%2==0) {
				for(int j = 0; j<cul; j++) { //짝수일경우, 0~4번, 1씩증가
					a[i][j] = num++;
					//System.out.print("j값 "+ j);
			}
				//System.out.println();
			}else{
				for(int k =cul-1; k>=0; k--) {  //홀수일경우, 4~0번, 1씩 감소
					//System.out.print("k값 " + k);
					a[i][k] = num++;
				//System.out.println();
				}	
			 }
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
