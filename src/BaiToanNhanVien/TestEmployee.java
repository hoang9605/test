package BaiToanNhanVien;

public class TestEmployee {
    public static void main(String[] args) {
        Employee objJohn = new SalaryEmployee("John", 2300.2);
        objJohn.displayDetails();
        Employee objDavid = new WageEmployee("David",30.4, 10);
        objDavid.displayDetails();

    }
}
