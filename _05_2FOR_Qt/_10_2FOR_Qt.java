package _05_2FOR_Qt;

public class _10_2FOR_Qt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		/*	10 난건물주  <이중For사용>
			int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
			int size=2;
			arr 배열에서 0이 의미하는 것은 공터이다. 
			size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
			size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
			size가 2일경우에 7개이다.  */
			
			int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
			int size=2;
			
			int ctn =0;
			int result =0;
			for(int i =0; i < arr.length; i++) {
				ctn=0;
				
				if(arr[i] == 0) {
					for(int j=i; j<arr.length; j++) {
						if (arr[i] == arr[j]) {
							ctn++;
						}else {
							break;
						}
					}
				}
				if (ctn >= size) {
					result += ctn -size +1;
					i= i+ctn-1; //속이 뻥 ~ 휴
				}
			}
			
			System.out.println("공터에 지을수있는 위치: " + result);
			
			
			
			
		
		

	}

}
