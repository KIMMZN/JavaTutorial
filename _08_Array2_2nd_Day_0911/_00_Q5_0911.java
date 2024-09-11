package _08_Array2_2nd_Day_0911;

public class _00_Q5_0911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1, 4        ㅡ  3, 4
	
		int[][] a = new int[4][5];
		int num =1;
		
		int row = a.length;
		int cul = a[0].length;
		for(int i=0; i<row; i++) {
			a[i][0] = num;
			
			for(int j=1; j<cul-1; j++) {							
				a[i][j] = a[i][j-1]+1;		
				//for(int k=)
				for(int k = cul-1; k<cul; k++) {
					a[i][k] = cul+i;
					
					if(i==row-1) { //4행
						for(int q=cul-2; q>=0; q--) {
							//System.out.println(q);
							a[i][q] = a[i][q+1]+1;
							
						}
					}						
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
