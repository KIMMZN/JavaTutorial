package _repack1_dao_info_1017;

import java.util.ArrayList;

import _repac1k_dto_1017.WordDTO;

public interface DBdao {
	public void add(WordDTO wdto);
	public ArrayList<WordDTO> selectAll();
	public void mod(WordDTO wdto);
	public void delete(WordDTO wdto);
}
