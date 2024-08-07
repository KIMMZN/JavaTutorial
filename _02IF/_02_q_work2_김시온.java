package _02IF;

public class _02_q_work2_김시온 {

	public static void main(String[] args) {
		
		//q.1
		double avrg = 89.2;
		
		//80 <= avrg : 합격
		//80 > avrg :
		//1
		System.out.println(80 <= avrg);
		System.out.println(80 > avrg);
		//2
		if (80 <= avrg) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		//q.2
		int level = 2;
		int point = 30;
		
		//level = 1 . point + 30
		//level != 1 . point + 10
		
		if(level == 1) {
			point += 30;
		}else {
			point += 10;
		}
		System.out.println(point);
		
		//q.3
		int[] lotto = {6,12,33,4,5,26}; // 배열의 값은 바뀔수 있다
		//index[2] + 80
		lotto[2] += 80;
		
		//q.4
		//lotto[3] oddnum = 출력 홀수 not 짝수
		//lotto[3] % 2 == 1 .. 홀수
		if (lotto[3] % 2 ==1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		//q.5
		//index 0~5
		//odd : 0,,2,,4,
		
		int oddNumber = lotto[0] + lotto[2] + lotto[4];
		
		
		
		//q.6
		int[] a = {45,34,64,45,24};
		int addnum = a[0] + a[1] + a[2] + a[3] + a[4];
		
		
		//up.q.7
		//a[0] a[1] a[2]
		
		
		//System.out.println(a[0]/10);
		//System.out.println(a[0]%10 );
		//System.out.println(a[1]/10);
		//System.out.println(a[1]%10);
		
		int a0 = a[0]/10 + a[0]%10;
		int a1 = a[1]/10 + a[1]%10;
		int a2 = a[2]/10 + a[2]%10;
		
		if (a0 > a1 && a0 > a2) {
			System.out.println("1");			
		}else if (a1 > a0 && a1 >a2) {
			System.out.println("2");
		}else if (a2 > a0 && a2 > a1) {
			System.out.println("3");
		}
		
		//up.q.8
		int[] x = {6,5,9};
		int[] y = {4,10,6};
		
		//bx =3
		//by =2
		
		//x[0] y[0]
		// 0번 6.4
		// 1번 5,10
		// 2번 9,6
				
		//int bb1 = x[0]%3 == 0;
		//int bb2 = y[0]%2 == 0;
		
		if(x[0]%3 == 0 && y[0]%2 ==0) {
			System.out.println("디짐 0");
					
		}
			if(x[1]%3 == 0 && y[1]%2 ==0) {
			System.out.println("디짐 1");
			
		} 
			if(x[2]%3 == 0 && y[2]%2 ==0) {
			System.out.println("디짐 2");
		}
		
		
		//x[0]%3 == 0 . y[0]%2 == 0;
			
		//up3. shooting
		
			//int x1 = 10;
			//int x2 = 15
			//int y1 = 20; //사이즈 가로:5, 세로:6
			//int y2 = 17
			
			//int mx = 11;
			//int my = 5;		//미사일 사이즈 가로:2, 세로:2
			
			//x1 mx x1+5;
			//y1 < my > y1+6
		
		
		
		
		
		
		

	}

}
