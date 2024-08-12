package _03FOR_0812;

public class For0812_work_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	   
	        int[] a = {34, 2, 35, 8, 31, 45};

	        // 배열을 순회하면서 큰 값을 뒤로 이동시키기
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] > a[i + 1]) {
	            	// 34 > 2
	                // 두 값을 직접 교환
	                a[i] = a[i] + a[i + 1];
	                //36 = 34 + 2
	                a[i + 1] = a[i] - a[i + 1];
	                //32 = 34 - 2
	                a[i] = a[i] - a[i + 1];
	                //34 = 36 - 32
	            }
	        }

	        // 가장 큰 값 출력
	        System.out.println("가장 큰 값: " + a[a.length - 1]);
	        System.out.println(a.length);
	    }
	}