package _05_2FOR_0820;

public class _04_2FOR_0820 {


    public static void main(String[] args) {
    	
    	
				
				/*4. int[] b = {93,45,83,58,75,56}
				다음조건에 따라 오름차순으로 정렬하시오.
				1. 가장큰 값을 찾아서 맨뒤 값과 교환한다.. 결과  {56,45,83,58,75,93}
				2. 두번째로 큰 값을 찾아서 맨뒤에서 두번째 자리의 값과 교환한다.  결과  {56,45,75,58,83,93}
				3. 세번째로 큰 값을 찾아서 맨뒤에서 세번째 자리의 값과 교환한다.  결과  {56,45,58,75,83,93}
				오름차순으로 정렬이 될때 까지 반복한다. */
    	
			        int[] b = {93, 45, 83, 58, 75, 56}; 
			        
			        
			        int maxIdx = 0; // 인덱스
			        for (int i = 0; i < b.length - 1; i++) {
			            maxIdx = 0; 
			           
			            // 가장 큰 값의 인덱스를 찾음
			            //System.out.println(b[maxIdx]);
			            for (int j = 0; j < b.length - i; j++) { // j=0부터 시작
			                if (b[j] > b[maxIdx]) { // 인덱스
			                	//System.out.println(b[j]);
			                    maxIdx = j;
			                    
			                }
			            }
			
			            // 찾은 값을 마지막 값과 교환
			            int temp = b[b.length -( 1 + i)]; // 인덱스를 temp에 임시저장;
			            b[b.length - (1 + i)] = b[maxIdx]; // 인덱스에 맥스 밸류 저장
			            b[maxIdx] = temp;				 // 맥스 인덱스 (밸류)에 = 교체할 인덱스밸류 저장; 마지막 인덱스 값을 가장 큰 밸류의 인덱스 값과 교환;
			        }
			
			        // 정렬된 배열 출력
			        for (int k = 0; k < b.length; k++) {
			            System.out.println(b[k]);
			        }
    }
}