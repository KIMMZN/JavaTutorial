package _08_Array2_2nd_Day_0911;

public class _00_Q4_912_repack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 > 2 >> 4 >>> 7 >>>> 11
		// 행은 1, 2 , 3, 4 더하기;
		//규칙이뭐지..
		// 1 2 3 4
		// 2 3 4 3
		// 3 4 3 2
		//음 ./.. i가 0보다 크면 포문
		//ㅈ
		//00
		
		
		int[][] a = new int[4][5];
		int num =1;		
		for(int i=0; i<8; i++) {
			System.out.println(i + "번째 채우기를 합니다.");
			int newCol=i;
			for(int j=0; j<=i;j++) { // i값
				if(j>3) continue;
				if(newCol < 5) {
					System.out.println("j<행>"+j+"/열"+newCol);
					a[j][newCol] = num++;
				}
				newCol--;
			}	
			//System.out.println();
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
