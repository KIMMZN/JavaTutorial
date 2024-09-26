package _13_ArrayList;

import java.util.ArrayList;

public class ListSample {
	

	ArrayList<String> a = new ArrayList<>();
	
	public ListSample() {
		System.out.println("리스트의 길이 " + a.size());
		a.add("apple"); 
		System.out.println("리스트의 길이 " + a.size());
		a.add("banana");
		a.add("abc");
		a.add("샌드");
		System.out.println("리스트의 길이 " + a.size()); 
		System.out.println("리스트의 길이 " + a.get(0));
		System.out.println("리스트의 길이 " + a.get(1));
		
		for(int i =0; i < a.size(); i++) { //arraylist의 모든 string 출력 // 
			System.out.println(a.get(i));
			
		}
		
		System.out.println("---------------");
		for(int i =0; i < a.size(); i++) { 
			if(a.get(i).charAt(0)!='a') {
				System.out.println(a.get(i));
			}
			
		}
		
		String b = "banana";
		for(int i =0; i < a.size(); i++) { 
			if(a.get(i).equals(b)) {
				a.setWord(i, "ronaldo");
				System.out.println(a.get(i));
			}
			
		}
		
		a.add(1, "쭈꾸미"); // 특정 인덱스 위치에 추가
		for(int i =0; i < a.size(); i++) { //arraylist의 모든 string 출력 // 
			System.out.println(a.get(i));
			
		}
		
		
		System.out.println("------------");
		for(int i =0; i < a.size(); i++) { //arraylist의 모든 string 출력 // 
			System.out.println(a.get(i));
			
		}
		
		a.remove(3); // 특정 인덱스 삭제
		System.out.println("------------");
		for(int i =0; i < a.size(); i++) { //arraylist의 모든 string 출력 // 
			
			System.out.println(a.get(i));
			
		}
		
		a.setWord(2, "갑오징어"); //특정 인덱스 수정
		System.out.println("------------");
		for(int i =0; i < a.size(); i++) { //arraylist의 모든 string 출력 // 
			System.out.println(a.get(i));
			
		}
		
		a.clear(); //리스트 전체 삭제
		System.out.println(a.size());
		
		/*
		사용가능 메서드
		size
		add
		get
		remove
		clear
		*/
		
		
		
	}

}
