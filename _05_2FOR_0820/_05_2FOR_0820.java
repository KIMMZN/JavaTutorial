package _05_2FOR_0820;

public class _05_2FOR_0820 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*	5.
			int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599};
			int[] parking = new int[10];
			   carnum배열의 인덱스가 0인 값부터 주차장에 들어온다. // carnum배열은 자동차 번호를 의미합니다. 
			   parking의 인덱스 번호가 주차번호이다. 
			   자동차 번호의 마지막 번호는 해당 차량이 주차할 주차번호이다.
			   만약 주차번호에 다른 차량이 주차되어 있으면 다음 주차번호에 주차를 한다.
			   (이때, 다음 주차번호에도 차량이 있으면 주차불가이다.)
			
			   주차가 끝난 후 주차번호와 주차항 차량 번호를 출력하시오. */
		
		int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599};
		int[] parking = new int[10];
		
		int index = 0;
		for(int i =0; i<carnum.length; i++) {
			//System.out.println(i);
			int lnum = (carnum[i]%10);
			//System.out.println(lnum);
			//parking[i] = i;
			
			for(int j=0; j<parking.length; j++) {
				
				if (parking[lnum] == 0) {
					parking[lnum] = carnum[lnum];
					System.out.println(parking[lnum]);
				}
				else {
					 
				
					//parking
				}
				
			
			}
			
			
			
			
		}
		
		
		 
		

	}

}