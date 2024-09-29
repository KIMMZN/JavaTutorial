package memorize_words;

public class Mw_WordGameOne {

	String word =null;
	String meaning = null;
	String hint = null;	
	
	public void setWord(String word, String meaning, String hint) {
		this.word = word;
		this.meaning = meaning;
		this.hint = hint;
		
	}
	
	public String getWord() { // 문제 조회
		return word;
	}
	
	public String getmeaning() { // 답 조회
		return meaning;
	}
	
	public void getWordHint() {
		System.out.println("문제: " + word);
		System.out.println("힌트: " + hint);
	}
	
	
	
	
}


