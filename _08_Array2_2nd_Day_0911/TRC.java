package _08_Array2_2nd_Day_0911;

public class TRC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a = new int [4][5];
		int num = 1;
		
		int y = 0;
		for (int x = 0; x < a.length+a[0].length; x++) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					if (i + j == y) {
						a[i][j] = num;
						num++;
					}
				}
			} y++;
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}