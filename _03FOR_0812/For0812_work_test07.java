package _03FOR_0812;

public class For0812_work_test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//특별1
	   /*String a = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		문자열 a는 한자릿수의 숫자를 수집한 문자열이다.
		숫자별로 수집된 수만큼 카운팅하세요.
		카운팅 배열은
		int[] a = new int[10]; 
		// 위 선언문은 길이 10의 배열을 생성한 선언문이다. 초기값은 0이다.
		// 인덱스 0 - 9까지를 숫자로 정의한다.
		조건 : 형변환은 사용하지 않는다. 메서드는  charAt()만 사용한다. */
		//for문
		
		String a = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		int[] a1 = new int[10];
		
		for(int i =0; i < a.length(); i++) {
		
			    if(a.charAt(i) != '/' ) {
			    	if(a.charAt(i) == '1') 
			    		a1[1]++;
			    	if(a.charAt(i) == '2') 
			    		a1[2]++;
			    	if(a.charAt(i) == '3') 
			    		a1[3]++;
			    	if(a.charAt(i) == '4') 
			    		a1[4]++;
			    	if(a.charAt(i) == '5') 
			    		a1[5]++;
			    	if(a.charAt(i) == '6') 
			    		a1[6]++;
			    	if(a.charAt(i) == '7') 
			    		a1[7]++;
			    	if(a.charAt(i) == '8') 
			    		a1[8]++;
			    	if(a.charAt(i) == '9') 
			    		a1[9]++;
			    				    				    				    				    	
			}
		}
						
		System.out.println(a1[1]);
		
		for (int b = 1; b < a1.length; b++ ) {
			System.out.print(b + "개수:" + a1[b]+ ",");
		}
		
		//System.out.println("ㅇㄻ" + );
		
		
		

	}

}
