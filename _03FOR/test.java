package _03FOR;

public class test {

	public static void main(String[] args) {
	
	     
	   //12. int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3}
	     //0은 터널이다. 가장 긴 터널의 길이를 구하시오.
	     
	     int[] arr12 = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
	     // 0찍기 // 0의 카운트?
	     
	     //개수 구하고 저장 , 초기화 , 저장된 전 게수와 현재 개수 비교 저장, 출력
	    
	     
	     
	     
	     int ctnnl =0;
	     int rtnn1 =0;
	     
	     for(int i = 0; i < arr12.length; i++) {
	    	 
	    	if(arr12[i] == 0) {
	    		ctnnl++;
	    		if (ctnnl > rtnn1) {
	    		rtnn1 = ctnnl;
	    		}	
	        }else {
	    		ctnnl = 0;
	    	 }
	    	 
	     }System.out.println(rtnn1);
	     
	     
	     // 13. int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,0,0,0,0,0,3,3}
	     // 숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.   
	     //arr 13과 arrsave 비교 첫번째와 두번째 if 사이에서
	     
	     int[] arr13 = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,0,0,0,0,0,3,3};
	     
	     int longnum = 0;
	     int longnumr = 0;
	     int arrsave = 0;
	     int arrsaveb = 0;
	     int barrynum = 0;
	     
	     
	     for(int i = 0; i < arr13.length; i++) {
	    	 
	    	  if(arr13[i] >= 0) {
	    		
	    		  //만약 현재값이 예전 값과 같다면 ++ 해라
	    		  //arrsave가 arrsaveb와 같다면 longnum ++해라;
	    		  
	    		  arrsaveb = arrsave;
	    		  arrsave = arr13[i];
	    		 
	    		  
	    		  if(arrsave == arrsaveb) {
	    			  longnum++;
	    			  
	    			  
	    			  if(longnum > longnumr) {
	    				  longnumr = longnum;
	    				  barrynum = arr13[i];
	    				  System.out.println("test" + barrynum);
	    			  }
	    		  
	    		 }else {
	    			 longnum = 0;
	    		 }
	    	  }
	    	 
	    	 
	    	 
	     }System.out.println("터널의 길이:" +  (longnumr+1) + ", 가장 긴 터널의 숫자: " + barrynum  );
	     System.out.println(barrynum);
	     
	     
	     // [] 밸류값 비교, 전 밸류 저장. 현재 밸류와 비교. 전 밸류와 현재 밸류가 같으면 카운트
	     

		/*  longnum++;
		 if (longnum > longnumr) {
			 longnumr = longnum; System.out.println(longnumr);
		 }
	      else if (longnum <= longnumr) {
		   longnum = 0; } */
	     
	     
	     //14. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요
	     //String ttt ="aabbbcccaaaaddbbbaaaaa";
	     
	     		String ttt ="aabbbcccaaaaddbbbaaaaa";
	     		
	     
	 
	     

	}

}
