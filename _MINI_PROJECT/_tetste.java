package _MINI_PROJECT;

public class _tetste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="aabbccddeeeaaaaa";
		int cnt =0;
		int cnta =0;
		
		char aname = ' '; 
		for(int i =0; i<a.length(); i++) {
			char char1 = a.charAt(i);
			cnt =0;
			
			if(char1 == 'a') {
				for (int j=i; j<a.length(); j++) {
					if (a.charAt(j) != 'a') {
						break;
					}else {
						cnt++;
					}
					
				}
			}
			
			if (cnt > cnta) {
				cnta = cnt;
				i=i+cnt-1;
				aname = a.charAt(i);
				//System.out.println(cnta +""+ a.charAt(i));

			}		
		}
		
		System.out.println("가장 긴 " + aname +"의 길이는 , " + cnta);
		
		
		
	}

}
