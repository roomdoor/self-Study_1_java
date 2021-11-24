package ch13;

import java.util.TreeSet;
import java.util.Iterator;


public class MemberTreeSet {
    private TreeSet<Member> TreeSet;

    public MemberTreeSet() {
        TreeSet = new TreeSet<>(new Member()); // ****************** new Member()*************** Comparator 사용 시 new Member() 로 구현되어 있으므로 꼭 적어야함
    }

    public void addMember(Member member) {
        TreeSet.add(member);
    }

    public boolean removeMember(int memberId) {

        Iterator<Member> ir = TreeSet.iterator();
        while (ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getMemberID();
            if (tempId == memberId) {
                TreeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member i : TreeSet) {
            System.out.println(i);
        }
        System.out.println();
    }

}
