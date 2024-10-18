package c_Client_DAO;

import java.util.ArrayList;

import c_Client_DTO.Client_DTO;
//import dto.WordDTO;

public interface Client_DBdao {
	
	public void add(Client_DTO ctdto);
	//public ArrayList<WordDTO> selectAll();
	public ArrayList<Client_DTO> listAll();

	

}
