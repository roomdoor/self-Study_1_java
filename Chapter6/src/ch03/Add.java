package ch03;

@FunctionalInterface //에너테이션  // 컴파일러에게 정보를 주는 역할 // 오류 방지
public interface Add {  // 하나의 메서드만 구현 가능 // 두개 이상이 되면 메서드에 이름이 없기 때문에 어떤 인터페이스를 구현했는지 모호해짐
    public int add(int x, int y);
}
