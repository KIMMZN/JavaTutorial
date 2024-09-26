package _14_Minipjt_0926;

public class Mw_One {
	String Eword = null;
	String Kword = null;
		
	public void prt() {
		System.out.println("단어");
		System.out.println("영어단어: " + Eword);
		System.out.println("한글단어: " + Kword);
	}
	
	public void addEword(String Eword) {
		this.Eword = Eword;
		
	}
	
	public void addKword(String kword) {
		this.Kword = kword;
		
	}
	
	
	

}
