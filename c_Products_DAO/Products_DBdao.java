package c_Products_DAO;

import java.util.ArrayList;

import c_Client_DTO.Client_DTO;
import c_Products_DTO.Products_DTO;

public interface Products_DBdao {
	
	public void add(Products_DTO pddto);//상품추가
	
	
	public ArrayList<Products_DTO> listAll(String idtemp);
	public ArrayList<Products_DTO> searchOne(String temp, String idTemps);
	
	public void delete(int temp);
	
	public void update(Products_DTO pddto);
	
	public Products_DTO selectOne(int temp);
	
	
	

}
