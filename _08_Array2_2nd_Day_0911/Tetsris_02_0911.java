package _08_Array2_2nd_Day_0911;
import java.util.Scanner;

public class Tetsris_02_0911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//왼쪽 회전시 이건가
		//001
		//111
		//100
		//왼족으로 돌렸을때의 좌표 구하기;

		//** 왼쪽으로 돌렸을때 좌표.
		// 0 2 //1 2 //2 2
		// 01 // 11 // 21
		// 00 // 10 // 20
		
		//후 맞게 for문으로 생성
		
		Scanner in = new Scanner(System.in);
		
		int [][] temparr = {{1,1,0},
					  		{0,1,0},
					  		{0,1,1} };
		
		
		
		for(int i=0; i<temparr.length; i++) {
			
			//System.out.println(i);
			for(int j=0; j<temparr[0].length; j++) {
				System.out.print(i+" "+j+" "+"|"+temparr[i][j]+"|"+"\t");
			}
			System.out.println();
		}
		
		while(true) { 		
		System.out.println("왼쪽으로 회전 합니다. z버튼을 입력하세요. ");
		
		String ab = in.nextLine();
		
		
		int row = temparr.length;
		int cul = temparr[0].length;
		if(ab.equals("z")) {
			for(int i=row-1; i>=0; i--) {
				
				//System.out.println(i);
					for(int j=0; j<cul; j++) {					
						
						//a[i][j]
						System.out.print(j+" "+i+" "+"|"+temparr[j][i]+"|"+"\t");
					}
					System.out.println();
				}
						
		}else {
			continue;
		}
					
		}			
	

	}

}
