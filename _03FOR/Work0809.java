package _03FOR;

public class Work0809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1. 100부터 999까지의 숫자중에서 홀수만 출력하시오.
		
		for(int i = 100; i <= 999; i++) {
			
			if (i%2==1) {
				System.out.println("1.홀수만: "+ i);
			}
							
		}
		
	//2. 1부터 100까지 숫자중에서 홀수의 총합을 구하시오.
		
		int oddsum = 0;
		for (int i =1; i<=100; i++) {
			
			if(i%2 == 1) {
				oddsum += i;
				
			}
		}System.out.println("2.홀수총합: " + oddsum);
		
	//3. 다음과 같이 출력하시오   10  9  8  7  6  5  4  3  2  1
		// i = 10; i--
		
		
		for(int i=10; i>0; i--) {
			System.out.println("3.출력: " + i);
			
		}
		
	//4. 배열에서 배열의 값이 짝수인 것만 출력하시오.
		// x % 2== 0;
		
		int[] arr = {45,23,25,64,3,24,48};						
		for (int i = 0; i <= 6; i++ ) {									
			if((arr[i]) %2 ==0) {
				System.out.println("배열의 짝수는 " + arr[i]);
			}
			
		}
		
	//6.배열에서 배열의 값이 홀수 인 곳의 인덱스만 출력하시오.
		
		  int[] arr2 = {45,23,25,64,3,24,48};
		  for (int i = 0; i <= 6; i++ ) {
			  if(arr2[i]%2 ==1) {
				  System.out.println("배열의 홀수는: "+ arr2[i]);
			  }
		  }
		  
	//7. int[] arr = {45,23,25,64,3,24,48}
	//	   배열의 값을 모두 더한 총합을 구하시오.	
		  int[] arr3 = {45,23,25,64,3,24,48};
		  
		  int arrsum =0;
		  for (int i = 0; i <= 6; i++ ) {
			  
			  arrsum += arr3[i];
		  }System.out.println("배열의 총합: " + arrsum);
	
	 //8. int[] arr = {45,23,25,64,3,24,48}
	 //	   짝수는 모두 몇개인가요?
		  int[] arr4 = {45,23,25,64,3,24,48};
		  int evenctn = 0;
		  
		  for (int i = 0; i <= 6; i++ ) {
			  
			  if(arr4[i]%2==0) {
				  evenctn++;
				  
			  }
		  } System.out.println("짝수는 모두: "+ evenctn + "개");
		  
	//9.     String test = "abcdeabce";
	//	    for(int i=0; i < 9; i ++){
	//	    	char aaa = test.charAt(i);
	//	    	sysout(aaa);
	//	   }

	//	       위 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요.
		  
		    String test = "abcdeabce";		    
		    int anum = 0;
		    //charAt(i) // 'a' != a or "a"
		    
		    for(int i=0; i < 9; i ++){		    		    	
		    	if (test.charAt(i) == 'a') {
		    		anum++;		    		
		    	}
		    			    		    			
		    }System.out.println("a의 개수는: " + anum);
		    
		    
		// 10.  int[] arr = {45,23,25,64,3,24,48} 
		//    배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
		    // maxvalue = 0;
		    // 1. maxvalue 구하기. // 2. 
		    
		    int[] arr5 = {45,23,25,64,3,24,48};
		    
		    int maxValue = 0;
		    int maxIndex = 0;
		    for(int i=0; i<7; i++) {
		    	
		    	// if문 작동했을때 maxIndex에 i값을 저장하기 때문에 maxVal 구하기 가능
		    	// for문 i =0으로 설정한것이 인덱스 시작 번호와 같아서 구하기 쉽다;
		    	
		    	if (arr5[i] > maxValue) {
		    		maxValue = arr5[i];
		    		maxIndex = i;
		    		
		    		
		    	}
		    	
		    	 
		    } System.out.println("가장 큰값은: " + maxValue);
		     System.out.println("가장 큰값의 인덱스는: " + maxIndex);
		     
		  //11. 범인 숫자 구하기.. 
		  //   범인은 100부터 999까지 숫자중에 여러명이다. 
		  //   범인의 특징은 숫자의 각자릿수를 더한 값이 짝수이다.  범인의 숫자를 모두 찾으시오.
		     
		     //System.out.println("100의 자리" + 357/100);
		     //System.out.println("10의자리" + (357/10)%10);		     
		     //System.out.println("1의자리" + 357%10);
		     // i/100 + ((i/10)%10) + (i%10) // 짝수 : i%2 == 0
		     //System.out.println((357/100) + ((357/10)%10) + (357%10) );
		     		      		    		     
		     
		     
		     for(int i = 100; i <= 999; i++) {
		    	 
		    	 if(((i/100) + ((i/10)%10) + (i%10))%2 ==0 ) {
		    		 System.out.println("범인의 숫자: " + i);
		    		 
		    	 }
		     }
		     
		     
		     
		     //12. int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3}
		     //0은 터널이다. 가장 긴 터널의 길이를 구하시오.
		     
		     int[] arr12 = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		     // 0찍기 // 0의 카운트?
		     
		     //개수 구하고 저장 , 초기화 , 저장된 전 게수와 현재 개수 비교 저장, 출력
		     
		     int ctnnl =0;
		     int rtnn1 =0;
		     
		     for(int i = 0; i < arr12.length; i++) {
		    	 
		    	if(arr12[i] == 0) {
		    		ctnnl++;
		    		if (ctnnl > rtnn1) {
		    		rtnn1 = ctnnl;
		    		}	
		        }else {
		    		ctnnl = 0;
		    	}
		    	 
		     }System.out.println(rtnn1);
		     
		     
		     
		  // 13. int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,0,0,0,0,0,3,3}
		     // 숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.   
		     //arr 13과 arrsave 비교 첫번째와 두번째 if 사이에서
		     
		     int[] arr13 = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,0,0,0,0,0,3,3};
		     
		     int longnum = 0;
		     int longnumr = 0;
		     int arrsave = 0;
		     int arrsaveb = 0;
		     int barrynum = 0;
		     
		     
		     for(int i = 0; i < arr13.length; i++) {
		    	 
		    	  if(arr13[i] >= 0) {
		    		
		    		  //만약 현재값이 예전 값과 같다면 ++ 해라
		    		  //arrsave가 arrsaveb와 같다면 longnum ++해라;
		    		  
		    		  arrsaveb = arrsave;
		    		  arrsave = arr13[i];
		    		 
		    		  
		    		  if(arrsave == arrsaveb) {
		    			  longnum++;
		    			  
		    			  
		    			  if(longnum > longnumr) {
		    				  longnumr = longnum;
		    				  barrynum = arr13[i];
		    				 
		    			  }
		    		  
		    		 }else {
		    			 longnum = 0;
		    		 }
		    	  }
		    	 
		    	 
		    	 
		     }System.out.println("13터널의 길이:" +  (longnumr+1) + ", 13가장 긴 터널의 숫자: " + barrynum  );
		     
		     
		     
		   //14. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요
		     //String ttt ="aabbbcccaaaaddbbbaaaaa";
		     //System.out.println(ttt.charAt(1));
		     //System.out.println("테스트" + ttt.length());
		     //charat는 문자,
		     
		     
		     	String ttt ="aabbbcccaaaaddbbbaaaaaffppjjjjjjjjsss";

			       
			  /*     abbb     count  =0        abbb  count =1
			       a a count 1                 a  a   2
			       b a count 0                 b  a   1
			       b b count 1                 b  b   2
			       b b count 2;                b  b   3 */
		    	
		    	
		    	
		    	char charcurrent = ttt.charAt(0);
		    	int countcurrent = 0;
		    	int countresult = 0;
		    	char charbbchar = 0;
		    	
		    	for (int i = 0; i < ttt.length(); i++) {
		    
		    		       
		    		if(ttt.charAt(i) == charcurrent) {
		    			countcurrent++;
		    			
		    			if(countcurrent > countresult) {
		    				countresult = countcurrent;
		    				charbbchar = ttt.charAt(i); 				
		    			}
		    				    			
		    		}else {
		    			charcurrent = ttt.charAt(i);
		    			countcurrent = 1;
		    		 }
		    	} System.out.println("14터널의 길이: " + countresult + "14가장 긴 터널의 길이: "+ charbbchar );
		    	
		     		
		     //
		     
		     
		     
		     
		     
		     
		     
		     
		    
		    
		    
		  
		  
		  
		  
		
		

	}

}
