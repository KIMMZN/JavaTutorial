package _03FOR;

public class _00_forq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 평균을 구하시오; 단, 최저점수는 포함하지 마시오.
		 int[] a = {30, 40, 50, 55, 65};
		 
		 int sum = 0;
		 int cnta = 0;
		 int minvalue = 10000;
		 
		 for(int i=0; i<5; i++) {
			 if(minvalue > a[i]) {
				 minvalue = a[i];				 					 					 									 
														 
			 }
			 sum += a[i];
			 cnta++;
		 }
		 System.out.println(sum);
		 System.out.println(cnta);
		  System.out.println((double)(sum-minvalue)/(cnta-1));
		  
		System.out.println(0%2 == 0);
		  
		 
		  
	}

}
