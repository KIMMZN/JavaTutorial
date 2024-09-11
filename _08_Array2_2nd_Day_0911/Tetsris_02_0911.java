package _08_Array2_2nd_Day_0911;
import java.util.Scanner;

public class Tetsris_02_0911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//왼쪽 회전시 이건가
		//001
		//111
		//100
		Scanner in = new Scanner(System.in);
	
		int [][] temparr = {{1,1,0},
					  		{0,1,0},
					  		{0,1,1} };
		
		for(int i=0; i<temparr.length; i++) {
			
			//System.out.println(i);
			for(int j=0; j<temparr[0].length; j++) {
				System.out.print(temparr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("왼쪽으로 합니다. s버튼을 입력하세요 ");
		String ab = in.nextLine();

		for(int i=0; i<temparr.length; i++) {
			
			//System.out.println(i);
			for(int j=0; j<temparr[0].length; j++) {
				if(temparr[0][j] == 1) {
					temparr[0][j] = 0;
				}else {
					temparr[0][j] = 1;
				}
				if(temparr[1][j] == 0) {
					temparr[1][j] = 1;
				}
				if(temparr[2][j] == 1) {
					temparr[2][j] = 0;
				}else {
					temparr[2][j] = 1;
				}
				
				System.out.print(temparr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
	
		
		
		

	}

}
