package _02IF;

public class _01_q_basic {

	public static void main(String[] args) {
		
		int a = 10; // 도로의 길이이며 위치,
		int b = 20; // 도로의 길이이며 위치
		int my = 15; // 나의 위치
		
		//my = a
		//my = b
		
		if (my == a || my == b ) {
			System.out.println("나는 도로위");
		}else {
			System.out.println("도로위가 아님");
		}
		
		// my >= a , my <= b 다시
		if (my > a && my <= b) {
			System.out.println("도로위");
		}else {
			System.out.println("도로가 아님");
		}
		
		//up1
		
		if (my > a && my <= b) {			
			System.out.println("a지점으로부터 " + (a-my) + "만큼 떨어져 있다.");
						
		}else {
			System.out.println("도로가 아님");
		}
		
		//up2
		
		if (my > a && my <= b) {			
			System.out.println("a지점으로부터 " + (a-my) + "만큼 떨어져 있다.");
			int adis = my -a;
			int bdis = b - my;
			
			if (my - a <  b - my) {
				System.out.println("a로 부터 " + adis + "만큼 떨어져 있다.");
				
			}else if (my - a > b - my) {
				System.out.println("b로 부터 " + bdis + "만큼 떨어져 있다.");
				
			}else {
				System.out.println("a로 부터 " + adis + "만큼 떨어져 있다.");
			}
						
		}else {
			System.out.println("도로가 아님");
		}
		
		//
		
		//up2 - 1
		
		if (my > a && my <= b) {			
			System.out.println("a지점으로부터 " + (a-my) + "만큼 떨어져 있다.");
			int adis = my -a;
			int bdis = b - my;
			
			if (adis <= bdis) {
				System.out.println("a로 부터 " + adis + "만큼 떨어져 있다.");
				
			}else {
				System.out.println("b로 부터 " + bdis + "만큼 떨어져 있다.");
				
			}
						
		}else {
			System.out.println("도로가 아님");
		}
		
		
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
