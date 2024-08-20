package _05_2FOR_0820;

public class _02_2FOR_0820 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	2
		int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		배열의 평균값을 구하시오. 소수점 표현하시오.  */
		//double
		
		int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		
		int sum =0;
		double result = 0;
		
		for(int i =0; i<arr.length; i++) {
			int avn =arr[i];
			
			sum+=avn;
		
		}
		result = sum/arr.length;
		System.out.println(result);

	}

}
