package c_Order_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import c_Order_DTO.Order_DTO;
import c_Products_DTO.Products_DTO;
import c_Products_DTO.Products_DTO.ProductType;

public class Order_DAO implements Order_DBdao {
	private String username= "system";
	private String password= "11111111";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String driverName= "oracle.jdbc.driver.OracleDriver";
	private Connection con = null; // 커넥션 자원 변수
	
	public Order_DAO() {
		init();
		
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
	
	private boolean con() { // 커넥션 
		try {
			con = DriverManager.getConnection(url, username, password);
			System.out.println("커넥션 자원 획득");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public void add(Order_DTO odto) {
		// TODO Auto-generated method stub
		if(con()) {
			try {
				String sql = "insert into client_order values" 
						+"(order_num.nextval, ?,?,?,?,?,?,?,?,default)";
				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setString(1, odto.getAdm_id());
				psmt.setString(2, odto.getClient_id());
				psmt.setInt(3, odto.getProduct_num());
				psmt.setString(4, odto.getProduct_type());
				psmt.setString(5, odto.getProduct_name());
				psmt.setInt(6, odto.getProduct_quantity());
				psmt.setInt(7, odto.getProduct_price_one());
				psmt.setInt(8, odto.getProduct_price_total());
				int resultInt = psmt.executeUpdate();
				//트랜잭션
				if(resultInt > 0) {
					con.commit();
					System.out.println("등록완료");
				}else {
					con.rollback();
					System.out.println("등록실패");
				}		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if(con != null) {
						con.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}else {
			System.out.println("커넥션 실패");
		}
		
		
	}



	@Override
	public ArrayList<Order_DTO> listAll(String idtemp) {
		// TODO Auto-generated method stub
		ArrayList<Order_DTO> odlist = new ArrayList<>();
		if(con()) {
			try {
				String sql = "select * from client_order where adm_id = ?";
				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setString(1, idtemp);
				ResultSet rs = psmt.executeQuery();
				while(rs.next()) {
					Order_DTO odto = new Order_DTO();
					odto.setOrder_num(rs.getInt("order_num"));
					odto.setAdm_id(rs.getString("adm_id"));
					odto.setClient_id(rs.getString("client_id"));
					odto.setProduct_num(rs.getInt("product_num"));
					System.out.println("1");
					odto.setProduct_type(rs.getString("product_type"));
					System.out.println("1+1?");
					odto.setProduct_name(rs.getString("product_name"));
					odto.setProduct_quantity(rs.getInt("product_quantity"));
					odto.setProduct_price_one(rs.getInt("product_price_one"));
					System.out.println("2");
					odto.setProduct_price_total(rs.getInt("product_price_total"));
					odto.setIndate(rs.getTimestamp("indate"));
					odlist.add(odto);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if(con != null) {
						con.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}else {
			System.out.println("실패");
		}
		return odlist;
	}



	@Override
	public ArrayList<Order_DTO> searchOne(String temp, String idTemps) {
		// TODO Auto-generated method stub
				ArrayList<Order_DTO> odlist = new ArrayList<>();
				if(con()) {
					try {
						String sql = "SELECT * FROM client_order WHERE " +
					             "adm_id = '" + idTemps + "' AND " +
					             "(client_id LIKE '%" + temp + "%' OR " +
					             "product_name LIKE '%" + temp + "%' OR " +
					             "product_type LIKE '%" + temp + "%')";
						
						PreparedStatement psmt = con.prepareStatement(sql);
						ResultSet rs = psmt.executeQuery();
						while(rs.next()) {
							Order_DTO odto = new Order_DTO();
							odto.setOrder_num(rs.getInt("order_num"));
							odto.setAdm_id(rs.getString("adm_id"));
							odto.setClient_id(rs.getString("client_id"));
							odto.setProduct_num(rs.getInt("product_num"));
							System.out.println("1");
							odto.setProduct_type(rs.getString("product_type"));
							System.out.println("1+1?");
							odto.setProduct_name(rs.getString("product_name"));
							odto.setProduct_quantity(rs.getInt("product_quantity"));
							odto.setProduct_price_one(rs.getInt("product_price_one"));
							System.out.println("2");
							odto.setProduct_price_total(rs.getInt("product_price_total"));
							odto.setIndate(rs.getTimestamp("indate"));
							odlist.add(odto);
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						try {
							if(con != null) {
								con.close();
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}else {
					System.out.println("실패");
				}
		return odlist;
	}
	
	

}
