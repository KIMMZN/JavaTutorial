package _03FOR;

public class for_work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이중 For는 사용하지 않습니다.

		// 다음 실행 결과를 손코딩으로 예측해 보세요
		
		for(int i=0; i<5; i++){ // i=0; i가 5보다 작으면 실행; 후 i + 1; 5와 같아지면 스탑.
			System.out.println(i);
			
		}
		 // 0 1 2 3 4
			


		//2.
		for(int i=5; i>=0; i--){ //i에 5저장; 0보다 i가 같거나 크면 실행; 후 i에 -1 반복; 0과 같아지거나 커지면 스탑;
			System.out.println(i);
			

		}
		// 5 4 3 2 1
			
  /*
		//3. 
		for(int i=0; i<100; i++){ // i = 0; i가 100보다 작으면 실행; i++
			if(i%2==0){
				sysout(i)
			}

		} 
			  0 % 2 == 0
			  
			  2 % 2 == 0
			  4 % 2 == 0
			  ..
			  98 % 2 ==0
			

		4.
		int sum=0;
		for(int i=0; i<5; i++){
			sum=sum+1;
		}
		sysout(sum);
		i=0 :: sum = sum+1
		i=1 :: sum = sum+1
		i+2 :: sum = sum+1
		i+3 :: sum = sum+1
		i+4 :: sum = sum+1
		System.out.println(sum);
			
		 */
		
		System.out.println("----------------------------------");
		//1. 1부터 100까지 숫자 중 홀수는 더하고 짝수는 뺀 결과값 1개를 출력하시오.
		
		// 1~100 ;; 숫자 중 홀수는 더하기 ;; 짝수는 빼기
		// (i % 2 == 1)  
		int oddsum = 0;
		int evenminus = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				oddsum += i; 
			}else if (i%2==0) {
				evenminus += i;
			}
			
			
		}System.out.println("1번 결과: " + (evenminus - oddsum));
		
		//2. 1부터 100까지 숫자 중 홀수는 홀수끼리 더한 값을 짝수는 짝수끼리 더한 값을 각각출력하시오.
		
		// 1~100 숫자반복 ; 홀수 홀수끼리 더하기; 짝수는 짝수기리 더하기 ;;
		int odd = 0;
		int even = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				odd += i;
			}else if (i%2==0) {
				even += i;
			}
		}
		System.out.println("홀수는 "+ odd + ", 짝수는 "+ even);
		
		//3. 1부터 100까지 숫자 중 홀수는 모두 몇개인가?
		//1 ~ 100;  홀수 count;
		//홀수 : x % == 1
		int oddctn = 0;
		
		for(int i = 1; i<=100; i++) {
			if(i%2==1) {
				++oddctn;
			}
		}
		System.out.println("홀수의 숫자: "+ oddctn);
		
		//4. 100부터 999까지의 숫자의 모든 숫자의 합을 구하시오.
	    //453인 경우 4+5+3로 합한 값의 모든 총합을 구하시오. 
		// 100 453/100;           100자리
		// 10 (453%100)/10;     10자리
		// 1 (453%10);            1자리

		//System.out.println(453/100);
		//System.out.println((453%100)/10);
		//System.out.println(453%10);
		
		
		int sum999 = 0;
		int num453 =0;
		
		
		for(int i = 100; i<=999; i++) {
			sum999 += i;
			if(i==453) {
				num453 = ((i/100) + ((i%100)/10) + (i%10));
			}
		}System.out.println("100부터 999: "+ sum999);
		 System.out.println("4+5+3: " + num453);
		 
		 // 5. 범인은 100부터 999까지 숫자에 숨어 있다.
		 //  범인은 십의 자리에 있고. 3의 배수이다. 범인 숫자를 모두 출력하시오.
		 
		 // 100 ~ 999 반복; 3의 배수인 십의 자리 숫자;
		 // (i%100)/10; && i%3 == 0 ;; ++bctn;
		 //
		 	
		 
		  int num33 = 0;
		  int numtenth = 0;
		 for(int i=100; i <= 999; i++) {
			 
			 if (i%3 == 0) {
				 num33 = i;
				 numtenth = (i%100)/10;
				 
				 
				 System.out.println(num33 +", "+ numtenth);
				 
			 } 
			 
		 }
			 
			 
			
		 
		 //6. 범인을 찾아라. 0부터 100까지 숫자중 하나이다. 0부터 1 2 3 순서대로 합한 값을
		 //누적한다. 합한 값이 44를 넘어가게 하는 숫자 한개가 범인이다.
		 //범인 숫자 한 개를 출력하시오.. (단, break사용하지 않는다)
		 
		 // i + (i+1)
		   
		 
		 int nnums = 0;
		 int addnumt = 0;
		 for (int i = 0; i<=100; i++) {
			 
			 System.out.println(nnums);
			 if(nnums > 44) {
				 addnumt = i;
				 i = 150;
			 }
			 
		 } System.out.println("6번은: "+ addnumt);
		 
				 
		 //7. 1 2 3 4 5 6 7 8 9 10 = 결과
		 
		 //int answ = 1+2+3+4+5+6+7+8+9+10;
		// System.out.print("1+2+3+4+5+6+7+8+9+10 = "+ answ);
		 
		 
		 String sss = "+";
		 int resultnn = 0;
		 for (int i= 1; i <= 10; i++) {
			 			 			
			 
			 sss = "+";
			 System.out.print(i);
			 resultnn += i;
			 System.out.print(sss);
			 
			
			 
			 
			 
			 
			 
		 }
		 System.out.println(resultnn);
		 
		
		
		
		
		
		
		//9번
		 for(int i=1; 1<20; ) {
			 
		 }
		
		
		
	}
}


