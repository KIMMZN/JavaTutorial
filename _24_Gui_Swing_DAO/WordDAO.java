package _24_Gui_Swing_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import _24_Gui_Swing_DTO.WordDTO;


public class WordDAO {
	private String username= "system";
	private String password= "11111111";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String driverName= "oracle.jdbc.driver.OracleDriver";
	private Connection conn = null; // 커넥션 자원 변수
	
	public static WordDAO worddao = null;
	
	private WordDAO() {
		init();
	}
	
	public static WordDAO getInstance() {
		if(worddao == null) {
			worddao = new WordDAO();
		}
		return worddao;
	}
	
	
	private void init() {	// 드라이버 로드	
		try {
			Class.forName(driverName);
			System.out.println("드라이버 로드");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private boolean conn() { // 커넥션 
		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("커넥션 자원 획득");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public void insert(WordDTO worddto) {
		//커넥션, 쿼리, 매핑, 
		if(conn()) {		//wordnum
			try {
				String sql = "insert into wordlove values" +"(wordnum.nextval, ?,?)";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, worddto.getKword());
				psmt.setString(2, worddto.getEword());
				//psmt.setString(3, ideadto.getWriter());
				//쿼리 실행
				int resultInt = psmt.executeUpdate();
				//트랜잭션 처리
				if(resultInt > 0) {
					conn.commit();
				}else {
					conn.rollback();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("데이터베이스 개선실패");
		}
	}
	public ArrayList<WordDTO> selectAll() {
		ArrayList<WordDTO> ilist = new ArrayList<>();
		if(conn()) {
			try {
				String sql = "select * from wordlove";
				PreparedStatement psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();
				while(rs.next()) {
					WordDTO iTemp = new WordDTO();					
					iTemp.setNum(rs.getInt("num"));
					iTemp.setKword(rs.getString("kword"));
					iTemp.setEword(rs.getString("eword"));				
					ilist.add(iTemp);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}else {
			System.out.println("실패");
		}
		return ilist;
	}
	public void update(WordDTO worddto) {
		if(conn()) {
			try {
				String sql = "update wordlove set"+" kword=?,eword=? where num=?";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setInt(3, worddto.getNum());
				psmt.setString(1, worddto.getKword());
				psmt.setString(2, worddto.getEword());
				psmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
	}
	public WordDTO selectOne (int findId) {
		//ArrayList<IdeaDTO> idealist = new ArrayList<>();
		if(conn()) {
			try {
				//String sql = "delete from ideadata where ideanum = ?";			
				String sql = "select * from wordlove where num=?";
				
				PreparedStatement pstmt = conn.prepareStatement(sql);
				//mapping
				pstmt.setInt(1, findId);
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {//next()메서드는 rs에서 참조하는 테이블에서
								//튜플을 순차적으로 하나씩 접근하는 메서드
					WordDTO iTemp = new WordDTO();
					//rs.getString("id") rs가 접근한 튜플에서 id컬럼의 값을 가져옴
					iTemp.setNum(rs.getInt("num"));
					iTemp.setKword(rs.getString("kword"));
					iTemp.setEword(rs.getString("eword"));	
					return iTemp;
					//idealist.add(iTemp);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			System.out.println("실패");
		}
		return null;
	}
	
	
	

}
