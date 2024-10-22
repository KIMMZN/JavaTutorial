package c_Products_Service_Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import c_Order_DAO.Order_DAO;
import c_Order_DAO.Order_DBdao;
import c_Order_DTO.Order_DTO;
import c_Products_DTO.Products_DTO;
import c_Service_Frame.Adm_Login_Frame2;

public class Products_Service_Frame_Main_menu2 extends JFrame {
	//현재화면크기 가져오기
		private Toolkit toolkit = Toolkit.getDefaultToolkit();
		private Dimension screenSize = toolkit.getScreenSize(); // 화면크기
		//
		//Products_DBdao pdbdao = null;
		Order_DBdao odbdao = null;
		Products_Service_Frame_Main psfm =null;
		
		//
		Adm_Login_Frame2 admlf2 = null;
		
		private JPanel northPanel; private JLabel northLabel;
		private JPanel northSouthPanel; private JLabel northSouthLabel;
		//northSouth_c
		private JPanel northSouthPanel_c; private JLabel northSouthLabel_c;
		//private JTextField northSouthField_c; private JButton northSouthbutton_c;
		//private JButton northSouthbutton_c1;
		
		//오른쪽 패널
		private JPanel eastPanel; private JLabel eastJlabel;
		private JButton buttona1;private JButton buttona2;private JButton buttona3;
		
		//왼쪽 패널
		private JPanel westPanel; private JLabel westJlabel6;private JLabel westJlabel2;private JLabel westJlabel3;
		private JLabel westJlabel4;private JLabel westJlabel5;private JLabel westJlabel7; private JLabel westJlabel1;
		private JLabel westJlabel0;
		private JLabel westLabelid; private JTextField westTextFieldid;
		private JTextField westTextField1;
		

		private JTextField westTextField2;private JTextField westTextField3;
		private JTextField westTextField4;private JTextField westTextField5;private JTextField westTextField6;
		private JTextField westTextField7;private JTextField westTextField0;
		
		//jtable
		private JTable jtable;
		private String colNames[] = {"주문번호","관리자id","고객id","상품넘버","상품타입","상품명",
				"상품수량","개당가격","총가격","주문일"};
		private DefaultTableModel model = new DefaultTableModel(colNames, 0);
		private JScrollPane scrollPane;
		
		//삭제하기 위한 jtable row,col을 멤버변수로
		private int row; // jtable row
		private int col; // jtable cul
		
		//id를 활용하기 위한 변수
		String idTemp = null; 
		
		//위 옵션버튼
		JButton testjbutton1;
		JButton testjbutton2;
	
		Products_Service_Frame_Main_menu2(Products_Service_Frame_Main psfm, String idTemp) {
			//admlf2 = alf2;
			//Products_Service_Frame_Main psfm =null;
			this.psfm = psfm;
			
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
			
			//아이디 문구 환영문구		
			
			//String idtemp = idfield.getText().toString();
			this.idTemp = idTemp;
			System.out.println("id확인" + idTemp);
			String welcome = " 님 환영합니다";
			String idtemp1 = idTemp + welcome;
			northLabel = new JLabel(idtemp1);
			
			init();
			
			//norh southern panel
			
			northSouthPanel = new JPanel();
			northSouthPanel.setLayout(new BorderLayout());
			northSouthPanel.setBackground(Color.white);
			northSouthPanel.setBorder(new LineBorder(Color.black, 2));
			northSouthPanel.setPreferredSize(new Dimension(this.getWidth(), 50));
			northSouthLabel_c = new JLabel();
			
			//East panel // 주문, 삭제 수정 등등
			//private JPanel eastPanel; private JLabel eastJlabel;
			eastPanel = new JPanel();
			eastPanel.setLayout(new GridLayout(1, 1));
			eastPanel.setBackground(Color.white);
			eastPanel.setBorder(new LineBorder(Color.black, 2));
			eastPanel.setPreferredSize(new Dimension(100, this.getHeight()));
			//private JButton buttona1;private JButton buttona2;private JButton buttona3;
			buttona1 = new JButton("주문"); //buttona2 = new JButton("수정");buttona3 = new JButton("삭제");
			eastPanel.add(buttona1); //eastPanel.add(buttona2); eastPanel.add(buttona3);
			
			
			//Jtable		
			jtable = new JTable(model);
			scrollPane = new JScrollPane(jtable);
			scrollPane.setPreferredSize(new Dimension(800,400));
			
			//add north쪽 메뉴선택창
			JPanel northPanel_C = new JPanel(new GridLayout(1, 3));
			JPanel testpanel0 = new JPanel();
			testpanel0.setBackground(Color.lightGray);
			JLabel testjlabel0 = new JLabel("메뉴");
			//JPanel testpanel1 = new JPanel();
			//JLabel testjlabel1 = new JLabel("테스트라벨1");
			testjbutton1 = new JButton("재품등록");
			testjbutton2 = new JButton("고객주문");
			
			//JPanel testpanel2 = new JPanel();
			//JLabel testjlabel2 = new JLabel("테스트라벨2");
			
			
			testpanel0.add(testjlabel0);
			//testpanel1.add(testjlabel1);
			//testpanel2.add(testjlabel2);
			//testpanel1.add(testjbutton1);
			//testpanel2.add(testjbutton2);
			northPanel_C.add(testpanel0);
			northPanel_C.add(testjbutton1);
			northPanel_C.add(testjbutton2);
			
			
			northPanel.add(northPanel_C, "Center");
			northPanel.add(northSouthPanel, "South");
			northPanel.add(northLabel, "East");
			this.add(eastPanel, "East");
			this.add(scrollPane, "Center");
			this.add(northPanel, "North");
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			loadJdb();
			
		}
		
		private void init() {
			//Order_DBdao odbdao
			if(odbdao == null) {
				odbdao = new Order_DAO();
			}
		}
		
		private void loadJdb() { //jtable에 데이터 추가
			model.setRowCount(0); // 기존행 초기화
			System.out.println("jtable 데이터 로드중");
			
			ArrayList<Order_DTO> odtolist = odbdao.listAll(idTemp);
			
			for(Order_DTO olist : odtolist) {
				String[] data= {
						String.valueOf(olist.getOrder_num()),
						olist.getAdm_id(),
						olist.getClient_id(),
						String.valueOf(olist.getProduct_num()),
						olist.getProduct_type(),
						olist.getProduct_name(),
						String.valueOf(olist.getProduct_quantity()),
						String.valueOf(olist.getProduct_price_one()),
						String.valueOf(olist.getProduct_price_total()),
						olist.getIndate().toString()
	/*
	private String colNames[] = {"주문번호","관리자id","고객id","상품넘버","상품타입","상품명",
			"상품수량","개당가격","총가격","주문일"};
						plist.getId(),
						String.valueOf(plist.getNum()),
						plist.getDelivery_Company(),
						plist.getType().toString(),
						plist.getName(),
						plist.getInfo(),
						String.valueOf(plist.getQuantity()),
						String.valueOf(plist.getPrice()),
						String.valueOf(plist.getPrice() * plist.getQuantity()), //총가격
						plist.getIndate().toString()
						*/
				};
				model.addRow(data);
			}
			
		}
		
		
		
	
}
