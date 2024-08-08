package _03FOR;

public class _03FOR_COPY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//손코딩으로 에측해보셍용;
		for(int i =0; i<5; i++) {
			System.out.println(i);
			
			
		}
	    //
		for(int i =5; i>=0; i--) { // i=5 초기값설정; i가 0과 같고 크다면 ; 뒤 i에 1을 빼라 반복; i가 0보다 작아지면 멈춤;
			System.out.println("2: " + i);
			
		}
		
		//
		for(int i=0; i<100; i++) { //i=5설정; i가100보다 작다면 실행; 후 i에 1추가 반복 후; 100 되면 스탑			
			if(i%2==0) {
				System.out.println("3번: " + i); //i를 2로나눈 나머지가 0이라면 i를 출력해라;
			}
		}
		
		//
		int sum=0;
		for(int i=0; i<5; i++) { // i = 0을 i =4까지 반복실행;
			sum=sum+1; //sum에 sum+1해라
		}
			System.out.println("4번은: " + sum);
		//0 1 2 3 4
		//0 : sum(0) = sum(0) +1;
		//1: sum(1) = sum(1) + 1;
		//2: sum(2) = sum(2) + 1;
		//3: sum(3) = sum(3) + 1;
		//4: sum(4) = sum(4) + 1;
		// sysout(sum) 은 sysout(5); 
			
		System.out.println("-----------------------");
		
		// 1부터 100까지 숫자 중 홀수는 더하고 짝수는 뺀 결과값 1개를 출력하시오.
		// 홀수 : %2 == 1;
		// 짝수 : %2 == 0;
		
		int odd = 0;
		int even = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2==1) {
				odd += i;
				
			}else if(i%2 == 0) {
				even -= i;
				System.out.println(even);
			}
		}System.out.println("홀수 더하기: " + odd +", 찍수빼기 : "+ even);
		
		// 2. 1부터 100까지 숫자 중 홀수는 홀수끼리 더한 값을 짝수는 짝수끼리 더한 값을 각각출력하시오.
		
		int odd1 = 0;
		int even1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2==1) {
				odd1 += i;
			}else if(i%2==0) {
				even1 += i;
			}
		}System.out.println("홀수는: " + odd1);
		System.out.println("짝수는: " + even1);
		
		// 3. 1부터 100까지 숫자 중 홀수는 모두 몇개인가?
		
		int oddctn = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2==1) {
				oddctn++; 
			}
		}System.out.println("홀수는 모두: " + oddctn);
		
		// 4. 100부터 999까지의 숫자의 모든 숫자의 합을 구하시오.
	    // 453인 경우 4+5+3로 합한 값의 모든 총합을 구하시오.
		
		 int addnum1 = 0;
		 int num453 = 0;
		 
		for(int i = 100; i <= 999; i++) {
			 
			 addnum1 += i;
			 if (i == 453) {
				 num453 = (i/100) + ((i%100)/10) + (453%10);
				 
			 }
		}
		
		System.out.println("100-900까지 숫자총합: " + addnum1);
		System.out.println("4+5+2: "+ num453);
		
		// 5. 범인은 100부터 999까지 숫자에 숨어 있다.
		// 범인은 십의 자리에 있고. 3의 배수이다. 범인 숫자를 모두 출력하시오.
		int num33 = 0;
		int bnum = 0;
		for(int i = 100; i <= 999; i++) {
			if (i % 3==0) {
				bnum = (i%100)/10;
				num33 = i;
				System.out.println("범인은: " + "3배수: "+num33+ ", 십의자리: " + bnum);
			}			
		}
		
		//6. 범인을 찾아라. 0부터 100까지 숫자중 하나이다. 0부터 1 2 3 순서대로 합한 값을
		//누적한다. 합한 값이 44를 넘어가게 하는 숫자 한개가 범인이다.
		//범인 숫자 한 개를 출력하시오.. (단, break사용하지 않는다)
		
		
 
		
		
		
		
	}

}
