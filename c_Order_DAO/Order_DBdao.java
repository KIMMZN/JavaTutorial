package c_Order_DAO;

import java.util.ArrayList;

import c_Order_DTO.Order_DTO;

public interface Order_DBdao {
	
	public void add(Order_DTO odto);
	public ArrayList<Order_DTO> listAll(String idtemp);
	
}
