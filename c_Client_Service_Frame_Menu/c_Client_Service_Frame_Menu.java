package c_Client_Service_Frame_Menu;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import c_Client_DAO.Client_DBdao;
import c_Client_DTO.Client_DTO;
import c_Products_DTO.Products_DTO;

public class c_Client_Service_Frame_Menu extends JFrame {
	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private Dimension screenSize = toolkit.getScreenSize(); // 화면크기
	
	private Client_DBdao cdbdao = null;
	private String username= null;
	JPanel northPanel = new JPanel();
	JTabbedPane tPane = new JTabbedPane();
	
	
	 private JTable myOrderTable;
	 private String colNames[] = {"ID","주문넘버","타입","상품명","수량","개당가격","총가격","주문일"};
	 private DefaultTableModel model = new DefaultTableModel(colNames, 0);
     private JScrollPane scrollPane;
	 
	 
    public c_Client_Service_Frame_Menu(String username, Client_DBdao cdbdao) {
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
        myOrderTable = new JTable(model); // 나중에 실제 DB 데이터로 채움
        JScrollPane orderScrollPane = new JScrollPane(myOrderTable);
        tPane.addTab("나의 주문정보", orderScrollPane);

        // 다른 탭 추가
        tPane.addTab("주문 관리", new JLabel("주문 관리 기능을 구현할 수 있습니다."));
        tPane.addTab("고객 지원", new JLabel("고객 지원 관련 내용을 여기에 표시합니다."));
        
        // JTabbedPane을 프레임에 추가
        this.add(tPane, "Center");

        // JFrame 설정
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    private void loadJDB() {
    	model.setRowCount(0); // 기존행 초기화
    	//public ArrayList<Client_DTO> listAll();
    	
    	ArrayList<Client_DTO> cdlist = cdbdao.listMyOrder(username);
		
		for(Client_DTO cdlisto : cdlist) {
			String[] data= {
					
				/*	plist.getId(),
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