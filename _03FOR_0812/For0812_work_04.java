package _03FOR_0812;

public class For0812_work_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		//4 난건물주
		//int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}
		//int size=2;
		//arr 배열에서 0이 의미하는 것은 공터이다. 
		//size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		//size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		//size가 2일경우에 7개이다. 
		
		// for문 arr.length
		// 0 , 0 겹쳐야 건물 1개;
		//
		
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		
		int size=2;
		
		int countn = 0;
		
		int lnumber = arr[0];
		for(int i = 0; i < arr.length; i++ ) {
			
			if(arr[i] == lnumber && arr[i] == 0) {
				
				countn++;
			} else {
				lnumber = arr[i];
			}
			
		} 
		System.out.println("답은: " + countn);

	}

}
