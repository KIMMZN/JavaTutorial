package _03FOR_0812_R;

public class For0812_work_03_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
										/*	3 비밀편지
											String word ="gehoudfkimjnlvy";
											int[] letter={8,12,3,13,1,14,3,4};
											letter  배열은 word문자열 알파벳의 위치이다.
											letter배열의 암호를 풀어서 편지의 내용을 출력하시오. */
		
											String word ="gehoudfkimjnlvy";
											int[] letter={8,12,3,13,1,14,3,4};
											
											
											StringBuilder message = new StringBuilder();
											//System.out.print("편지의 내용은: ");
											for (int i = 0; i< letter.length; i++) {
									
												//System.out.print(word.charAt(letter[i]));
												message.append(word.charAt(letter[i]));
												
												//System.out.print( word.charAt(letter[i]));
												
											}
											System.out.println("편지의 내용은: " + message);
				
	}

}
