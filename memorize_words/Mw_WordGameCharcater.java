package memorize_words;

public class Mw_WordGameCharcater {
	
	String name = null;	
	String grade= null;
	int health = 0;
	
	
	
	
	public void CharcterInfo() { //케릭터 인포 메서드
		System.out.println("------------------------------");
		System.out.println("| 이름: "+name+"         등급:"+grade+"|");
		System.out.println("------------------------------");
		
	}
	
	public void CharcterInfoLife() { //케릭터 인포 메서드
		System.out.println("--------------------------------------------------------");
		System.out.println("| 이름: "+name+"         등급:"+grade+"                 "  +  "라이프: " + getHealth() + "|");
		System.out.println("--------------------------------------------------------");
		
	}
	
	public void setNameGradeHealth(String name) { //이름 입력시, 이름 grade health 추가
		
		this.name = name;
		this.grade = "자바초보";
		this.health = 2;
		
	}
	
	public void setHealth(int life) {
		
		this.health = life;
	}
	
	public String getHealth() {
		
		if(health == 2) {
			
			return "♥♥";
		} else if (health == 1){
			
			return "♥";
		}else {
			return "game over";
		}
		
	}
	
	
	public String setName(String name) { //이름 입력시 이름 리턴
		
		return name;
		
	}
	
	public String getName() { //이름 조회 메서드
		
		return name;
		
	}
	

}
