package re08;

public class Person {
    private int height;
    private int weight;
    private String gender;
    private String name;
    private int age;

    FoodStore order;

    public Person(String gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        order = new FoodStore();
    }

    public void setOderInfo(int orderNumber,int phoneNumber, String address, int date, int time, int price, int menuNumber) {
        order.setOrderNumber(orderNumber);
        order.setPhoneNumber(phoneNumber);
        order.setAddress(address);
        order.setDate(date);
        order.setTime(time);
        order.setPrice(price);
        order.setMenuNumber(menuNumber);
    }

    public void showInfo() {
        System.out.println(name + " " +gender +"고객의 신체 정보는 " + height + "cm " + weight + "kg " + age+ "세 입니다.");

        System.out.println("주문 번호 : " + order.getOrderNumber());
        System.out.println("주문 주소 : " + order.getAddress());
        System.out.println("주문 전화 번호 : " + order.getPhoneNumber());
        System.out.println("주문 날짜: " + order.getDate());
        System.out.println("주문 시간 : " + order.getTime());
        System.out.println("주문 가격 : " + order.getPrice());

    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
