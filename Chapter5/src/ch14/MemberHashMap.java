package ch14;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap(){
        hashMap = new HashMap<>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberId) {
        if( hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
        }
        System.out.println("No Element");
        return false;
    }

    public void showAllMember(){ // 그냥 hashMap 쭉 프린트 해도 되지만 Iterator 사용해서 해봄

        Iterator<Integer> ir = hashMap.keySet().iterator(); //Iterator 사용법 먼저 커서를 맨 앞에 둔다.  만약 keySet 대신 values 쓰면 value 값 그냥 출력 가능함

        while ( ir.hasNext()){                              // 커서 다음에 무언가가 없을때 까지 계속 한다
            int key = ir.next();                            // key 값을 하나씩 다 불러 온다
            Member member = hashMap.get(key);               // key 값으로 value 값을 불러온다
            System.out.println(member);                     // value 값 출력한다.
        }
    }
}
