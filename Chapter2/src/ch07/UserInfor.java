package ch07;

import java.sql.SQLOutput;

public class UserInfor {

    public UserInfor() {}

    public UserInfor(String userId, String userPassword, String userName, String userPhoneNumber) {
        this.UserId = UserId;
        this.UserPassword = userPassword;
        this.UserName = userName;
        this.UserPhoneNumber = userPhoneNumber;

    }
    public String UserId;
    public String UserPassword;
    public String UserName;
    public String UserPhoneNumber;

    public String ShowUserInfor () {
        return "고객님의 ID는 " + UserId + "이고 비밀번호는 " + UserPassword + "입니다. " +
                "고객님의 이름과 전화번호는 " + UserName +" " + UserPhoneNumber + "입니다.";
    }



}
