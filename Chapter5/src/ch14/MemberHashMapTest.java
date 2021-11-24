package ch14;

import java.util.HashMap;

public class MemberHashMapTest {
    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "이");
        Member memberKim = new Member(1002, "김");
        Member memberPark = new Member(1003, "박");
        Member memberNa = new Member(1004, "나");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberPark);
        memberHashMap.addMember(memberNa);

        Member memberHang = new Member(1004, "황");
        memberHashMap.addMember(memberHang);

        memberHashMap.showAllMember();

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1001,"kim");
        hashMap.put(1002,"Lee");
        hashMap.put(1003,"Na");
        hashMap.put(1004,"Park");

        System.out.println(hashMap);
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.containsKey(1001));
        System.out.println(hashMap.get("kim"));
    }
}
