package ch08;

public class FoodStore {

    public int OrderNumber;
    public String OrderPhoneNumber;
    public String OrderAddress;
    public int OrderDay;
    public int OrderTime;
    public int OrderPrice;
    public int MenuNumber;

    public String showOrderInfor() {
        return OrderDay + " " + OrderTime + "에 " + OrderAddress + "에서 " + MenuNumber + "메뉴 주문했습니다." +
                  " 주문 가격 " + OrderPrice + "원이고 " + "주문번호 " + OrderNumber + "주문자 전화번호 " + OrderPhoneNumber;
    }

}
