package _01Array;

public class QbasicArray2 {

	public static void main(String[] args) {
		//q1
		int[] nums = new int[5];
		nums[0] = 30;
		nums[1] = 40;
		nums[2] = 50;
		nums[3] = 60;
		nums[4] = 55;
		System.out.println("기본문제 1: " + nums[0]+"/"+nums[1]+"/"+nums[2]+"/"+nums[3]+"/"+nums[4]);
		
		//q2
		String[] lastname = new String[3];
		lastname[0] = "kim";
		lastname[1] = "lee";
		lastname[2] = "park";
		System.out.println("기본문제 2: " + lastname[0]+"/"+lastname[1]+"/"+lastname[2]);
		
		//q3
		//int[] lotto = new int[6];
		int[] lotto = {6,12,33,4,5,26};
		lotto[2] += 2;
		System.out.println("기본문제 3: " + lotto[2]);
		
		//q4
		int oddNumber = lotto[0] + lotto[2] + lotto[4];
		System.out.println("기본문제 4: " + oddNumber);
		
		System.out.println("-------------------------------------");
		
		//q5
		lotto[0] = lotto[0];
		lotto[1] += lotto[0];
		lotto[2] += lotto[1];
		lotto[3] += lotto[2];
		lotto[4] += lotto[3];
		lotto[5] += lotto[4];
		
		//q6
		//System.out.println(lotto[3]); ==> 87 oddnumber
		System.out.println("문제 6: " + (lotto[3] % 2 == 1));
		
		//q7 거스름돈을 구해보자;
		int money = 2750;
		int pay = 10000;
		int result = pay - money;
		System.out.println(result);
		System.out.println("문제 6: " + "천원: " + (result%10000/1000) + "개, " + "백원: "+ ((result%1000)/100) + "개, "
		
				           + "" + "십원: " + ((result%100)/10) + "개" );
		
		System.out.println("---------------------------------------");
		
		//q8
		
		int xA = 700;
		int yA = 500;
		int xB = 900;
		int yB = 300;
		
		int xC = 650;
		int yC = 150;
		
		System.out.println(xA <= xC && xC <= (xB-3) && yA >= yC && yC >= (yB+3));
				
		// xA < xC && xC < xB && yA > yC && yC > yB
		
		
		/* 이름 학번 나이 성적
		
		string 이름 
		int 나이 학번 성적
		
		
		
		나이: 나이>18 수강신청 x
		성적: 60 <= 성적 && 성적 > 70 ; 이면 이름 뒤 * 추가 */
		
		
		
		
		
		
		
				
		
				
				
		



		
		
		
		
		

	}

}
