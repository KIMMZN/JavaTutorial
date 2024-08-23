package _03FOR;

public class _00_FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {30, 40, 50, 55, 65};
		
		//  65 55 50 40 30
		
		for(int i=4; i>=0; i--) {
			System.out.println(a[i]);
		}
		
		// 40 50 55 65 30
		for(int i=1; i<=5; i++) {
			System.out.println("dd " + a[i%5]);
		}
		
		System.out.println("111 " + 5%5);
		
		
		/*for(int = 0; i<=0; i++) {
			sysout(a[(i+1)%5])
		}*/
		
		// 배열순회를 반복하면서 값의 조건판단 후 출력; 컨셉은 50이상의 숫자를 정제하는것
		
		for(int i=0; i<5; i++) {
			if ( a[i] >= 50) {
				System.out.println(a[i]);
			}
		}
		
		
		//50점 이상 카운트
		int cnt = 0;
		for(int i=0; i<5; i++) {
			if ( a[i] >= 50) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		//1. 50이상 점수를 합하시오
		//2. 평균을 구하시오 단. 50점이상;
		//3. 평균을 구하시오; 단 최저점수는 포함하지 마시오;
		
		//1. 50이상 점수를 합하시오
		
		int cnt1 = 0;
		for(int i=0; i<5; i++) {
			if ( a[i] >= 50) {
				cnt1 += a[i];
			}
		}
		 System.out.println(cnt1);
		 
		 //2. 평균을 구하시오 단. 50점이상;
		 
		 int count = 0;
		 int cnt2 = 0;
			for(int i=0; i<5; i++) {
				if ( a[i] >= 50) {
					cnt2 += a[i];
					count++;
				}
			}
			 System.out.println(cnt2/count);
			 
		//3. 평균을 구하시오; 단 최저점수는 포함하지 마시오;
			 int[] a1 = {30, 40, 50, 55, 65};
			 
			 int sum = 0;
			 int cnta = 0;
			 int minvalue = 10000;
			 
			 //최저값 찾기 *
			 for(int i=0; i<5; i++) {
				 if(minvalue > a[i]) {
					 minvalue = a[i];
				 }
			 } System.out.println(minvalue);
			 
			 
			 //최저값 뺀뒤 어버레이지
			 for(int i=0; i<5; i++) {
				 if(minvalue != a[i]) {
					 sum += a[i];
					 cnta++;
				 }
			 }
			  System.out.println(sum);
			  System.out.println(cnta);
			  
			 System.out.println((double)sum/cnta);
			 
			
		
		
		
		
		
		
		

	}

}
