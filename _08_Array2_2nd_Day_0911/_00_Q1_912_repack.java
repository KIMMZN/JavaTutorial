package _08_Array2_2nd_Day_0911;

public class _00_Q1_912_repack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[][] a = new int[4][5];
		int num =1;
		//배열 값 입력부
		//각 컬럼의 규칙을 확인한 후 적용하여 풀었음.
		//개행문자 .검색. t의미는 tab 만큼 띄워라		
		//
	/*	for(int i=0; i<4; i++) {
			//System.out.print ("행 " + i);
			for(int j=0; j<5; j++) {
				//System.out.print(j+"\t");
				//i와 j갑으로 배열을 순회하는 순서를 결정
				//순회 하면서 num의 값을 저장한 것.
				a[i][j] = num;
				// 저장했으니 num값을 증가시킨것
				num++;
			}
			//System.out.println();
		} */
		//0 4 0 3 0 2
		//1 4 1 3 1 2	 
		//2 4 2 3 3 2
		//3 4 3 4 4 2
		for(int j =4; j >=0; j--) {
			for(int i=0; i<4; i++) {
			
			     //0 4
			     //1 4
			     //2 4
			     //3 4
				a[i][j] =num;
				num++;
				//.out.print(a[i][j]+"\t");
			}
		
			//System.out.println();
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
