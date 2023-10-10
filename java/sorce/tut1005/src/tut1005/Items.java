package tut1005;

public class Items {
	
	private int proNum;
	private String proName;
	private int proPrice;
	private int proStock;
	private String proDate;
	
	//getter, setter
	public int getProNum() {
		return proNum;
	}
	public void setProNum(int proNum) {
		this.proNum = proNum;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getProPrice() {
		return proPrice;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	public int getProStock() {
		return proStock;
	}
	public void setProStock(int proStock) {
		this.proStock = proStock;
	}
	public String getProDate() {
		return proDate;
	}
	public void setProDate(String proDate) {
		this.proDate = proDate;
	}
	
	@Override
	public String toString() {
		return "Items [proNum=" + proNum + ", proName=" + proName + ", proPrice=" + proPrice + ", proStock=" + proStock
				+ ", proDate=" + proDate + "]";
	}
	
	
	
}
