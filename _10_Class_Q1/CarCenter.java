package _10_Class_Q1;

import java.util.Scanner;

public class CarCenter {
	CarOne[] carList = new CarOne[7];
	Scanner in = new Scanner(System.in);
	CarCenter(){
		int selNum=0;
		while(true) {
			menu();
			System.out.println("번호 선택>");
			selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				carAdd();
			}else if(selNum == 4) {
				carList();
			}else if(selNum==5){
				break;
			}else if(selNum == 3) {
				carMod();
			}
		}
	}
	public void menu() {
		System.out.println("1.등록");
		System.out.println("3.수정");
		System.out.println("4.전체보기");
		System.out.println("5.종료");
	}
	public void carAdd() {
		// 순서
		// 새로운 차를 만든다   new CarOne()
		// 차에다가 값을 저장한다. 
		// 차를 배열에 등록한다. carList[]
		CarOne temp = new CarOne();
		System.out.println("자동차 번호 입력하세요");
		temp.carNumber=in.nextLine();
		System.out.println("자동차 소유자 이름을 입력");
		temp.carUser=in.nextLine();
		// 배열에 저장...
		// 빈칸을 찾자 빈칸은 배열의  value값이 null이다
		int maxSize=carList.length;
		for(int i=0; i< maxSize; i++) {
			if(carList[i]==null) {
				carList[i]=temp;
				break;
			}
		}
		
	}
	public void carList() {
		// 메서드의 정의는 정의가 구체적인것이 좋다
		// carList 배열 참조변수의 0번부터 순회하면서
		// 저장된 주소값을 참조하여 carOne객체의 정보를 출력
		for(int i=0; i < carList.length; i++) {
			if(carList[i]!=null) {
				//System.out.println(carList[i].carNumber);
				//System.out.println(carList[i].carUser);
				carList[i].prt();
			}			
		}		
	}
	public void carMod() {
		// 시나리오 정의 
		// 번호로 수정할 자동차 객체를 찾는다.
		// 번호는 수정이 불가능/ 삭제만 할 수 있고, 소유자만 수정이 가능
		System.out.println("자동차 번호 입력");
		String modNumber = in.nextLine();
		//객체 찾기   >> 배열순회 필요
		for(int i=0;i < carList.length; i++) {
			if(carList[i]!=null) {
				if(carList[i].carNumber.equals(modNumber)) {
					System.out.println("수정할 소유자의 이름을 입력");
					String newUser = in.nextLine();
					//입력된 값의 유효성을 체크 하는 등 무결성 코드 추가가능
					carList[i].carUser=newUser;
					break;
				}
			}
		}
		
		
	}
	public void carDel() {
		
		
	}
}