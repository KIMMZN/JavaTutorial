package _16_Static_Final;

public class MemberADM {

	 //public final String name = null;
	 public String name = null;
	 public static String companyName="Human";
	 public static final String teamName = "kimTeam";
	 
	 
	 
	 
	 
	 
	 
	 MemberADM() {
		 //this.name = "aaf"; // why? 상수는 초기값이 결정된후 변경 불가
		 
		 String name = Thread.currentThread().getName();
		 System.out.println(name+ "스레드가 memberadm" + "생성자 실행");
	 }
	 public static void prt() {
		 //System.out.println(name);
	 }
}
