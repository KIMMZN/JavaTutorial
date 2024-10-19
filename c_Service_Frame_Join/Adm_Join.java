package c_Service_Frame_Join;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Adm_Join extends JFrame implements ActionListener {
	JPanel mainP;  
	JLabel idLabel; JTextField idTextField;
	JLabel passLabel; JTextField passTextField;
	JLabel nameLabel; JTextField nameTextField;
	JLabel pnumLabel; JTextField pnumTextField;
	JLabel addressLabel; JTextField addressTextField;
	JButton joinButton;
	JButton exitButton;
	
	public Adm_Join() {
		
		this.setTitle("회원 가입");
		//this.setSize(400,300);
		this.setBounds(500,150,320,600);
		this.setLayout(null);
		
		
		//메인 패널
		//mainP = new JPanel();
		//mainP.setBounds(0,0,400,300);
		//mainP.setLayout(null);
		
		//id
		idLabel = new JLabel("아이디:");
		idLabel.setBounds(50,20,100,50);
		idTextField = new JTextField();
		idTextField.setBounds(50,70,200,30);
		
		//비밀번호
		passLabel = new JLabel("비밀번호:");
		passLabel.setBounds(50,120,100,50);
		passTextField = new JTextField("비밀번호 입력하시오");
		passTextField.setBounds(50,170,200,30);
		
		//이름
		nameLabel = new JLabel("이름:");
		nameLabel.setBounds(50,220,100,50);
		nameTextField = new JTextField();
		nameTextField.setBounds(50,270,200,30);
		
		//폰넘버
		pnumLabel = new JLabel("전화번호:");
		pnumLabel.setBounds(50,320,100,50);
		pnumTextField = new JTextField();
		pnumTextField.setBounds(50,370,200,30);
		
		//주소
		addressLabel =  new JLabel("주소:");
		addressLabel.setBounds(50,420,100,50);
		addressTextField =  new JTextField();
		addressTextField.setBounds(50,470,200,30);
		
		
		//회원가입 버튼
		joinButton = new JButton("회원가입");
		joinButton.setBounds(50,520,100,30);
		
		//취소 버튼
		exitButton = new JButton("취소");
		exitButton.setBounds(150,520,100,30);
		
		this.add(idTextField);
		this.add(idLabel);
		this.add(passTextField);
		this.add(passLabel);
		this.add(nameTextField);
		this.add(nameLabel);
		this.add(pnumTextField);
		this.add(pnumLabel);
		this.add(addressLabel);
		this.add(addressTextField);
		this.add(joinButton);
		this.add(exitButton);
		//this.add(mainP);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		joinButton.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//if(e.getSource() == )
		
	}
	
	
	

}
