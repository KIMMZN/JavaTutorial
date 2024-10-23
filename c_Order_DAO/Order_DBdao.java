package c_Order_DAO;

import java.util.ArrayList;

import c_Order_DTO.Order_DTO;
import c_Products_DTO.Products_DTO;

public interface Order_DBdao {
	
	
	public boolean add1(Order_DTO odto);
	
	public void add(Order_DTO odto);
	public ArrayList<Order_DTO> listAll(String idtemp);
	public ArrayList<Order_DTO> searchOne(String temp, String idTemps);
	
}
