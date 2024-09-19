package _10_Class;

import java.util.Random;

public class _sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 0;
		Random r = new Random(); 
		Random r1 = r;
		Random r2 = null;
		Random r3 = new Random();
		
		
		System.out.println(r.nextInt(10));
		System.out.println(r1.nextInt(10));
		//System.out.println(r2.nextInt(4));
		System.out.println(r3.nextInt(10));
		
		
		
		
	}

}
