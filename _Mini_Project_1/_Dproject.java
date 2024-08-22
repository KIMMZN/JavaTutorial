package _Mini_Project_1;

import java.util.Random;
import java.util.Scanner;

public class _Dproject {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String[] level1 = {"ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ", "ㅅ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", 
							"ㅍ", "ㅎ", "ㅏ", "ㅑ", "ㅓ", "ㅕ", "ㅗ", "ㅛ", "ㅜ", "ㅠ", "ㅡ", "ㅣ"};
		String[] level2 = {"가", "나", "다", "라", "마", "바", "사", "아", "자", "차", "카", "타", "파", "하", 
							"몸", "삶", "꿈", "물", "불", "피", "잠", "새", "옷", "집", "흙", "글", "길", "눈", 
							"점", "방", "빛", "코", "간", "잎", "새", "강", "양", "말", "산", "귀", "신", "빵"};
		String[] level3 = {"배우", "주스", "폐지", "지하", "사수", "기체", "죠스", "야구", "코드", "이찬", 
							"자바", "자료", "마치", "하이", "동상", "게임", "점수", "원본", "시작", "코딩", 
							"레벨", "문장", "이중", "차원", "정확", "수원", "휴먼", "교육", "센터", "객체"};
		String[] level4 = {"텀블러", "색종이", "컴퓨터", "선생님", "조건문", "반복문", "모니터", "마우스", "키보드", 
							"비상구", "책가방", "구글링", "닉네임", "지우개", "깃허브", "검색기", "이미지", "동영상", 
							"더보기", "박진우", "이원재", "죠스바", "수박바", "아이스", "출입문", "한글날", "유튜브", 
							"자료형", "형광등", "화이트", "그레이", "아파트", "상록수", "침엽수", "수원시", "인계동"};
		String[] level5 = {"고진감래", "구사일생", "과유불급", "괄목상대", "근묵자흑", "다다익선", "대동소이", "동병상련", 
							"문전성시", "백발백중", "사면초가", "살신성인", "설상가상", "아전인수", "역지사지", "우이독경", 
							"자업자득", "죽마고우", "청출어람", "촌철살인", "타산지석", "토사구팽", "파죽지세", "풍전등화", 
							"함흥차사", "동상이몽", "일박이이"};
		String[] level6 = {"가르치는 것은 두 번 배우는 것이다", "나는 생각한다. 그러므로 나는 존재한다", 
							"유식한 바보야 말로 무식한 바보보다 더욱 바보이다", "타고난 재주는 사람마다 하나씩 있다", 
							"시간의 날개를 타고 슬픔은 날아가 버린다", "콩 가지고 두부 만든다고 해도 곧이 안 듣는다.", 
							"열 손가락 깨물어 안 아픈 손가락 없다", "기슭에는 채송화가 무더기로 피어서 생의 감각을 흔들어 주었다", 
							"천재는 1퍼센트의 영감이요 99퍼센트는 노력이다", "호랑이에게 물려 가도 정신만 차리면 산다", 
							"밤 말은 쥐가 듣고 낮 말은 새가 듣는다", "콩으로 메주를 쑨다 하여도 곧이듣지 않는다"};
		String[] level7 = {"java", "even", "bout", "cork", "soon", "only", "once", "lest", "hoof", 
							"less", "last", "hunt", "funk", "vice", "till", "what", "very", "tidy", 
							"aside", "truly", "enact", "glare", "zowie", "minus", "tasty", "devil", 
							"about", "ample", "often", "after", "where", "oddly", "tweet", "madly"};
		String[] level8 = {"amidst", "halloo", "before", "rankle", "ginger", "indeed", "around", 
							"unless", "openly", "though", "unless", "induct", "always", "during", 
							"despite", "blindly", "finally", "because", "phooey", "quieten", "cruelly", 
							"infancy", "resound", "outside", "arrival", "failing", "organic", "optimal"};
		String[] level9 = {"humanise", "eleventh", "finished", "sleepily", "shoulder", "overheat", 
							"critical", "opposite", "birthday", "frequent", "business", "dedicate", 
							"following", "supposing", "regarding", "concerned", "curiously", "yesterday", 
							"concerning", "unbearably", "multimedia", "incidentally", "throughout"};
		String[] level10 = {"Pneumonoultramicroscopicsilicovolcanoconiosis", 
							"Hippopotomonstrosesquippedaliophobia", "Supercalifragilisticexpialidocious", 
							"Pseudopseudohypoparathyroidism", "Floccinaucinihilipilification", 
							"Antidisestablishmentarianism", "Honorificabilitudinitatibus", 
							"Thyroparathyroidectomized", "Dichlorodifluoromethane", "Incomprehensibilities"};
		
		String[][] level0 = {level1, level2, level3, level4, level5, level6, level7, level8, level9, level10};
		String[][] level = {level1, level2};
		
//		System.out.println(level1.length);
//		System.out.println(level2.length);
//		System.out.println(level.length);
//		System.out.println(Arrays.toString(level[0]));
//		System.out.println(level[0][0]);
//		System.out.println(level[0]);
//		System.out.println(level[0].length);
//		System.out.println(level[0][0].length());
//		System.out.println(Arrays.toString(level[1]));
		
		
//		System.out.println(level[0][ran.nextInt(level[0].length)]);
		
		while (true) {
			int jumsu = 0;
			int totalJumsu = 0;
			System.out.print("▶ 선택해주세요. [ 1 : 시작 / 0 : 종료 ] ");
			String startEnd = scan.nextLine();
			
			if (startEnd.equals("1")) {
				System.out.println("");
				for (int i=0; i<level.length; i++) {	// level
					if (jumsu != 0) {
						jumsu = 0;
						break;
					}
					System.out.println("▶ " + (i+1) + "단계 ◀");
					for (int j=1; j<=15; j++) {			// 각 level의 게임 플레이
						String levelText = level[i][ran.nextInt(level[i].length)];
						System.out.println("( " + j + " / 15 )");
						System.out.println("단어 : " + levelText);
						System.out.print("입력 : ");
						String text = scan.nextLine();
						
						if (text.equals(levelText)) {
							jumsu += 100;
							System.out.println("\n정답입니다~");
							System.out.println("점수 +20");
							System.out.println("현재 점수 : " + jumsu + "\n");
						} else {
							jumsu -= 10;
							System.out.println("\n틀렸습니다!");
							System.out.println("점수 -10");
							System.out.println("현재 점수 : " + jumsu + "\n");
						}
						
						while (j == 15) {
							// 점수가 30점이하일 경우, 초기화
							if (jumsu <= 30) {
								System.out.println((i+1) + "단계 실패..");
								System.out.println("총 점수 : " + jumsu);
								System.out.print("\n▶ 선택해주세요. [ 1 : 1단계부터 도전 / 2 : 처음 화면으로 ] ");
								String select = scan.nextLine();
								if (select.equals("1")) {
									System.out.println("1단계부터 다시 도전합니다. \n");
									jumsu = 0;
									i = -1;
									break;
								} else if (select.equals("2")) {
									System.out.println("처음 화면으로 돌아갑니다. \n");
									jumsu = 1;
									break;
								} else {
									System.out.println("※ 다시 선택해주세요. \n");
									continue;
								}
							}
							
							// 점수가 31점부터 99점일 경우, 재시작
							if (jumsu > 30 && jumsu < 100) {
								System.out.println((i+1) + "단계 종료, 100점을 노려보세요!");
								System.out.println("총 점수 : " + jumsu);
								System.out.print("\n▶ 선택해주세요. [ 1 : 재도전 / 2 : 처음 화면으로 ] ");
								String select = scan.nextLine();
								if (select.equals("1")) {
									System.out.println((i+1) + "단계를 재도전합니다. \n");
									jumsu = 0;
									i -= 1;
									break;
								} else if (select.equals("2")) {
									System.out.println("처음 화면으로 돌아갑니다. \n");
									break;
								} else {
									System.out.println("※ 다시 선택해주세요. \n");
									continue;
								}
							}
							break;
						}
						
						// 점수가 100점일 경우, 다음 단계
						if (jumsu >= 100) {
							if (i == level.length-1) {
								System.out.println((i+1) + "단계 클리어!");
								System.out.println("누적 점수 : " + totalJumsu);
								while (true) {
									System.out.print("\n▶ 선택해주세요. [ 1 : 1단계부터 도전 / 2 : 재도전 / 3 : 처음 화면으로 ] ");
									String select = scan.nextLine();
									if (select.equals("1")) {
										System.out.println("1단계부터 다시 도전합니다. \n");
										totalJumsu += jumsu;
										jumsu = 0;
										i = -1;
										break;
									} else if (select.equals("2")) {
										System.out.println((i+1) + "단계를 재도전합니다. \n");
										totalJumsu += jumsu;
										jumsu = 0;
										i -= 1;
										break;
									} else if (select.equals("3")) {
										System.out.println("처음 화면으로 돌아갑니다. \n");
										break;
									} else {
										System.out.println("※ 다시 선택해주세요.");
									}
								}
								break;
							}
							System.out.println((i+1) + "단계 클리어!");
							System.out.println("총 점수 : " + jumsu);
//							System.out.println("누적 점수 : " + totalJumsu);
							while (true) {
								System.out.print("\n▶ 선택해주세요. [ 1 : 1단계부터 도전 / 2 : 재도전 / 3 : 다음 단계 / 4 : 처음 화면으로 ] ");
								String select = scan.nextLine();
								if (select.equals("1")) {
									System.out.println("1단계부터 다시 도전합니다. \n");
									jumsu = 0;
									i = -1;
									break;
								} else if (select.equals("2")) {
									System.out.println((i+1) + "단계를 재도전합니다. \n");
									jumsu = 0;
									i -= 1;
									break;
								} else if (select.equals("3")) {
									System.out.println("다음 단계로 넘어갑니다. \n");
									totalJumsu += jumsu;
									jumsu = 0;
									break;
								} else if (select.equals("4")) {
									System.out.println("처음 화면으로 돌아갑니다. \n");
									break;
								} else {
									System.out.println("※ 다시 선택해주세요.");
								}
							}
							break;
						}
					}
				}
			} else if (startEnd.equals("0")) {
				System.out.println("게임을 종료했습니다.");
				break;
			} else {
				System.out.println("※ 다시 선택해주세요. \n");
			}
		}
		scan.close();
	}

}
