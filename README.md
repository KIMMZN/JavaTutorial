## KIMMZN / JavaTutoria
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 📝 일정표  
  　　　　Day01 : _00_변수와 자바 기초  
  　　　　Day02 : _01_array 1차원배열특징과 연습문제  
  　　　　Day03 : _02IF IF문 기초와 연습문제
          Day04 : _03FOR FOR문과 문제들
	  

   00. Java 기본
   
   - 자바는 객체 지향 프로그래밍 언어로, 1995년에 Sun Microsystems에서 되었고, 자바는 현재 오라클(Oracle)에서 관리하고 있다.
   * 자바의 특징 
   1. 객체 지향 프로그래밍
      - 자바는 객체 지향 언어로, 객체와 클래스 개념을 중심으로 설계되었다.;
      - 이는 코드의 재사용성과 유지보수성을 높여준다.;
     
   2. 플랫폼 독립
      - 자바 프로그램은 자바 가상 머신(JVM) 위에서 실행된다. "write once, run anywhere" , 한번 작성된 코드는 다양한 플랫폼에서 실행될수 있음을 의미;
      - 자바 바이트코드(.class 파일)가 JVM에서 실행되므로, 특정 운영체제에 종속되지 않는다.

   3. 메모리 관리
      - 자바는 가비지 컬렉션(Garbage Collection)이라는 자동 메모리 관리 기능을 제공한다.
      
      //java
		메서드 = 기능을 가지고 있는것;  
		변수: 값을 저장하는 공간  
		선언문 :  자료형 변수명 = 초기값;  
 		    정수  
 		    문자  
 		    문자열  
 		    실수..
		 * 
		 * <암기할것!>  
   
		자바는 객체지향 언어이다; // 객체는 만들어진 부품.
  
		자바는 class 단위로 객체를 만든다.
  
		Class는 변수와 메서드로 구성된다.
  
		Class를 묶어 놓은 것이 패키지이다. */
		

01. Array

   //내용 : 자바의 배열  
		   /*특징 : 변수 하나로 여러개의 값을 저장함;  
		    * 		같은 자료형을 연속적으로 저장  
		    * 		(나중에는 다른 자료형도 저장 할수 있는것 배울예정)  
		    * 		고정길이 - 사용하지 않은 index가 있을 수도 있고  
		    * 				 길이가 짧아서 데이터를 다 저장하지 못할 수도 있음;  
		    * 				 단, 속도는 빠름;  
		    * 공부할떄 : 배열의 길이, 배열의 인덱스 기억하자!!  
		    */  
          ex) int[] lotto = new int[3]; //길이 3, 인덱스 0-2, value type:int  
                                        //인덱스는 0부터 시작;  
          -> 1. 배열 타입 선언 : int[] // []는 배열임을 나타내는 기호; int 즉 정수  
             2. 배열 변수 이름 : lotto // 'lotto'는 배열의 이름.   
             3. 배열 생성 : = new int[3]; // new 키워드는 새로운 배열 객체를 생성하는 데 사용.  
                                         // int[3] 크기가 3인 배열을 생성. 배열의 길이를 의미// index 0~2;  
          => 크기가 3인 정수 배열을 생성하고 초기화 한다.    // 초기화된 배열의 각 요소는 0;  
                                      
                                                      
  어려웠던점&해결 : q8번이 그림도 있어서 문제 자체가 어려웠고 어떻게 해결해야되는지 감이 안왔다.    
                    문제를 너무 한번에 풀려고 하니 당황했던것 같다.  
                    하나하나 쪼개서 생각하고 해결하려고 해야 조금씩 문제가 풀리는것 같다.  
                    표시된 좌표 안에 들어와야 하니 비교 연산자를 활용하여 a<c<B 로 확실하게 하나씩 설정해야한다.  
                     a < c <b는 자바에서 표현 불가능하기 때문에 비교 연산자등을 사용해서 분리해야 된다.  
                    &&논리 연산자를 활용하여 a < c && c < b 로 분리하여 하나씩  해결해가니 문제를 해결할수 있었다.  
		    
