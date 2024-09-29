package memorize_words;

public class Mw_One {
	String Eword = null;
	String Kword = null;
		
	public void prt() { // 추가된단어 전체보기메서드
		System.out.println("단어");
		System.out.println("영어단어: " + Eword);
		System.out.println("한글단어: " + Kword);
	}
	
	public void addEword(String Eword) { // 영어단어추가메서드
		this.Eword = Eword;
		
	}
	
	public void addKword(String kword) { // 한글단어추가메서드
		this.Kword = kword;
		
	}
	
	
	

}
