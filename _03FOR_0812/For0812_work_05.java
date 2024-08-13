package _03FOR_0812;

public class For0812_work_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	   
	        String expression = "23-56+45*2-56";

	        // 숫자와 연산자를 분리
	        String[] numbers = expression.split("[+\\-*]"); // 숫자들만 추출
	        String[] operators = expression.split("[0-9]+"); // 연산자들만 추출

	        int result = Integer.parseInt(numbers[0]); // 첫 번째 숫자로 초기화
	        int result1 = Integer.parseInt(numbers[1]);
	        int result2 = Integer.parseInt(numbers[2]);
	        
	        
	        System.out.println("ddd :" + result);
	        System.out.println("ddd1 :" + result1);
	        System.out.println("ddd2 :" + result2);
	        System.out.println("ddd :" + result);
	        System.out.println("ddd :" + result);
	        

	        // 연산자와 숫자를 순서대로 읽어가면서 계산
	        for (int i = 1; i < numbers.length; i++) {
	            int num = Integer.parseInt(numbers[i]);
	            char op = operators[i].charAt(0);
	            System.out.print("test: " +result);
	            
	            System.out.println(op);
	            if (op == '+') {
	                result += num;
	            } else if (op == '-') {
	                result -= num;
	            } else if (op == '*') {
	                result *= num;
	            }
	        }

	        System.out.println("결과: " + result);
	    }
	}
