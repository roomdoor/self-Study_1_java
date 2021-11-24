package ch12;

public class Person {

    String name;
    int age;

    public Person() {

        this("no name", 1);

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + ", " + age);
    }

    public Person getPerson () {
        return this;
    }


    public static void main(String[] args) {

        Person Lee = new Person();
        Lee.showPerson();

        System.out.println(Lee);

        Person Lee2 = Lee.getPerson();
        System.out.println(Lee2);

    }

}
