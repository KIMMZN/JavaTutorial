package _05_2FOR;

public class _01_2FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0; i<1; i++) {
			for(int j=0; j<4; j++) {
				//System.out.println("***");
			}
			//System.out.println();
		}
		
		//예) 요일 안에 24시간
		//i = 0; ㅡ> j=0 1 2;
		//i = 1; ㅡ> j=0 1 2;
		//i = 2; ㅡ> j=0 1 2;
		
		for(int k=0; k<4; k++) {
			
			for(int p=0; p<=k; p++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
		
		

	}

}
