package ch12;

import java.util.HashSet;
import java.util.Iterator;


public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){
//        for (Member i: arrayList){
//            int temId = i.getMemberID();
//            if (temId == memberId){
//                arrayList.remove(i);
//                return true;
//            }
//
//        }
        Iterator<Member> ir = hashSet.iterator();
        while(ir.hasNext()){
            Member member = ir.next();
            int tempId = member.getMemberID();
            if(tempId == memberId){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }
    public void showAllMember() {
        for (Member i : hashSet) {
            System.out.println(i);
        }
        System.out.println();
    }

}
