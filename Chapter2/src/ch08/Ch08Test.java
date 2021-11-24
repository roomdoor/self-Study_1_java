package ch08;

public class Ch08Test {
    public static void main(String[] args) {

        FoodStore Foodstore = new FoodStore();

        Foodstore.OrderPhoneNumber = "010-1234-1234";
        Foodstore.OrderNumber = 46;
        Foodstore.OrderPrice = 18000;
        Foodstore.MenuNumber = 02;
        Foodstore.OrderTime = 120523;
        Foodstore.OrderDay = 210613;
        Foodstore.OrderAddress = "양천구 목동 블레어빌";

        System.out.println(Foodstore.showOrderInfor());

        UserInfor User1 = new UserInfor (183, 85, 30, "이시화", "남자");

        System.out.println(User1.showUserInfor());
    }
}
