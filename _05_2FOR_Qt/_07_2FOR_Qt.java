package _05_2FOR_Qt;

public class _07_2FOR_Qt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
				/*	7. 거스름돈 구하기   10000원짜리 0개, 1000원짜리 0 개, 100짜리 0개, 10짜리 0개,   조건 : /나 %연산자는 각각 최대 두 번씩 사용가능
					   단, 거스름돈은 만천원이 최대 값이다. 
					int money=4570;  // 가격
					int pay = 10000;  //지불금액		*/
		
					int money=4570;  // 가격
					int pay = 10000;  //지불금액	
					int bill = pay-money;
					
					
					System.out.println("잔돈: " + bill);
					System.out.println("10000원짜리 : " + (bill)/10000 + "개");		
					System.out.println("1000원짜리 : " + (bill)/1000 + "개" );
					System.out.println("100원짜리 : " +(bill)%1000/100 + "개");
					System.out.println("10원짜리 : " +(bill)%100/10 + "개");
					System.out.println("1원짜리 : " +(bill)%10 + "개");
					


	}

}
