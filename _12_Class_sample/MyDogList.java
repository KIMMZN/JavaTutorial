package _12_Class_sample;

public class MyDogList {
	
	Dog[] dList = new Dog[5];
	
	MyDogList() {
		System.out.println("--도그 관리--");
		System.out.println(dList[0]);
		if(dList[0]!=null) {
			System.out.println(dList[0].name);
		}
		
		dList[1] = new Dog();
		System.out.println(dList[1]);
		dList[2]=dList[1]; //
		System.out.println(dList[2]);
		dList[3] = new Dog();
		System.out.println(dList[3]);
		Dog dd = new Dog(); //객체 생성
		dList[4] = dd;
		System.out.println(dd);
		System.out.println(dList[4]);
		dList[1].name= "abc";
		System.out.println(dList[1].name);
		System.out.println(dList[2].name);
		System.out.println(dList[3].name);
		
		for(int i =0; i < dList.length; i++) {
			if(dList[i] != null) {
				System.out.println("포문 " + i +" " + dList[i].name);
			}
		}
		//
		String s = "abc";
		for(int i =0; i < dList.length; i++) {
			if(dList[i] != null) {
				if(dList[i].name.equals(s))
				System.out.println("찾음");	
				System.out.println("포문 " + i +" " + dList[i].name);
				break;
			}
		}
		
		
	}
	
}
