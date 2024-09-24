package _11_method;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		TestMethod t = new TestMethod();
		
		
		
		System.out.println(t.name);
		t.setName("hong");
		System.out.println(t.name);
		System.out.println(t.getName());
		
		String resultName = t.getName2("1112");
		if(resultName != null) {
			System.out.println(resultName);
		}else {
			System.out.println("비번틀림");
		}
		

		t.maskName("***");
		
		System.out.println(t.maskName("***"));
		
		System.out.println(t.maskName1());
	}

}
