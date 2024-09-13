package _08_Array2_2nd_Day_0911;

public class _00_Q3_912_repack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		//00 01 02 34 04 		행은 고정 열은 변화
		//1.4 1.3 1.2 1.1 1.1 	행은 고정 열은 변화
		
		//2.0 2.1 2.2 2.3 2.4	행은 고정 열은 변화
		//3.4 3.3 3.2 3.1 3.0	행은 고정 열은 변화
		// 행이 짝수이면 01234
		// 행이 홀수이면 43210
		// > if문으로 나누자
		int[][] a = new int[4][5];
		int num =1;
		
		for(int i =0; i <4; i++) {
			
			if(i%2==0) {
				for(int j=0; j<5; j++) {
					a[i][j] = num++; //num에 ++ . 후위연산자
					//위 코드는 대입연산자가 일어난후
					//단일 연산지인 ++이 실행된다.
					// a[i][j] = num;이 실행되고, num++;이 실행됨.
					// 만약 a[i][j]=++num;
					//이면 이것은 단일연산자가 먼저 실행되고
					//대입연산자가 실행된다.
					//첫번째 case를 후위 단일 연산자
					//두번째 case를 전위 단일 연산자.
					
				}
				
			}else {
				for(int j=4; j>=0; j--) {
					a[i][j] = num++;
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
