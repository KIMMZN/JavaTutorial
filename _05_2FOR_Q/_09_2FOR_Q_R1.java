package _05_2FOR_Q;

public class _09_2FOR_Q_R1 {

	public static void main(String[] args) {							
				//9. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요 <이중For사용>
				// String ttt ="aabbbcccaaaaddbbbaaaaa";
					String ttt ="aabbbcccaaaaddbbbaaaaa";	
				//a 중에 가장 긴 a?	
					//i= i+cnt-1;
					
					int cnt =0;
					int cntM =0;
					char name = ' ';
					for(int i=0; i<ttt.length(); i++) {
						char ch1=ttt.charAt(i);
						cnt = 0;
						
						for(int j =i; j<ttt.length(); j++) {
							char ch2 = ttt.charAt(j);
						//System.out.println(ch2);
							if(ch1 == ch2) {
								cnt++;								
							}else {																
								break;
							}							
					}
						if (cntM < cnt) {
							cntM = cnt;
							i= i+cnt-1; // 중첩 안되게
							name = ttt.charAt(i);
							//System.out.println(cntM +""+ ttt.charAt(i));
						}
					}
					System.out.println("가장긴터널의 알파벳 이름: " + name + " " + ", 길이: " + cntM   );

			}

		}

		
	


