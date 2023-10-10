package tut11_1;

import java.util.ArrayList;
import java.util.List;

class ItemDao {
	
	public List<Item> getItems() {
		//객체(Item) : 상품번호, 상품명, 가격, 재고
		List<Item> aList = new ArrayList<>();
				
		aList.add(new Item(10001000L, "IBM 노트북", 200000, 10));
		aList.add(new Item(10001000L, "게이밍 노트북", 300000, 15));
		aList.add(new Item(10001000L, "삼성 갤럭시북", 400000, 13));
		return aList;
	}
}
//접근제한자 public > protected > default > private
class Item {
	private Long itemNum;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	
	public Item(Long itemNum, String itemName, int itemPrice, int itemStock) {
		this.itemNum = itemNum;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
	}
	
	public void itemDisp() {
		System.out.println("상품번호 : " + itemNum + ", 상품명 : " + itemName + ", 상품가격 : " + itemPrice + ", 삼품재고 : " + itemStock);
	}
	
}

public class List03 {

	public static void main(String[] args) {
		
		ItemDao dao = new ItemDao();
		
//		System.out.println("등록된 상품은 " + aList.size() + "개 입니다.");
//		System.out.println("------------for1 상품출력-------------");
//		for(int i = 0; i < aList.size(); i++) {
//			aList.get(i).itemDisp();
//		}
		
		List<Item> list = dao.getItems();//객체로 받아서 넣는다
		
		System.out.println("------------for2 상품출력-------------");
		for(Item item : list) {
			item.itemDisp();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
