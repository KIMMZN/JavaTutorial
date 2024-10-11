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
		center_1.setBackground(Color.red);
		center_2.setBackground(Color.cyan);
		center_3.setBackground(Color.green);
		
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
		JButton c22btn = new JButton("선택단어삭제");
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
		c5c.setBackground(Color.gray);
		
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
		if(e.getSource() == c1btn || e.getSource() == j1 || e.getSource() == j2 
				|| e.getSource() == c5btn || e.getSource() == j8 
				|| e.getSource() == j5 || e.getSource() == j6  ) {
			
			//System.out.println("버튼이 클릭 됨");
			String t = j1.getText();
			String t2 = j2.getText();
			String t8 = j8.getText();
			String t5 = j5.getText();
			
			
			
			System.out.println("입력하신 글은 : " +t);
			j1.setText("");
			j2.setText("");
			j8.setText("");
		//	wordList.add(t);
			
			//
		/*	
			WordDTO worddto = worddao.selectOne(modnum);
			System.out.println("현재정보");
			System.out.println("영어단어수정하세요");
			String eword = in.nextLine();
			
			System.out.println("한글단어수정하세요");
			String kword = in.nextLine();
			worddto.setKword(kword);
			
			worddto.setEword(eword);
			worddao.update(worddto);
			
			*/
			
			
			
			
			
			
			
			
			//
			WordDTO dto = new WordDTO();
			dto.setEword(t);
			dto.setKword(t2);
			
			//dto.setTitle(t);
			worddao.insert(dto); //DB에저장
			//ideaDao.insert(dto);
			wordList.add(dto.toString()); // 단어 리스트에 추가
		}
		
	}
	
	
	
	

}
