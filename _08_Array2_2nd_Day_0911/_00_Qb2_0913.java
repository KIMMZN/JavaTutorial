package _08_Array2_2nd_Day_0911;

public class _00_Qb2_0913 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] pang = {{2,4,1,2,1},
						{3,4,2,3,3},
						{2,4,1,2,2},
						{4,4,4,1,2},
						{4,2,3,3,2} };
		
		//열에 따른 좌표
		//0.0 0.1 0.2
		//1.0 1.1 1.2
		//2.0 2.1 2.2
		//3.0 3.1 3.2
		
		//음.. 배열을 하나 만들어서
		//pang안의 숫자들과 비교한뒤 같으면 ycount 하고
		//그 i의 값을 저장한다.
		// 후에 i값을 삭제하거나 0으로 만들고
		// 그 위에 행을 내려오게 하면 될듯.
		
		//틀리면 초기화 시킨다.
		//3이면 0, 4이면 0 5이면 0하게 함.
		
		//
		
		
		int yi = 0;// 컬럼
		int xi = 0;// 로우
		int ycheck = 0; // 인덱스 0 
		int xcheck = 0; // 같은 숫자인지 확인하는 임시 변수
		int ycount = 1;
		int xcount = 1;
		int row = pang.length;
		int cul = pang[0].length;
		for(int i =0; i<row; i++) {
			//System.out.println(i);
			for(int j =0; j<cul; j++) {
				//System.out.print(j+"");
				//열의 카운트 세는 if문
				if(pang[i][j] == ycheck) {//전 숫자를 저장하고 현재 숫자와 비교
					ycount++; //전 숫자와 현 숫자가 같으면 ++
					if(ycount >=3) {
						yi= i;
						//System.out.println(yi);
					}
				}else {
					ycount=1; // 아니면 초기화
				}
				ycheck = pang[i][j]; //전숫자 저장.
				//열의 따른 포문
				if(pang[j][i] == xcheck) {//전 숫자를 저장하고 현재 숫자와 비교
					xcount++; //전 숫자와 현 숫자가 같으면 ++
					
					if(xcount >= 3) {
						
						xi = i;
						System.out.println(xi);
					}
					
					
				}else if (pang[j][i] != xcheck || pang[j][i] != pang[j][i-1] ) {
					xcount=1; //[ 아니면 초기화
				}
				xcheck = pang[j][i]; //전숫자 저장.
				//System.out.print(pang[j][i]);
			}
			//System.out.println();
		}
		System.out.println();
		
	/*
		if(ycount >= 3) { // 카운트가 3 이상이면 0으로 바꿈
			for(int k=ycount-1; k>=0; k--) {
				pang[i][k] = 0;
			}
		}
		
		if(xcount >= 3) { // 카운트가 3 이상이면 0으로 바꿈
			for(int z=xcheck-1; z>=0; z--) {
				pang[z][i] = 0;
			}
		}
	*/	
		
		
		//결과실행
		for(int i =0; i<pang.length; i++) {
			//System.out.println(i);
			for(int j =0; j<pang[0].length; j++) {
				System.out.print(pang[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
