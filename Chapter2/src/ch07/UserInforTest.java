package ch07;

public class UserInforTest {
    public static void main(String[] args) {

        UserInfor user1 = new UserInfor();

        user1.UserId = "user1";
        user1.UserPassword = "qwer";
        user1.UserName = "일이름";
        user1.UserPhoneNumber = "010-1234-1234";

        UserInfor user2 = new UserInfor("2345", "rewq", "이이름", "010-4321-4321");

        System.out.println(user1.ShowUserInfor());
        System.out.println();
        System.out.println(user2.ShowUserInfor());
    }
}
