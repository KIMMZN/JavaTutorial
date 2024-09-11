package _08_Array2_2nd_Day_0911;
import java.util.Scanner;

public class Tetsris_01_0911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
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
		
		while(true) { 		
		System.out.println("오른쪽회전 합니다. a버튼을 누르세요 ");
		
		String ab = in.nextLine();
		
		if(ab.equals("a")) {
			for(int i=0; i<temparr.length; i++) {
				
				//System.out.println(i);
					for(int j=0; j<temparr[0].length; j++) {
						
						if(temparr[0][j] == 1) {
							temparr[0][j] = 0;
						}else {
							temparr[0][j] =1;
						}
						if(temparr[1][j] == 0) {
							temparr[1][j] =1;
						}
						if(temparr[2][j] == 0) {
							temparr[2][j] = 1;
						}else {
							temparr[2][j] = 0;
						}
						
						
						System.out.print(temparr[i][j]+"\t");
					}
					System.out.println();
				}
						
		}else {
			continue;
		}
					
		}			
	

	}

}
