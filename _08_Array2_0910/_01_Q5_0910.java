package _08_Array2_0910;

public class _01_Q5_0910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5. 전체 배열의 값 중 홀수를 0으로 마스킹 하고, 마스킹 된 결과 2차원 배열을 출력하시오.
		//if 배열 %2==1 이면 배열 값에 0, 다음 출력 ?
		int[][] a = { {1,2,3,4,5},
				  {6,7,8,9,10},
				  {11,12,13,14,15},
				  {16,17,18,19,20},
				  {21,22,23,24,25} };
/*		    System.out.println("결과 :");
			for(int i =0; i<a.length; i++) {
				
				for(int j=0; j<a[i].length; j++) {
					
					if(a[i][j]%2==1) {
						a[i][j] = 0;						
					}					
					System.out.print(a[i][j]+ "\t");
				}			
			        System.out.println();
		    }
	*/		
		
			//리팩토링.
			//출력을 따로 만들어 보자
			
			//길이 변수선언
			int al = a.length;
			int a0 = a[0].length;
			
			//마스킹 기능
			for(int i=0; i<al; i++) {
				//System.out.println(i);
				for(int j=0; j<a0; j++) {
					//System.out.println(j);
					if(a[i][j]%2==1) {
						a[i][j]= 0;
					}
				}
			}
			
			//출력 기능
			for(int i=0; i<al; i++) {			
				for(int j=0; j<a0; j++) {					
					System.out.print(a[i][j]+ "\t");
				}
				System.out.println();
			}
			
			

	}

}
