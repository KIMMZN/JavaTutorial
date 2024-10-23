package c_Client_Service_Frame_Menu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import c_Client_DAO.Client_DBdao;
import c_Order_DAO.Order_DAO;
import c_Order_DAO.Order_DBdao;
import c_Order_DTO.Order_DTO;
import c_Products_DAO.Products_DAO;
import c_Products_DAO.Products_DBdao;
import c_Products_DTO.Products_DTO;

public class c_Client_Service_Frame_Menu extends JFrame implements ActionListener {
	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private Dimension screenSize = toolkit.getScreenSize(); // 화면크기
	private Order_DBdao odbdao = null;
	private Client_DBdao cdbdao = null;
	private String username= null;
	private Products_DBdao pdbdao = null;
	JPanel northPanel = new JPanel();
	JTabbedPane tPane = new JTabbedPane();
	
	  //패널1
	 private JTable myOrderTable;
	 private String colNames[] = {"ID","주문넘버","타입","상품명","수량","개당가격","총가격","주문일"};
	 private DefaultTableModel model = new DefaultTableModel(colNames, 0);
     private JScrollPane scrollPane;
     JTextField searchField;
     
     //중앙 jtable패널
     private DefaultTableModel Modelsearch;
     private JButton searchButton;
	 
    public c_Client_Service_Frame_Menu(String username, Client_DBdao cdbdao) {
    	init();
        this.username = username;
        this.cdbdao = cdbdao;
        
        this.setTitle("고객 서비스 프로그램 v.1.0");
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        // North Panel 구성
        northPanel.add(new JLabel("나의 정보: " + username));
        this.add(northPanel, "North");
        
        // JTabbedPane에 탭 추가
        // "나의 주문정보" 탭에 JTable 추가
        myOrderTable = new JTable(model); 
        JScrollPane orderScrollPane = new JScrollPane(myOrderTable);
        tPane.addTab("나의 주문정보", orderScrollPane);
        
        // 다른 탭 추가
        tPane.addTab("주문 관리", orderPanel());
        tPane.addTab("고객 지원", new JLabel("고객 지원 관련 내용을 여기에 표시합니다."));
        
        // JTabbedPane을 프레임에 추가
        this.add(tPane, "Center");

        // JFrame 설정
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        loadJDB();
    }
    
    private void init() {
    	if(odbdao == null) {
    		odbdao = new Order_DAO();
    	}
    	if(pdbdao == null) {
    		pdbdao = new Products_DAO();
    	}
    	
    	
    }
    
    private void loadJDB() {
    	model.setRowCount(0); // 기존행 초기화
    	//public ArrayList<Client_DTO> listAll();
    	
    	//public ArrayList<Order_DTO> listAllbyClient(String idtemp) 
    	
    	ArrayList<Order_DTO> cdlist = odbdao.listAllbyClient(username);
    	//ArrayList<Client_DTO> cdlist = cdbdao.listMyOrder(username);
		
		for(Order_DTO olist : cdlist) {
			String[] data= {
					
					//olist.getAdm_id(),
					olist.getClient_id(),
					String.valueOf(olist.getOrder_num()),
					olist.getProduct_type().toString(),
					//olist.getClient_id(),
					//String.valueOf(olist.getProduct_num()),
					olist.getProduct_name(),
					String.valueOf(olist.getProduct_quantity()),
					String.valueOf(olist.getProduct_price_one()),
					String.valueOf(olist.getProduct_price_total()),
					olist.getIndate().toString()
			};
			model.addRow(data);
		}
    }
    
    private JPanel orderPanel (){
    	 JPanel mainpanel = new JPanel(new BorderLayout());
    	 
    	 //북쪽, 검색패널 및 필드 버튼
    	 // 검색 패널 추가 (위쪽)
         JPanel searchPanel = new JPanel(new BorderLayout());
         
         searchField = new JTextField();//검색필드
         searchButton = new JButton("검색");
         searchButton.addActionListener(this);
         JLabel searchlabel = new JLabel("상품이름: ");
         
         searchPanel.add(searchlabel, "West");
         searchPanel.add(searchField, BorderLayout.CENTER);
         searchPanel.add(searchButton, "East");
         
         // JTable 추가 (중앙)
         String[] col = { "상품번호", "상품명", "타입", "수량", "개당가격", "총가격","상품등록일"};
         Modelsearch = new DefaultTableModel(col, 0);
         JTable searchTable = new JTable(Modelsearch);
         JScrollPane searchScrollP = new JScrollPane(searchTable);
         loadSearchDB();
         
         
         //
         // 주문 패널 추가 (아래쪽)
         
         
         JPanel orderMainPanel = new JPanel(new BorderLayout());
        
         
         
         
         JPanel orderPanel = new JPanel(new GridLayout(4, 2, 5, 5));
         orderPanel.add(new JLabel("상품 넘버:"));
         JTextField productNumberField = new JTextField();
         orderPanel.add(productNumberField);
         
         
         orderPanel.add(new JLabel("주문 수량:"));
         JTextField quantityField = new JTextField();
         orderPanel.add(quantityField);
         
         
         JButton orderButton = new JButton("주문 등록");
         orderPanel.add(orderButton);
         
         //
         orderMainPanel.add(new JLabel("주문"), BorderLayout.NORTH);
         orderMainPanel.add(orderPanel, BorderLayout.CENTER);
         
         
         

         
         //
         mainpanel.add(orderMainPanel, BorderLayout.SOUTH);
         mainpanel.add(searchScrollP, BorderLayout.CENTER);
    	 mainpanel.add(searchPanel, BorderLayout.NORTH);
    	
    	return mainpanel;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == searchButton) {
			searchButtonjdb();
		}
		
	}
	
	private void loadSearchDB() {
		Modelsearch.setRowCount(0); // 기존행 초기화
			//private Products_DBdao pdbdao = null;
		//String[] col = { "상품번호", "상품명", "타입", "수량", "개당가격", "총가격","상품등록일"};
		ArrayList<Products_DTO> pdlist = pdbdao.listAllbyClient();
		
		for(Products_DTO plist : pdlist) {
			String[] data= {
					//plist.getId(),
					String.valueOf(plist.getNum()),
					//plist.getDelivery_Company(),
					plist.getType().toString(),
					plist.getName(),
					//plist.getInfo(),
					String.valueOf(plist.getQuantity()),
					String.valueOf(plist.getPrice()),
					String.valueOf(plist.getPrice() * plist.getQuantity()), //총가격
					plist.getIndate().toString()
			};
			Modelsearch.addRow(data);
		}
	}
	private void searchButtonjdb() {
		System.out.println("디버그 버튼");
		Modelsearch.setRowCount(0); // 기존행 초기화
		String searhTemp= searchField.getText();
		System.out.println(searhTemp+ " 디버그");
		//String searhTemp1= northSouthField_c.getText();
		ArrayList<Products_DTO> pdlist = pdbdao.searchOnebyClient(searhTemp);
		
		for(Products_DTO plist : pdlist) {
			String[] data= {
					//plist.getId(),
					String.valueOf(plist.getNum()),
					//plist.getDelivery_Company(),
					plist.getType().toString(),
					plist.getName(),
					//plist.getInfo(),
					String.valueOf(plist.getQuantity()),
					String.valueOf(plist.getPrice()),
					String.valueOf(plist.getPrice() * plist.getQuantity()), //총가격
					plist.getIndate().toString()
			};
			Modelsearch.addRow(data);
		}
	}
    
    
}