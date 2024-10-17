package c_Products_DAO;

import java.util.ArrayList;

import c_Client_DTO.Client_DTO;
import c_Products_DTO.Products_DTO;

public interface Products_DBdao {
	
	public void add(Products_DTO pddto);
	public ArrayList<Products_DTO> listAll();

}
