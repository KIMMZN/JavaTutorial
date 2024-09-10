package _08_Array2;

public class _01_Q4_0910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4. 전체 배열의 값중 짝수는 모두 몇 개인가?
		//배열 %2 ==0 짝수, 개수는 count에 저장 해야되나
		
		int[][] a = { {1,2,3,4,5},
				  {6,7,8,9,10},
				  {11,12,13,14,15},
				  {16,17,18,19,20},
				  {21,22,23,24,25} };
		
		int count =0;
		for(int i =0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				
				if(a[i][j]%2==0) {
					count += 1;
				}
			}
		}
		
		System.out.println("짝수의 갯수는 " + count);

	}

}
