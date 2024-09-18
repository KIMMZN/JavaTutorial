package _03FOR_0812_R;

public class For0812_work_04copy_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*	4 난건물주
			int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
			int size=2;
			arr 배열에서 0이 의미하는 것은 공터이다. 
			size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
			size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
			size가 2일경우에 7개이다. */

			int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
			int size=2;										
			//3 - size 2 = 1; +1 = 2 // 총 2개
			//4 - sieze 2 = 2; +1 = 3; // 총 3개										
			//3 - size 3 = 0; +1 = 1; // 1개건설
			//4 - size 3 = 1; +1 = 2;// 2개건설
			// if 0이면 ++ 하고, 0이 아니면 0의숫자 - size +1 의값 저장하고, 초기화;
			int ycount = 0;
			int result = 0;
			for(int i = 0; i<arr.length; i++) {
				
				if (arr[i] == 0) {
					ycount++;
				} else {
					if(ycount >= size) {
						result += (ycount - size +1);
						ycount = 0;
					}
				}	
			}
			if(ycount >= size) {
				result += (ycount - size +1);
				ycount = 0;
			}
			
			System.out.println("건물을 지을수있는 위치의 개수: "+ result);
			

	}

}
