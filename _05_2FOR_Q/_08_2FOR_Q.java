package _05_2FOR_Q;

public class _08_2FOR_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		/*	8.
			int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5}   -이중 for  사용
			애니팡 게임의 일부분인다. 게임의 캐릭터는 숫자로 구분한다.
			가로에 같은 캐릭터가 3개 이상이면 제거 대상이다.
			제거 대상 캐릭터 번호와 갯수, 시작위치 인덱스를 모두 출력하시오. */
		
				int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,2};
				                                //2 2 2
				
				int num = 1;
				
				for(int i =0; i<pang.length; i++) {
					//System.out.println(pang[i]);				
					num = 1;			
					for(int j =i+1; j<pang.length; j++) {
						//System.out.println(pang[j]);
						
						if(pang[i] == pang[j]) {
							num++;
							
						}else {							
							break;
						}
					}
					if (num >= 3) {
						System.out.println("제거대상 케릭터의 번호: " + pang[i] + ", 갯수: " + num + ", 시작 인덱스: " + i );
						i = i +num -1;
						
					}
					
					
				}
					
	}

}
