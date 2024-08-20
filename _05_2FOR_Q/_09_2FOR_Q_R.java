package _05_2FOR_Q;

public class _09_2FOR_Q_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요 <이중For사용>
		// String ttt ="aabbbcccaaaaddbbbaaaaa";
			String ttt ="aabbbcccaaaaddbbbaaaaa";	
		//a 중에 가장 긴 a?	
			//i= i+cnt-1;
			
			int cnt =0;
			int cntM =0;
			char name = ' ';
			for(int i=0; i<ttt.length(); i++) {
				char temp=ttt.charAt(i);
				cnt=0;
				
				if(temp =='a') {
					for(int j=i; j<ttt.length(); j++) {
						if(ttt.charAt(j) != 'a') {
							break;
						}
						else {
							cnt++;
						}
					}
					
					
				}
				if (cntM < cnt) {
					cntM = cnt;
					i= i+cnt-1; // 중첩 안되게
					name = ttt.charAt(i);
					//System.out.println(cntM +""+ ttt.charAt(i));
				}
			}
			System.out.println(cntM + " " + name);

	}

}
