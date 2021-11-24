package ch17;

import java.io.*;

class Person implements Serializable{  // Serializable 구현 코드는 없고 serial 화 가능하다는 것
    String name;
    transient String jop;       // 직렬화 하려고하는데 직렬화가 안되는 변수가 있으면 transient 사용해서 그 것만 제외하고 직렬화 가능
                                // 다시 복원할때 입력이 안되었기 때문에 인스턴스의 default 값을 넣어준다 ex)null

    public Person() {}

    public Person(String name, String jop) {
        this.name = name;
        this.jop = jop;
    }

    public String toString() {
        return name + ", " + jop;
    }
}

public class SerializationTest {
    public static void main(String[] args) {

        Person personLee = new Person("Lee", "백수");
        Person personKim = new Person("Kim", "흰손");

        try (FileOutputStream fos = new FileOutputStream("serial.txt")){
            ObjectOutputStream oos = new ObjectOutputStream(fos);  // new ObjectInputStream(new FileInputStream) 이렇게 해도 됨
            oos.writeObject(personLee);
            oos.writeObject(personKim);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("serial.txt")){
            ObjectInputStream ois = new ObjectInputStream(fis);  // new ObjectInputStream(new FileInputStream) 이렇게 해도 됨
            Person pLee = (Person) ois.readObject();
            Person pKim = (Person) ois.readObject();
            System.out.println(pLee);
            System.out.println(pKim);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
