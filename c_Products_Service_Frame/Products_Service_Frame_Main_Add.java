package c_Products_Service_Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import c_Products_DAO.Products_DBdao;
import c_Products_DTO.Products_DTO;

public class Products_Service_Frame_Main_Add extends JFrame implements ActionListener {
	private Products_DBdao pdbdao = null;
	//private JFrame mainFrame;
	Products_Service_Frame_Main mainc = null;
    
    // 화면 크기 가져오기
    private Toolkit toolkit = Toolkit.getDefaultToolkit();
    private Dimension screenSize = toolkit.getScreenSize(); // 화면 크기

    // 입력 필드 생성
    private JTextField supplierField;  // 공급사 입력 필드
   // private JComboBox<String> typeComboBox;  // 타입 선택 콤보박스
    private JComboBox<Products_DTO.ProductType> typeComboBox;
    private JTextField nameField;  // 상품명 입력 필드
    private JTextField infoField;  // 상품 정보 입력 필드
    private JTextField quantityField;  // 수량 입력 필드
    private JTextField priceField;  // 개당 가격 입력 필드

    private JButton registerButton, cancelButton;  // 등록 및 취소 버튼
    //north 패널및 라벨
    private JPanel northPanel;
    private JLabel northLabel;
    
    
    // 타입 선택을 위한 콤보박스 항목
   // private String[] productTypes = {
   //     "CPU", "그래픽카드", "메인보드", "메모리카드", "SSD", "HDD", "케이스", "파워", "모니터", "운영체제", "마우스", "키보드", "스피커"
    //};

    Products_Service_Frame_Main_Add(Products_DBdao dbdao, Products_Service_Frame_Main mainc ) {
        // 기본 설정
    	pdbdao = dbdao;
    	this.mainc = mainc;
    	
    	//pdbdao.
    	
        this.setTitle("조립 컴퓨터 재고관리 프로그램 v.1.0");
        this.setSize(400, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // 레이아웃 설정
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 2, 3, 10));  // 6행 2열 그리드 레이아웃

        // 라벨과 입력 필드 추가
        inputPanel.add(new JLabel("공급사:"));
        supplierField = new JTextField();
        inputPanel.add(supplierField);

        inputPanel.add(new JLabel("타입:"));
        typeComboBox = new JComboBox<>(Products_DTO.ProductType.values());
        inputPanel.add(typeComboBox);

        inputPanel.add(new JLabel("상품명:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("상품 정보:"));
        infoField = new JTextField();
        inputPanel.add(infoField);

        inputPanel.add(new JLabel("수량:"));
        quantityField = new JTextField();
        inputPanel.add(quantityField);

        inputPanel.add(new JLabel("개당 가격:"));
        priceField = new JTextField();
        inputPanel.add(priceField);

        // 등록 및 취소 버튼 패널
        JPanel buttonPanel = new JPanel();
        registerButton = new JButton("등록");
        cancelButton = new JButton("취소");

        buttonPanel.add(registerButton);
        buttonPanel.add(cancelButton);
        
        //north panel
        northPanel = new JPanel();
        northLabel = new JLabel("상품등록");
        northPanel.setBackground(Color.LIGHT_GRAY);
        northPanel.add(northLabel);
        //private JPanel northPanel;
        //private JLabel northLabel;
        

        // 버튼에 액션 리스너 추가
        registerButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // 메인 프레임에 컴포넌트 추가
        this.add(northPanel, BorderLayout.NORTH);
        this.add(inputPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        
       
        //창닫기시 리셋
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                mainc.reset(); 
            }
        });
        

        this.setVisible(true);
    }

    

	@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            // 등록 버튼 클릭 시 처리 로직 (예: 입력값 DB 저장 등)
            String supplier = supplierField.getText();
            Products_DTO.ProductType type = (Products_DTO.ProductType) typeComboBox.getSelectedItem();
           // String typeTemp = type.toString();
            //String type = (String) typeComboBox.getSelectedItem();
            String name = nameField.getText();
            String info = infoField.getText();
            int quantity = Integer.parseInt(quantityField.getText());
            int price = Integer.parseInt(priceField.getText());
            
            Products_DTO pddto = new Products_DTO();
            pddto.setDelivery_Company(supplier);
            pddto.setType(type);
            pddto.setName(name);
            pddto.setInfo(info);
            pddto.setQuantity(quantity);
            pddto.setPrice(price);
            pdbdao.add(pddto);
            
           
            
            // 입력 값 출력 (또는 DB 처리 로직 추가)
            System.out.println("공급사: " + supplier);
            System.out.println("타입: " + type);
            System.out.println("상품명: " + name);
            System.out.println("상품 정보: " + info);
            System.out.println("수량: " + quantity);
            System.out.println("개당 가격: " + price);
            
            System.out.println("상품등록완료");
           // mainFrame.setEnabled(true); //부모 프레임 다시 활성화함
        } else if (e.getSource() == cancelButton) {
            // 취소 버튼 클릭 시 창 닫기
            this.dispose();
            //mainFrame.setEnabled(true); //부모 프레임 다시 활성화함
            //mainFrame.reset();
            mainc.reset();
        }
    }
}
