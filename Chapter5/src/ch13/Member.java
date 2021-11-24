package ch13;  // TreeSet 만들기

import java.util.Comparator;

public class Member implements Comparator<Member> {

    private int memberID;
    private String memberName;

    public Member(){
    }

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
    public int hashCode() {
        return memberID;
    }



    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member member = (Member)obj;
            if (member.memberID == this.memberID) {
                return true;
            }else return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return memberName + "님의 아이디는 " + memberID + " 입니다.";
    }

//    @Override
//    public int compareTo(Member member) {       //TreeSet 에 정렬을 위한 필수 함수 (Comparable implement 하면 만드는 함수)
////        if(this.memberID > member.memberID)
////            return 1;
////        else if(this.memberID < member.memberID)
////            return -1;
////        else return 0;
//        return (this.memberID - member.memberID);   // 이미 들어가 있는 수 - 넣어야하는 수 해서 음수 양수 0 을 이옹해서 정렬  -1을 곱하면 역순으로 정렬
//    }

    @Override
    public int compare(Member member1, Member member2) {  // reeSet 에 정렬을 위한 필수 함수 (Comparator implement 하면 만드는 함수)
        return (member1.memberID - member2.memberID);     //  중요 Comparator 를 구현시 TreeSet 생성자 (constructor) 안에 Comparator 가 구현된 default constructor 를 써야함{treeSet = new TreeSet<Member>(*********new Member()***********)
    }                                                     //  *********** 부분 있어야함
}
