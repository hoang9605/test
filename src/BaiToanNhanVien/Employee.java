package BaiToanNhanVien;

public class Employee {
    String empName;

    public Employee() {
    }

    public Employee(String empName) {
        this.empName = empName;
    }

    void displayDetails() {
        System.out.printf("Employee Name: %s", empName);
    }
}
