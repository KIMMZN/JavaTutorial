package _03FOR_0812;

public class For0812_work_test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4 난건물주
		//int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}
		//int size=2;
		//arr 배열에서 0이 의미하는 것은 공터이다. 
		//size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		//size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		//size가 2일경우에 7개이다.
		// let i=0; / arr.length ; i++
		// 배열은 arr.legnth/ string은 a.length();
		// 배열 arr[i];
		//  count 3 / size2
		// count 3 - size 2 (+1) = 2칸
		// count 3 - size 3 (+1) = 1칸
		// count 3 - size 1 (+1) = 3칸
		// count 4 - size 3 (+1) = 2칸; 
		//if (count >= size) {
		// result += count - size +1;
		
		
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size=2;		
		int count = 0;
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == 0) {
				count++;
			}
			else {
				if(count >= size) {
					result += (count - size + 1);
				}
				count =0;
			}
			
		}
		System.out.println("건물을 지을수 있는 위치:" + result);
		
		
		
	}

}
