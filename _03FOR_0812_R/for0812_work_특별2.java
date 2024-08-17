package _03FOR_0812_R;

public class for0812_work_특별2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*
		특별2
		 String a ="67/414/1/23/32/45/54/12/11/232"
		문자열 a는 해충에 대한 숫자를 카운팅한 결과이다.
		해충의 갯수를 모두 합하시오.
		charAt() 메서드만 사용이 가능하다. 
		형변환이 필요하면 검색하여 사용하시오. */
			
				String a ="67/414/1/23/32/45/54/12/11/232";
				// for i = 0; i < a.length(); i++
				// charAt(a[i])
				
				String cuString = "";
				int result = 0;
				
				for (int i = 0; i < a.length(); i++) {
						char ab = a.charAt(i);
						//System.out.println(ab);
						
						if (ab != '/' ) {
							cuString += ab;
							//System.out.println("check: " + cuString);
						}
						else {
							int inSomnia  = Integer.parseInt(cuString);
							
							result += inSomnia;
							cuString = "";
							
							
						}
					
				}
				int inSomnia  = Integer.parseInt(cuString);
				//System.out.println("check11: " + inSomnia);
				result += inSomnia;
				
				
				System.out.println("check11: " + result);
				



		
			
		
	}

}
