package c_Products_Service_Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import c_Products_DAO.Products_DAO;
import c_Products_DAO.Products_DBdao;
import c_Products_DTO.Products_DTO;

public class Products_Service_Frame_Main extends JFrame implements ActionListener,
ItemListener {
	Products_DBdao pdbdao = null;
	Products_Service_Frame_Main_Add psfma = null;
	Products_Service_Frame_Main psfmain = null;
	
	private JPanel northPanel; private JLabel northLabel;
	private JPanel northSouthPanel; private JLabel northSouthLabel;
	private JButton button1;private JButton button2;private JButton button3;
	private JButton button4; private JButton button5;
	//오른쪽 패널
	private JPanel eastPanel; private JLabel eastJlabel;
	private JButton buttona1;private JButton buttona2;private JButton buttona3; 
	//현재화면크기 가져오기
	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private Dimension screenSize = toolkit.getScreenSize(); // 화면크기
	
	//jtable
	private JTable jtable;
	private String colNames[] = {"넘버","공급사","타입","상품명","정보","수량","개당가격","총가격","등록일"};
	private DefaultTableModel model = new DefaultTableModel(colNames, 0);
	private JScrollPane scrollPane;
	
	
	public Products_Service_Frame_Main (Products_Service_Frame_Main psfmain) {
		this.psfmain = psfmain;
		
		init();
		this.setTitle("조립 컴퓨터 재고관리 프로그램 v.1.0");
		this.setLayout(new BorderLayout());
		this.setSize(screenSize.width, screenSize.height);
		//northPanel 고객 환영합니다
		northPanel = new JPanel();
		northPanel.setLayout(new BorderLayout());
		northPanel.setBackground(Color.LIGHT_GRAY);
		northPanel.setBorder(new LineBorder(Color.black,2));
		//패널 높이 조정
		northPanel.setPreferredSize(new Dimension(this.getWidth(), 100));
		//라벨
		northLabel = new JLabel("north라벨 ID님 환영합니다");
		
		
		
		//norh southern panel
		northSouthPanel = new JPanel();
		northSouthPanel.setLayout(new GridLayout(1, 5));
		northSouthPanel.setBackground(Color.white);
		northSouthPanel.setBorder(new LineBorder(Color.black, 2));
		northSouthPanel.setPreferredSize(new Dimension(this.getWidth(), 50));
		
		//East panel
		//private JPanel eastPanel; private JLabel eastJlabel;
		eastPanel = new JPanel();
		eastPanel.setLayout(new GridLayout(3, 1));
		eastPanel.setBackground(Color.white);
		eastPanel.setBorder(new LineBorder(Color.black, 2));
		eastPanel.setPreferredSize(new Dimension(100, this.getHeight()));
		//private JButton buttona1;private JButton buttona2;private JButton buttona3;
		buttona1 = new JButton("등록");buttona2 = new JButton("수정");buttona3 = new JButton("삭제");
		eastPanel.add(buttona1); eastPanel.add(buttona2); eastPanel.add(buttona3);
		
		//eastJlabel = new JLabel("동쪽임시");
		//eastPanel.add(eastJlabel);
		
		
		//기본 선택 버튼
		button1 = new JButton("기본버튼1");
		button2 = new JButton("기본버튼2");
		button3 = new JButton("기본버튼3");
		button4 = new JButton("기본버튼4");
		button5 = new JButton("기본버튼5");
		
		northSouthPanel.add(button1);
		northSouthPanel.add(button2);
		northSouthPanel.add(button3);
		northSouthPanel.add(button4);
		northSouthPanel.add(button5);
			
		//Jtable		
		jtable = new JTable(model);
		scrollPane = new JScrollPane(jtable);
		scrollPane.setPreferredSize(new Dimension(800,400));
		
		//액션리스너
		buttona1.addActionListener(this);
		
		//add
		northPanel.add(northSouthPanel, "South");
		northPanel.add(northLabel, "East");
		this.add(eastPanel, "East");
		this.add(scrollPane, "Center");
		this.add(northPanel, "North");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		loadJdb();
		
	}
	
	private void init() {
		if(pdbdao == null) {
			pdbdao = new Products_DAO();
		}
		
		

	}
	
	private void loadJdb() { //jtable에 데이터 추가
		model.setRowCount(0); // 기존행 초기화
		ArrayList<Products_DTO> pdlist = pdbdao.listAll();
		
		for(Products_DTO plist : pdlist) {
			String[] data= {
					String.valueOf(plist.getNum()),
					plist.getDelivery_Company(),
					plist.getType().toString(),
					plist.getName(),
					plist.getInfo(),
					String.valueOf(plist.getQuantity()),
					String.valueOf(plist.getPrice()),
					String.valueOf(plist.getPrice() * plist.getQuantity()), //총가격
					plist.getIndate().toString()
			};
			model.addRow(data);
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == buttona1) {
			add();
			
		}
		
	}
	
	private void add() {
		//Products_Service_Frame_Main_Add psfma = null;
		if (psfma == null) {
			psfma = new Products_Service_Frame_Main_Add(pdbdao, this);
		}
		
	}
	
	public void reset() {
		psfma = null;
		//psfmain = null;
		loadJdb();
	}
	
	
	

}
