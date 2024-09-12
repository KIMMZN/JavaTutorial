package _08_Array2_2nd_Day_0911;
import java.util.Scanner;

public class Tetsris_01_0911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		         //    0.0 > 0 | 0.1 > 0 | 0.2 > 1
				//     1.0 > 1 | 1.1 > 1 | 1.2 > 1
				//     2.0 > 1 | 2.1 > 0 | 2.2 > 0
			 	// 오른쪽으로 돌렸을때의 좌표를 확인.
				
				// ** 오른쪽으로 돌렸을때 좌표
				// 2.0 // 1.0//0.0
				// 2 1 // 1.1//0.1
				// 2 2//1 2//0 2
				// 좌표 확인 한뒤 좌표에 맞게 for문으로 돌리기.
		
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
				System.out.println("오른쪽회전 합니다. x버튼을 입력하세요. ");
				
				String ab = in.nextLine();
				
				
				int row = temparr.length;
				int cul = temparr[0].length;
				if(ab.equals("x")) {
					for(int j=0; j<=row-1; j++) {
						
						//System.out.println(i);
							for(int i=row-1; i>=0; i--) {					
								
								//a[i][j]
								System.out.print(i+" "+j+" "+"|"+temparr[i][j]+"|"+"\t");
							}
							System.out.println();
					}
								
				}else {
					continue;
				}
							
				}			
			

			}

		}
