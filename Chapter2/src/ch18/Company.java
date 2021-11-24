package ch18;

public class Company { // 인스턴스가 하나만 있어야 하는 경우에 사용하는 방법 Ex 회사

    private static Company instance = new Company();

    private Company () { // 생성자를 만들지 안으면 디폴트 생성자가 생성되어 외부에서 인스턴스를 만들 수 있으므로 private로 만듬

    }

    public static Company getInstance /*보통 Instance 라고 메서드를 많이 씀 */() {
        if (instance == null) {
            instance = new Company(); // 이건 혹시나 생성 안되었을때
        }
        return instance;
    }// 이 메서드를 static으로 만듦 으로서 인스턴스를 생성하지 않고 사용 가능

}
