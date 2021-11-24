package re15;

public class Student {

    private String name;
    private int money;

    public Student(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void take(Taxi taxi){

        this.money -= 10000;
        taxi.take();
    }


    public void showInfo() {
        System.out.println(name+ "님의 남은 돈은 " + money + "원 입니다.");
    }



}
