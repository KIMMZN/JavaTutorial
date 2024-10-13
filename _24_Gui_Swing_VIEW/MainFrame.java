package _24_Gui_Swing_VIEW;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import _24_Gui_Swing_DAO.WordDAO;
import _24_Gui_Swing_DTO.WordDTO;


public class MainFrame extends JFrame implements ActionListener {
	private JPanel title_p = new JPanel();
	private JLabel t = new JLabel("단어장 프로그램");
	private JPanel center_p = new JPanel();
	private JPanel center_1 = new JPanel();
	private JPanel center_2 = new JPanel();
	private JPanel center_3 = new JPanel();
	private List wordList =new List(5,false);
	//리스트
	JButton c22btn = new JButton("선택단어삭제");
	
	
	//단어저장
	JButton c1btn = new JButton("저장");
	JTextField j1 = new JTextField();
	JTextField j2 = new JTextField();
	
	//수정
	JButton c5btn=new JButton("수정");
	JTextField j5 = new JTextField(); // 영어
	JTextField j6 = new JTextField(); // 한국어
	JTextField j8 = new JTextField(); // 수정할번호
	
	//private WordDAO worddao = WordDAO.getInstance();
	
	private WordDAO worddao = WordDAO.getInstance();
	public MainFrame () {
		this.setBounds(100,100,500,200);
		title_p.add(t);
		center_p.setBackground(Color.yellow);
		this.add(title_p, "North");
		this.add(center_p, "Center");
		center_1.setBackground(Color.magenta);
		center_2.setBackground(Color.magenta);
		center_3.setBackground(Color.magenta);
		
		center_p.setLayout(new GridLayout());
		center_p.add(center_1);
		center_p.add(center_2);
		center_p.add(center_3);
		
		//center1
		JLabel c1 = new JLabel("단어입력");
		//JButton c1btn = new JButton("저장");
		JPanel c1c=new JPanel();
		c1c.setBackground(Color.gray);
		c1c.setLayout(new GridLayout(2, 2));
		JLabel c2 = new JLabel("영어");
		JLabel c3 = new JLabel("한글");
		//JTextField j1 = new JTextField();
		//JTextField j2 = new JTextField();
		c1c.add(c2);
		c1c.add(j1);
		c1c.add(c3);
		c1c.add(j2);
		center_1.setLayout(new BorderLayout());
		center_1.add(c1, "North");
		center_1.add(c1btn, "South");		
		//center_1.add(c1w, "West");
		center_1.add(c1c, "Center");
		
		
		
		//Center_2 작업
		JPanel c22 = new JPanel();
		c22.setLayout(new BorderLayout());
		JLabel c221 = new JLabel("단어리스트");
		//c221.
		//List c22list = new List();
		//JButton c22btn = new JButton("선택단어삭제");
		c22.add(c221,"North");
		c22.add(wordList,"Center");
		c22.add(c22btn,"South");
		center_2.setLayout(new BorderLayout());
		center_2.add(c22,"Center");
		
		//center3 작업
		//center_3 작업
		JLabel c5 = new JLabel("단어수정");		
		//JButton c5btn=new JButton("수정");
		JPanel c5c = new JPanel();
		c5c.setBackground(Color.BLUE);
		
		c5c.setLayout(new GridLayout(3, 2));
		JLabel c8 = new JLabel("수정할번호");
		JLabel c6 = new JLabel("영어");
		JLabel c7 = new JLabel("한글");
		//JTextField j8 = new JTextField(); // 수정할번호
		//JTextField j5 = new JTextField();
		//JTextField j6 = new JTextField();
		c5c.add(c8);
		c5c.add(j8);
		c5c.add(c6);
		c5c.add(j5);
		c5c.add(c7);
		c5c.add(j6);
		center_3.setLayout(new BorderLayout());
		
		center_3.add(c5,"North");
		//center_3.add(j8)
		center_3.add(c5btn,"South");
		center_3.add(c5c,"Center");		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//리스너 등록
		c1btn.addActionListener(this);
		c5btn.addActionListener(this);
		c22btn.addActionListener(this);
		//input.addActionListener(this);
		//
		//this.setVisible(true);
		
		
		loadDB();
		
	}
	
	private void loadDB() {
		
		ArrayList<WordDTO> worddto = worddao.selectAll();
		for(WordDTO i : worddto) {
			wordList.add(i.toString());
			//worddto.add(i.toString());
		}
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == c1btn) { // 단어 추가
			
			//System.out.println("버튼이 클릭 됨");
			String t = j1.getText();
			String t2 = j2.getText();
			System.out.println("입력하신 글은 : " +t);
			j1.setText("");
			j2.setText("");
			
		    //wordList.add(t);
		
			//단어입력
			WordDTO dto = new WordDTO();
			dto.setEword(t);
			dto.setKword(t2);
			
			//dto.setTitle(t);
			worddao.insert(dto); //DB에저장
			
			//if(dto.getNum() > 0) {
				wordList.add(dto.toString()); // 단어 리스트에 추가
			//}else {
			//	System.out.println("단어 추가 실패");
			//}
			//ideaDao.insert(dto);
		 }
		
		 if (e.getSource() == c22btn) { // 삭제
			 System.out.println("클릭은되나");
			 int selidx = wordList.getSelectedIndex(); // 클릭한 인덱스 //선택되지 않으면 -1리턴
			 if(selidx != -1) {
				 String selectone = wordList.getItem(selidx); //선택한것 String selectone에 저장
				 //selectone을 .을 기준으로 split()를 통해 나눈다. 배열의 첫번째요소[0]을 가져온다.
				 //trim()는 앞뒤의 공백제거
				 int num = Integer.parseInt(selectone.split("\\.")[0].trim());
				 worddao.delete(num);	//db에서 삭제;			
				 //loadDB();
			 }else {
				 System.out.println("선택 안함");
			 }
		     wordList.remove(selidx);
		     System.out.println("리스트에서 삭제완료");
		 }
			
			if(e.getSource() == c5btn) { //단어 수정
				
				int t8 = Integer.parseInt(j8.getText()); // 넘버
				String t5 = j5.getText(); //영어
				String t6 = j6.getText(); //한글단어
				

				//update
				WordDTO worddto = worddao.selectOne(t8);
				if(worddto != null) {
					System.out.println("현재정보");
					System.out.println("영어단어수정하세요");
					String eword = t5;
					System.out.println("한글단어수정하세요");
					String kword = t6;
					worddto.setKword(kword);			
					worddto.setEword(eword);
					worddao.update(worddto); //
					
					//리스트 업데이터
					int update = t8 - 1;  //인덱스는 0부터
			        wordList.replaceItem(worddto.toString(), update);  // 기존 항목 대체
					
					//wordList.remove(t8-1);
					//wordList.add(worddto.toString());
					//wordList.add(t8-1, worddto.toString());
					
					
				}else {
					System.out.println("수정하는 단어를 찾을수 없습니다");
				}
				j8.setText("");
				j5.setText(""); // 영__--__
				j6.setText("");
			}
	}
	
}
