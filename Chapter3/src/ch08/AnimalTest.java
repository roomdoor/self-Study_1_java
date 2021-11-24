package ch08; // 이게 바로 다형성이다 코드는 똑같은 move 인데 어떤 인스턴스가 들어갔느냐에 따라서 다른 결과값이 출력된다.

import java.util.ArrayList;

class Animal {

    public void move() {
        System.out.println("동물이 무빙칩니다.");
    }
}

class Human extends Animal {

    @Override
    public void move() {
        System.out.println("사람이 두발로 무빙칩니다.");
    }

    public void readbook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {

    @Override
    public void move() {
        System.out.println("호랑이가 네발로 무빙칩니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 오늘 밤 사냥을 나섭니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘에서 무빙칩니다.");
    }

    public void flying() {
        System.out.println("독수리가 양쪽 날개를 퍼득거립니다.");
    }

}

class Troll extends Animal {
    @Override
    public void move() {
        System.out.println("트롤이 또 트롤 합니다.");
    }

    public void trolling() {
        System.out.println("트롤이 또 남탓을 합니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();
        Animal trAnimal = new Troll();
        AnimalTest test = new AnimalTest();

//        test.moveAniaml(hAnimal);
//        test.moveAniaml(tAnimal);
//        test.moveAniaml(eAnimal);
//        test.moveAniaml(trAnimal);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);
        animalList.add(trAnimal);

        for (Animal animal : animalList) {
            animal.move();
        }


        test.testDownCasting(animalList);
    }

    public void testDownCasting(ArrayList<Animal> list) {
        for (int i = 0; i < list.size(); i++) {

            Animal animal = list.get(i);

            if (animal instanceof Human){
                Human human = (Human)animal;
                human.readbook();
            }

            else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }

            else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            }

            else if (animal instanceof Troll) {
                Troll troll = (Troll) animal;
                troll.trolling();
            }

            else {
                System.out.println("없음");
            }


        }
    }

    public void moveAniaml(Animal animal) {
        animal.move();
    }

}
