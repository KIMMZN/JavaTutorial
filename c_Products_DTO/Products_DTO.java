package c_Products_DTO;

import java.sql.Timestamp;

public class Products_DTO {
	//컴퓨터 부품 정보
	public enum ProductType{
		CPU, 메인보드, 메모리, SSD, HDD, 케이스, 파워, 모니터, 운영체제, 마우스, 키보드, 스피커 
	}
	
	
	//private String type = null;
	private int num = 0;

	private ProductType type = null;
	private String name = null;
	private String info = null;
	private int quantity = 0;
	private int price = 0;
	private Timestamp indate = null;
	
	@Override
	public String toString() {
		return "Products_DTO [num=" + num + ", type=" + type + ", name=" + name + ", info=" + info + ", quantity="
				+ quantity + ", price=" + price + ", indate=" + indate + "]";
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public Timestamp getIndate() {
		return indate;
	}

	public void setIndate(Timestamp indate) {
		this.indate = indate;
	}

	//생성자
	public Products_DTO() {};
	
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}
	
	
	
	

}
