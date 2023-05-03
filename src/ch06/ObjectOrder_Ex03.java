package ch06;

//파일 분리하면 private 작성해서 getter, setter 작성해줘야되는데 분리안했으니까 작성x
class Order{
	String orderID; //주문번호
	String customerName; //고객명
	String productCode; //상품코드
	String productName; //상품명
	int productprice; //상품가격
	int productCount; //상품 수량
	String addr; //배송지
	boolean isMember; //회원인지 아닌지
	String title;
	String url;
	
	public Order() {}
	
	public Order(String title) {
		this.title = title;
	}
	
	public Order(String title, String url) {
		this(title);
		this.url = url;
	}
	
	//주문 상품 내용 출력
	public void disp() {
		System.out.println("------------------------");
		System.out.println(title + " - " + url);
		System.out.println("------------------------");
		System.out.println("주분번호 : " + orderID);
		System.out.println("고객명 : " + customerName);
		System.out.println("상품코드 : " + productCode);
		System.out.println("상품명 : " + productName);
		System.out.println("상품가격 : " + productprice + "원");
		System.out.println("상품수량 : " + productCount + "개");
		System.out.println("배송지 : " + addr);
		System.out.println("회원여부 : " + isMember);
		System.out.println("-----------------------");
	}
}

public class ObjectOrder_Ex03 {

	public static void main(String[] args) {
		Order o = new Order("상품주문시스템(송장)", "https://order.koreait.com");
		o.orderID = "K202304028";
		o.customerName = "홍길동";
		o.productCode = "O202304028";
		o.productName = "Java의 정석 기초편";
		o.productprice = 25000;
		o.productCount = 3;
		o.addr = "부산광역시 부산진구";
		o.isMember = false;
				
		//출력
		o.disp();
		
		
		

	}

}
