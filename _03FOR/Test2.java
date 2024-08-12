package _03FOR;

public class Test2 {

	public static void main(String[] args) {
	
		//
		//15.  String ttt ="aabbbcccaaaaddbbbaaaaa";
		//   압축하시오. 압축 하는 방법 a2b3c3a4d2b3a5
		
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		int cnt=0; String resultZip=""; char bt = ttt.charAt(0);
		int maxCnt = 0; int maxNumber=0;
		
		for(int i =0; i < ttt.length(); i++) {
			if(bt == ttt.charAt(i)) {
				cnt++;
			} else {
				resultZip =  resultZip + (char)bt + cnt;
				bt = ttt.charAt(i);
				cnt = 1;
			}
			if(maxCnt < cnt) { //15번 문제에서는 불필요
				maxCnt = cnt;
				maxNumber=bt;
			}
		} 
		resultZip =  resultZip + (char)bt + cnt;
		
		System.out.println(resultZip); //15번 문제 확인
		System.out.println(maxCnt + "/"+(char)bt); // 14번 문제 확인
		

	     

	     
	     

	}

}
