package _03FOR_0812;

public class For0812_work_04 {

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1};
        int size = 3;  // 건물의 크기
        
        int count = 0;  // 가능한 위치의 개수
        int currentLength = 0;  // 현재 연속된 0의 길이
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                currentLength++;  // 연속된 0의 길이를 증가시킴
            } 
            else {
                if (currentLength >= size) {
                    // 연속된 0의 길이가 size 이상일 경우, 위치를 계산
                    count += (currentLength - size + 1);
                }
                currentLength = 0;  // 연속된 0의 길이를 초기화
            }
        }
        
        // 배열의 끝에서 연속된 0의 길이를 다시 한 번 확인
        if (currentLength >= size) {
            count += (currentLength - size + 1);
        }
        
        System.out.println("건물을 지을 수 있는 위치의 개수: " + count);
    }
}