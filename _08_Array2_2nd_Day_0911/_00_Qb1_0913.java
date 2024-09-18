package _08_Array2_2nd_Day_0911;

public class _00_Qb1_0913 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//먼저 생성자 구하는 식부터 만들자
		//(num/1000) +" "+(num/100%10)+" "+ (num%100/10)+" " + (num%10)+ " " + (num)
	    // 생성자를 갖는 숫자는 구했다.
		// 생성자가 없는 number를 어떻게 구하나
		// 일단 배열에 생성자가 있는 숫자를 저장하자.
		
		//배열 생성. 생성자를 저장할 배열과, 1부터 5000까지의 숫자를 담을 배열.
		int [] a = new int[5001]; // 0~5000
		int [] b = new int[5001];
		int sum =0;
	    for(int i =1; i<=5000; i++) {
	    	for(int j=1; j<=5000; j++) {
	    		if((i/1000)+(i/100%10)+ (i%100/10) + (i%10) + (i) == j) {
	    			//i를 계산한 값이 j와 같다면
	    			//a[i]에 j(생성자)를 저장
	    			//System.out.println("생성자는"+j);
	    			a[i] = j;
	    			//System.out.println(a[i] +" "+ i);
	    		}
	    	}
	    }
	    //배열에 저장되지 않은 숫자(생성자가아닌)를 알아내야한다.
	    //..음
	    //숫자 1~5000과 생성자가 저장되어있는 배열의 숫자를 비교했을때
	    //겹치지 않는 숫자가 생성자이다.
	    //겹치는 숫자가 있는지 없는지를 확인하기 위해서
	    //확인하는 변수도 만들자.
	    
	   
	   int check = 0;  //있는지 없는지 확인하는 변수
	   for(int k =1; k<=5000; k++) {
		  b[k] = k;
		  //System.out.println(a[k]);
		  for(int j =1; j<=5000; j++) {
			if (a[j] == b[k]) { //생성자가 저장되어있는 배열의 숫자와 숫자가 같다면
				//System.out.println(j);
				check = 1; //같다면 check를 1로 만든다.
			}
		  }
		  
		  if(check ==0) {//필요한건 같지 않을때이기 때문에, check가 0이라면(같지않다면)
			  sum = sum + k; //sum에 값을 저장한다.
			  //System.out.println(sum);
		  }
		  //System.out.println(a[k]+" "+k);
		  check = 0; //check를 재사용 해야되기 때문에 0으로 초기화한다.
	   }
	    System.out.println("1부터 5천까지의 숫자중 셀프 넘버의 합: " + sum);
		
	}

}
