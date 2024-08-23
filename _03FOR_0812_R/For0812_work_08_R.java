package _03FOR_0812_R;

public class For0812_work_08_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
									/*	[7번 , 8번 문제 배열 제시]
										int[] a = {34,2,35,8,31,45};
										최대값을 구하는 문제에서
										철수는 변수를 사용하지 않고 배열만 이용하여 푸는 방법을 생각하였다. 
					
										8
										철수는 배열의 0번 인덱스에 가장 큰 값을 저장하면 될 것이라고 생각한다.
										0번 인덱스가 가장 큰 값이라고 정의하고 1번부터 마지막까지 순회하면서
										가장 큰 값이 나오면 가장 큰 값을 갱신한다.
										위와 같은 방식으로 가장 큰 수를 구하시오. */
		
										int[] a = {34,2,35,8,31,45};
										
										for(int i = 0; i < a.length-1; i++) {
											System.out.println(i);
											
											if(a[i] >= a[i+1]) {
												if (a[0] <= a[i]) {
													a[0] = a[i];
												}												
											}else {
												if (a[0] <= a[i+1]) {
													a[0] = a[i+1];
												}
											}
																						
										}
										System.out.println("가장 큰 값은: " + a[0]);

	}

}
