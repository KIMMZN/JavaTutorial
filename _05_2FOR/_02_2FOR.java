package _05_2FOR;

public class _02_2FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id = "abc*"; // id
		String sign= "*^$"; // 특수문자를 정의 (*나 ^, $같은것들)
		//문)_id에 특수문자가 있는가?
		// sign의 0번 문자부터 찾는다.
		// id의 0번 문자가 특수문자인가?
		//sign = i
		//id = j
		
	/*	i = 0 ;           j= 1;
		j =0; 			   i=0 ;
		   1                 1;
		   2                 2;
		   3                                                     */
		int cnt =0;
		for(int i=0; i<sign.length(); i++) {
			
			for(int j=0; j<id.length(); j++) {
				if(sign.charAt(i)==id.charAt(j)) {
					cnt++;
				}
			}
		}
		if(cnt>0) {
			System.out.println("특수문자포함됨 " + cnt + "번");
		}
		
		
		

	}

}
