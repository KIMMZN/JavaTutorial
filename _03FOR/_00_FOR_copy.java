package _03FOR;

public class _00_FOR_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {30, 40, 50, 55, 65};
		
		//  65 55 50 40 30
		
		for(int i=4; i>=0; i--) {
			System.out.println(a[i]);
		}
		
		// 40 50 55 65 30
		
		for(int i =1; i <= 5; i++) {
			System.out.println("aa "+ a[i%5]); //for문의 구조와 %에 대해서 이해해야한다.
		}
		
		for(int i = 0; i<=4; i++) {
			System.out.println("bb" + a[(i+1)%5]);
		}
		
		/*for(int = 0; i<=0; i++) {
			sysout(a[(i+1)%5])
		}*/
		
		// 배열순회를 반복하면서 값의 조건판단 후 출력; 컨셉은 50이상의 숫자를 정제하는것
		
		for(int i=0; i<5; i++) {
			if ( a[i] >= 50) {
				System.out.println(a[i]);
			}
		}
		
		for(int i=0; i<5; i++)
			if (a[i] >= 50) {
				System.out.println("fi" + a[i]);
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
		 
		 int avrn = 0;
		 for(int i=0;i < 5; i++ ) {
			 if(a[i] >= 50) {
				 avrn += a[i];
			 }
		 } System.out.println("50점 이상:" + avrn);
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
			 
			 //
			 int divnum = 0;
			 int avrn1 = 0;
			 for(int i=0;i < 5; i++ ) {
				 if(a[i] >= 50) {
					 avrn1 += a[i];
					 divnum++;
				 }
			 } System.out.println("50점 이상 평균:" + avrn1/divnum);
			 
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
			 
			 //  평균을 구하시오; 단 최저점수는 포함하지 마시오;
			 // 합쳐보기;;
			 int[] a2 = {30, 40, 50, 55, 65};
			 
			 int minval2 = 10000;
			 int avgcount = 0;
			 int avgsum = 0;
			 
			 for(int i = 0; i<5; i++) {
				 
				 if (a2[i] < minval2) {
					 minval2 = a2[i];
					 
				 }
				 avgcount++;
				 avgsum += a[i];
			 } System.out.println((double)(avgsum-minval2)/(avgcount-1));
			 
			 
		
		
		
		
		
		
		

	}

}
