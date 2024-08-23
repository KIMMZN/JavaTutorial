package _03FOR_0812;

public class For0812_work_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 8
		//철수는 배열의 0번 인덱스에 가장 큰 값을 저장하면 될 것이라고 생각한다.
		//0번 인덱스가 가장 큰 값이라고 정의하고 1번부터 마지막까지 순회하면서
		// 큰 값이 나오면 가장 큰 값을 갱신한다.
		//위와 같은 방식으로 가장 큰 수를 구하시오.
		// 아몰랑
		
		
			int[] a = {34,2,35,8,31,45};
			
			for(int i =0; i<a.length-1; i++) {
				
				if (a[i] > a[i+1]) {
					a[0] = a[i];
					//System.out.println(a[0]);
												
				}else {
					a[0] = a[i+1];
				}
			}
			
			System.out.println("a[0] :" + a[0]);
	}

}
