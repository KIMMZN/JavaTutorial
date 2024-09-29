package memorize_words;

public class Mw_WordGameCharcater {
	
	String name = null;	
	String grade= null;
	int health = 0;
	
	
	
	
	public void CharcterInfo() { //케릭터 인포 메서드
		System.out.println("-----------------------------");
		System.out.println("| 이름: "+name+"         등급:"+grade+"|");
		System.out.println("-----------------------------");
		
	}
	
	public void CharcterInfoLife() { //케릭터 인포 메서드
		System.out.println("-------------------------------------------------------------");
		System.out.println("| 이름: "+name+"         등급:"+grade+"                 "  +  "라이프: " + getHealth() + "|");
		System.out.println("-------------------------------------------------------------");
		
	}
	
	public void setName(String name) { //이름 추가메서드 //시 등급도 추가
		
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
		}
		else if(this.health ==0) {
			return "♡";
		}else {
			return "game over";
		}
		
	}
	
	
	public String getName(String name) { //이름 추가메서드 //시 등급도 추가
		
		return name;
		
	}
	

}
