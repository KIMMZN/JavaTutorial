package _05_2FOR_0820;

public class asdvasdv {

	public static void main(String[] args) {
        int[] b = {93, 45, 83, 58, 75, 56};
        
        // 선택 정렬을 통해 오름차순으로 정렬합니다.
        for (int i = 0; i < b.length; i++) {
            // 현재 인덱스 i부터 배열의 끝까지 탐색하여 최대값을 찾습니다.
            int maxIndex = i;
            for (int j = i + 1; j < b.length; j++) {
                if (b[j] > b[maxIndex]) {
                    maxIndex = j;
                }
            }
            // 최대값을 현재 위치 i로 이동시킵니다.
            if (maxIndex != i) {
                int temp = b[i];
                b[i] = b[maxIndex];
                b[maxIndex] = temp;
            }
        }
        
        // 결과를 출력합니다.
        for (int value : b) {
            System.out.print(value + " ");
        }
    }
}