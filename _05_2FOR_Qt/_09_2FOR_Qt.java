package _05_2FOR_Qt;

public class _09_2FOR_Qt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// qt.r1이 제일좋음;
		

		//9. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요 <이중For사용>
		// String ttt ="aabbbcccaaaaddbbbaaaaa";
			String ttt ="aabbbcccaaaaddbbbaaaaa";					
			int numR = 0;
			int num =1;
			
			
			char name = ' ';
			for(int i =0; i<ttt.length(); i++) {
					char ch1=ttt.charAt(i);
					num = 1;
					
				for(int j =i+1; j<ttt.length(); j++) {
					char ch2 = ttt.charAt(j);
					//System.out.println(ch2);
					if(ch1 == ch2) {
						num++;								
					}else {																
						break;
					}							
				}
			
				if (num >= numR) {
					numR=num;
					name = ch1;
				}
			
					
			//System.out.println();
			
		}
		System.out.println("터널의 이름은: " + name +" 터널의 길이는: "+numR);


	}

}
