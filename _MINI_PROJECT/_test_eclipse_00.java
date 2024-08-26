package _MINI_PROJECT;

public class _test_eclipse_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//새로운 자리에서 테스트중
		String a ="aabbccddeeeaaaaa";
		
		int ctn = 0;
		int ctna = 0;
		
		char charb = ' ';
		for (int i =0; i<a.length(); i++) {
			char chara = a.charAt(i);
			ctn =0;
			
			if(chara == 'a') {						
				for(int j =i; j<a.length(); j++) {
					if(a.charAt(j) != 'a') {
						break;
					}else {
						ctn++;
					}
				}
			}
			
			if (ctn > ctna) {
				ctna = ctn;
				i = i +ctn -1;
				charb = a.charAt(i);
			}
			
		}
		
		System.out.println(ctna);
		

	}

}
