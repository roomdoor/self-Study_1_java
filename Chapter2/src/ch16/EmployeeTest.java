package ch16;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이시화");

        System.out.println(employeeLee.serialNumber);

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김시화");

        System.out.println(employeeKim.getEmployeeId());
        System.out.println(employeeLee.getEmployeeId());
    }
}
