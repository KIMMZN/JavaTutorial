package _08_Array2;

public class _01_Q8_0910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8.위와 같은 게임 배열에서 같은 번호가 가로나 세로로 각각 3개 이상이면 제거가 가능하다.
		// 제거가 가능한 블록의 좌표를 출력하시오.

	        // 게임 배열
	        int[][] a = {
	            {1, 1, 0, 2},
	            {3, 2, 1, 2},
	            {0, 0, 3, 2},
	            {4, 4, 4, 4},
	            {2, 4, 3, 1},
	            {2, 4, 1, 3}
	        };

	        // 각 열에 대해 검사
	        for (int j = 0; j < a[0].length; j++) {
	            int count = 1; // 연속된 숫자의 개수
	            for (int i = 1; i < a.length; i++) {
	                if (a[i][j] == a[i - 1][j]) {
	                    count++;
	                } else {
	                    count = 1; // 연속이 끊겼으므로 초기화
	                }

	                // 연속된 숫자가 3개 이상일 때
	                if (count >= 3) {
	                    // 연속된 숫자의 위치를 출력
	                    for (int k = 0; k < count; k++) {
	                        System.out.println("Removable block at: (" + (i - k) + ", " + j + ")");
	                    }
	                }
	            }
	        }
	    }
	}