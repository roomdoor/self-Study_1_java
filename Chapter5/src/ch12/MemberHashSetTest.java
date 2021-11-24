package ch12;

public class MemberHashSetTest {
    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();
        Member memberLee = new Member(1001, "이");
        Member memberKim = new Member(1002, "김");
        Member memberPark = new Member(1003, "박");
        Member memberNa = new Member(1004, "나");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberPark);
        memberHashSet.addMember(memberNa);

        Member memberHang = new Member(1004,"황");
        memberHashSet.addMember(memberHang);
        memberHashSet.showAllMember();


    }
}
