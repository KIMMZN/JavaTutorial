package _24_Gui_Swing_DTO;

public class WordDTO {
	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getKword() {
		return kword;
	}



	public void setKword(String kword) {
		this.kword = kword;
	}



	public String getEword() {
		return eword;
	}



	public void setEword(String eword) {
		this.eword = eword;
	}



	private int num;
	private String kword;
	private String eword;
	
	
	
	@Override
	public String toString() {
		 return num + ".  영어단어 " + eword + " -  한국단어  " + kword;
	}
	
	
	
	
	

}
