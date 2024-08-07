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
		
		//ta
		int maxValue = 0;	//초기값 0설정
		int maxIndex = 0;	//뽑는 번호
		//  초기값보다 그 조건이 크면 초기값에 그 조건을 저장 후, 다음 조건과 같으면 변수에 값을 저장 아니면 저장 x; 또 다음 조건과 비교후 맞으면 변수에 저장 아니면x
		int temp = a[0]/10 + a[0]%10; // 10의 자리와 1의 자리를 분리하고 더한 값을 temp에 저장 // 
		if(maxValue < temp) {	//첫뻔재 temp의 값이 maxvale 보다 크면 
			maxValue = temp;	//maxvale 에 temp값을 저장 하고
			maxIndex = 0;		//maxindex = 0 으로 저장하라
		} System.out.println("maxval" + maxValue);
		  System.out.println("maxindex " + maxIndex);
		
		temp = a[1]/10 + a[1]%10; //temp 조건 1
		if(maxValue < temp) {	// 현재 maxval에 temp[0]저장되어 있음 그것과 새로운 temp[1] 비교
			maxValue = temp;	// 위 조건이 맞다면 maxval에 temp값을 저장인데 조건이 맞지 않아서 저장 x
			maxIndex = 1;
		} System.out.println("maxval" + maxValue);
		  System.out.println("maxindex " + maxIndex);
		
		temp = a[2]/10 + a[2]%10; // 마지막 비교
		if(maxValue < temp) { // maxval은 현재 temp[0]값, temp[2]값과 비교 // 
			maxValue = temp; // temp[2]가 더 크기때문에 maxvalue 변화
			maxIndex = 2;	// tmep[2]가 더 크기때문에 maxindex 에 = 2를 저장
		} System.out.println("maxval" + maxValue);
		
		System.out.println("maxindex " + maxIndex); // maxindex = 2 ; 2번째 뽑기의 조합의 숫자가 가자음
		
		
		
		//ma
		if (a0 > a1 && a0 > a2) {
			System.out.println("답1");			
		}else if (a1 > a0 && a1 >a2) {
			System.out.println("답2");
		}else if (a2 > a0 && a2 > a1) {
			System.out.println("답3");
		}
		
		//up.q.8
		//ta
		int[] x = {6,5,9};
		int[] y = {4,10,6};
		double k = 3.0/2.0;
		
		System.out.println("k" +k);
		System.out.println(k == (double)x[0]/y[0]);
		System.out.println((double)x[0]/y[0]);
		System.out.println((double)x[1]/y[1]);
		System.out.println((double)x[2]/y[2]);
		System.out.println((int)x[0]/y[0]);
		
		if (k == (double)x[0]/y[0]) {
			System.out.println("0번 입니더.");
		}
		if (k == (double)x[1]/y[1]) {
			System.out.println("1번 입니더.");
		}
		if (k == (double)x[2]/y[2]) {
			System.out.println("2번 입니더.");
		}
		
		
		
		
		//bx =3
		//by =2
		
		//x[0] y[0]
		// 0번 6.4
		// 1번 5,10
		// 2번 9,6
				
		//int bb1 = x[0]%3 == 0;
		//int bb2 = y[0]%2 == 0;
		
		//ma
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
			
			//int y1 = 20; //사이즈 가로:5, 세로:6
			
			
			//int mx = 11;
			//int my = 8;		//미사일 사이즈 가로:2, 세로:2
			
			//x1 mx x1+5;
			//y1 < my > y1+6
			
			int targetX = 10;
			int targetY = 20;
			int targetWidth = 5;
			int targetHeight = 6;
			
			int missX = 11;
			int missY = 5;
			int missSize = 2;
			
			int missY2 = missY+2;
			System.out.println(missY2);
			
			//미사일의 X 좌표가 곁치는지 판별
			//미사일의 X 좌표 (missileX)와 몬스트와 닿는 지점(조정필요 왼쪽으로는 미사일 사이즈만큼 줄이고 . 오른쪽으로는 몬스터 가로 사이즈와 미사일 사이즈 만큼 조정)
			// System.out.println(((monsterX-missileSize)<=missileX) && ((monsterX+monsterWidth+missileSize)>=missileX));
			System.out.println(((targetX - missSize)<=missX) && ((targetX+targetWidth+missSize)>=missX));
	        
			

			//미사일의 Y 좌표가 곁치는지 판별
			//미사일의 Y 좌표를 정정할 필요 있음. 미사일은 직진이므로 미사일의 윗 부분에 맞는다. 그래서 missilY2로 조정
			//System.out.println((monsterY <= missileY2) && (monsterY+monsterHeight >= missileY2));
			
			//(targetY <= missY2) && ((targetY + targetHeight) >= missY2))
			System.out.println((targetY <= missY2) && ((targetY + targetHeight) >= missY2));
			
			System.out.println(((targetX - missSize)<=missX) && ((targetX+targetWidth+missSize)>=missX) &&
					            (targetY <= missY2) && ((targetY + targetHeight) >= missY2));
					
					
			
			
					
		
		
		
		
		
		
		

	}

}
