package ch10;

public class Member {
    private int memberID;
    private String memberName;
    public Member(int Id, String Name){
        this.memberID = Id;
        this.memberName = Name;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + "님의 아이디는 " + memberID + " 입니다.";
    }
}
