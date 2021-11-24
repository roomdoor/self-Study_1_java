package ch17;

public class Employee {

    private static int serialNumber = 1000; // static 변수는 호출할 때 인스턴스. 이 아닌 class이름. 으로 호출 가능

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee(){
        serialNumber++;
        employeeId = serialNumber;
    }

    public static int getSerialNumber() {
        int i;  // 이 변수는 이 함수 내에서 생성된 지역변수
                // static 메서드는 인스턴스 생성과 무관하게 클래스 이름으로 호출될 수 있음 그래서 여기 생성된 변수를 불러서 사용가능
                // 또한 이 함수가 불러지면 변수 i가 만들어지고 함수가 끝나면 변수 i는 사라짐

        //employeeName = Lee;  이건 문제가 되는게 이 함수가 불러졌을때 employeeName 이 없을 수도 있음


        return serialNumber; // 이놈은 메모리에 생성되기 때문에 아무 상관 없음
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
