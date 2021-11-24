package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    public MyCompare(){ // default constructor 필요
    }

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2) * -1;            //  return o1.compareTo(o2); 라고 적으면 원래 String 의 Comparable 과 같음 이를 바꿔 줌으로써 내림차순으로 정렬 가능
    }                                            // Comparable 은 Jva lang 패키지 안에 있음 Comparator 는 Java util 패키지 안에 있음 ??????????
}
public class MemberTreeSetTest {
    public static void main(String[] args) {

//        TreeSet<String> set = new TreeSet<>();
//        set.add("홍");
//        set.add("김");
//        set.add("나");
//        set.add("박");
//        set.add("이");
//        System.out.println(set);// 자동으로 정렬되서 나옴 comparable 을 TreeSet 에 포함하고 있음


//        MemberTreeSet memberTreeSet = new MemberTreeSet();
//
//        Member memberLee = new Member(1001, "이");
//        Member memberKim = new Member(1002, "김");
//        Member memberPark = new Member(1003, "박");
//        Member memberNa = new Member(1004, "나");
//
//        memberTreeSet.addMember(memberLee);
//        memberTreeSet.addMember(memberKim);
//        memberTreeSet.addMember(memberPark);
//        memberTreeSet.addMember(memberNa);
//
//        Member memberHang = new Member(1004,"황");
//        memberTreeSet.addMember(memberHang);
//
//        memberTreeSet.showAllMember();

        // 이미 Comparable 이 구현되어 있어 오름차순 으로 되어있을 때 Comparator 를 사용해서 내림차순으로 바꿀 수 있다.

        TreeSet<String> set = new TreeSet<String>(new MyCompare());

        set.add("a");
        set.add("b");
        set.add("bb");
        set.add("c");

        System.out.println(set);
    }
}
