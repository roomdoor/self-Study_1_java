package ch04;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        Class c1 = Class.forName("ch04.Person"); // 방법 1 String 으로 넣은 것

        Person person = (Person) c1.newInstance(); // 반환 형이 Object 여서 캐스팅
        person.setName("Lee");
        System.out.println(person);

        Class c2 = person.getClass(); // 방법 2 person 이 이미 생성 되어있을때 getClass(Object 의 메서드) 를 사용해서
        Person p = (Person) c2.newInstance();
        System.out.println(p);

        Class[] paraeterTypes = {String.class};
        c2.getConstructor(paraeterTypes);
    }
}
