package _02IF;

public class _00_q_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Basic
		//화살의 위치가 0에서 12사이이면 +10점;
		//13~20점 사이이면 +9점
		//21~30 사이이면 +8점
		//31이상이면 +7점을 부여한다.
		
		
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
		
		
		
		//up1
		//0부터 12사이면 +10점을 획득하고
		//0-1 사이이면 보너스 점수를 획득한다. 
		//보너스 점수는 현재 point의 10% 이다.
		
		
		//up1 solution
		point = 20;
		x = -1;
		
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
