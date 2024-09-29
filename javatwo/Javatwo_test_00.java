package javatwo;

public class Javatwo_test_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		int[][] num = { {10,11,12},
						{20,21,22} };
		
		int total = 0;
		
		System.out.println("num 배열 길이: " + num.length);
		System.out.println("num[0] 배열 길이: " + num[0].length);
		System.out.println("num[1] 배열 길이: " + num[1].length);
		
		for (int i =0; i<num.length; i++) {
			for (int j=0; j<num[i].length; j++) {
				
				total += num[i][j];
				System.out.println("num[" + i + "]["+ j + "] :" + num[i][j]);
			}
			
		}
		
		System.out.println("num 배열의 총합: " + total);
		
			   
		
		int [][] a= {{1,2,3},
				     {4,5,6}};
		
		 for (int i =0; i < a.length; i++) {
			 
			 for(int j=0; j < a[i].length; j++) {
				 
				 System.out.print("|"+ a[i][j]+ "|");
				 
			 }
			 	 System.out.println();
			 
		 }
		 
		 System.out.println(8*100/10);
		
		
		
	}

}
