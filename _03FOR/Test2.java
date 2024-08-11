package _03FOR;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		//15.  String ttt ="aabbbcccaaaaddbbbaaaaa";
		//   압축하시오. 압축 하는 방법 a2b3c3a4d2b3a5
		
		String ttt = "aabbbcccaaaaddbbbaaaaa";

        int countNumber15 = 1;
        char charPre15 = ttt.charAt(0);
        

        for (int i = 1; i < ttt.length(); i++) {
            if (ttt.charAt(i) == charPre15) {
                countNumber15++;
            } else {
            	charPre15 = ttt.charAt(i);
                countNumber15 = 1;
            }
        }
            
              
				  


	}

}
