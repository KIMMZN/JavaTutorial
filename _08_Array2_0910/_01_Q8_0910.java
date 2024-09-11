package _08_Array2_0910;

public class _01_Q8_0910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8.위와 같은 게임 배열에서 같은 번호가 가로나 세로로 각각 3개 이상이면 제거가 가능하다.
		// 제거가 가능한 블록의 좌표를 출력하시오.

	        // 게임 배열
	        int[][] a = {
	            {1, 1, 0, 2},
	            {3, 2, 1, 2},
	            {0, 0, 3, 2},
	            {4, 4, 4, 4},
	            {2, 4, 3, 1},
	            {2, 4, 1, 3}
	        };
	        
	        System.out.println("세로: ");
			for (int j =0; j<a[0].length; j++) {
				//System.out.println(j);
				int count = 1;				
				for (int i=0; i<a.length-1; i++) {					
					if(a[i][j] == a[i+1][j]) {
						count++;
						if(count >= 3) {
							//System.out.println(a[i][j]);
							for(int x=-1; x<=1; x++) {
								
								System.out.println("행: " + (i-x) + ", "+"열: "+ j + " :" + a[i-x][j]);
								
							}
						}
					}else {
						count = 1;
					}			
			     }
				
			}
						
			System.out.println();
			
			
			
	        //가로
			
			System.out.println("가로: ");
			for (int i =0; i<a.length; i++) {
				//System.out.println(i);
					int counb = 1;
					for(int k=0; k<a[i].length-1; k++) {
						
						if(a[i][k] == a[i][k+1]) {
							counb++;
							if (counb == 3) {
								
								for(int p=-1; p<=1; p++) {
									System.out.println("행: "+ i + ", "+"열: " + (k+p) + " :" + a[i][k+p]);
								}
								
							}
							else if (counb >3) {
								System.out.println("행: " + i + ", "+ "열: " + (k+1) + " :" + a[i][k+1]);
							}
							
							
						}else {
							counb = 1;
						}							
						
					}
					
		   	 }
			
			
			
			
			
			
			
			
			
		

	    
	    }
	}