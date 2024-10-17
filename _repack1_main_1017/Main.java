package _repack1_main_1017;

import _repack1_dao_info_1017.DBdao;
import _repack1_dao_info_1017.WordDAO;
import _repack1_service_1017.WordMainFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		DBdao dao = new WordDAO();
		WordMainFrame ws = new WordMainFrame(dao);

	}

}
