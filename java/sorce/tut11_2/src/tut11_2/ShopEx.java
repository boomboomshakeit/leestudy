package tut11_2;

public class ShopEx {

	public static void main(String[] args) {
		
		//판매자로 회원가입 -> (판매자 승인) -> 상품등록(여러개)
		//홍길동만 쓸 수 있는 list 배열 공간을 만들어준다.
		Seller seller = new Seller(1001, "홍길동");
		
		
		seller.addItem("삼성 갤럭시북", 1000000, 10); //상품을 등록함
		seller.addItem("무선 마우스", 20000, 5);
		seller.showMemberInfo();
		
		
		Seller seller2 = new Seller(1002, "김철수");
		seller2.addItem("엘지 그램", 1000000, 10); //상품을 등록함
		seller2.addItem("무선 마우스", 20000, 5);
		
		seller2.showMemberInfo();
		
		
		
		
		
		
		
		
		
		
	}

}
