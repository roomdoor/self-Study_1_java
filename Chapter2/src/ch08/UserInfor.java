package ch08;

public class UserInfor {


    public int UserHeight;
    public int UserWeight;
    public int UserAge;
    public String UserName;
    public String UserSex;

    public UserInfor(int userHeight, int userWeight, int userAge, String userName, String userSex) {
        this.UserHeight = userHeight;
        this.UserWeight = userWeight;
        this.UserAge = userAge;
        this.UserName = userName;
        this.UserSex = userSex;
    }

    public String showUserInfor(){
        return "주문 고객 " + UserName + "님은" + UserSex + "이고 " + "키, 몸무게, 나이는 "
                            + UserHeight + ", " + UserWeight + ", " + UserAge + "입니다.";
    }
}
