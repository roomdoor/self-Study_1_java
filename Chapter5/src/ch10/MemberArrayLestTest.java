package ch10;

public class MemberArrayLestTest {
    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();
        Member memberLee = new Member(1001, "이");
        Member memberKim = new Member(1002, "김");
        Member memberPark = new Member(1003, "박");
        Member memberNa = new Member(1004, "나");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberNa);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberKim.getMemberID());

        memberArrayList.showAllMember();
    }
}
