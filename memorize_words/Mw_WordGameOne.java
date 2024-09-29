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
	
	public String getWord() {
		return word;
	}
	
	public void getWordHint() {
		System.out.println("단어:" + word+"  힌트:"+hint);
	}
	
	
	
	
}


