package _02IF;

public class _00_q_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int point = 20;
		int x = 1; // x는 화살의 위치
		
		//x >= 0 && x <= 12
		//13 <= x && x <= 20 , + 9점
		//21 <= x && x >= 30 . +8
		//x >= 31 . 7
		
		
		System.out.println(x >= 0 && x <= 12);
		System.out.println(13 <= x && x <= 20);
		System.out.println(21 <= x && x <= 30);
		System.out.println(x >= 31);
		
		if(x >= 0 && x <= 12) {
			point += 10;
		}else if (13 <= x && x <= 20) {
			point += 9;
		}else if (21 <= x && x <= 30) {
			point += 8;
		}else if (x >= 31) {
			point += 7;			
		}
		
		System.out.println(point);
		
		point = 20;
		//up1 solution
		if(x >= 0 && x <= 12) {
			if( x>0 && x<=1) {
				point += point*0.1;
			}
			point += 10;			
		}else if ( x <= 20) {
			point += 9;
		}else if ( x <= 30) {
			point += 8;
		}else if (x >= 31) {
			point += 7;			
		}
		System.out.println(point);
		

	}

}
