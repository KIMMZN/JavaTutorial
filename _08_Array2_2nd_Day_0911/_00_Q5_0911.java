package _08_Array2_2nd_Day_0911;

public class _00_Q5_0911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1, 4        ㅡ  3, 4
		// 중간에 이건 아닌줄 알앗지만..
		//규칙확인 ..
		//첫번째 컬럼이 1,2,3,4,5
		// 그리고 마지막 5에서 세로로 5678로 내려옴 ...
		// 달팽이 무늬 처럼 바깥에서 안쪽으로 돌아가는 패턴 확인
		
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
						for(int cf=row-2; cf>0; cf--) { // i.0 열
							a[cf][0] = a[cf+1][0]+1;
							if(cf == 1) { // 1.0 ~ 1.4
								for(int c1 =cf; c1 <cul-1; c1++) {
									//System.out.println(c1);
									a[cf][c1] = a[cf][c1-1]+1; 
									if(c1 == 3) { // 2.3 좌표의 값 변경
										a[cf+1][c1] = a[cf][c1]+1;
									}
								}
							}
							if(cf == 2) {   //좌표 2.2 ~ 2.1필요
								for(int c2 = cf; c2>=1; c2--) {
									
									//System.out.println(c2);
									a[cf][c2] = a[cf][c2+1]+1;
								}
							}
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
		
		
		
		/*if(cf == 2) {
			for(int c2 = cul-2; c2 >= 1; c2--  ) {
				System.out.println(c2);
				a[cf][c2] = a[cf-1][cul-2]+(c2-
			}
		} */
		
		

	}

}
