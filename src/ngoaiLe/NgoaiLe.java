package ngoaiLe;

public class NgoaiLe {
    public NgoaiLe() {
    }
    public void chia(int a, int b){
        try {
            int x = a / b;
            System.out.println(x);
        } catch (ArithmeticException ex) {
            System.out.println("Chia cho khong");;
        }
    }

    public static void main(String[] args) {
        NgoaiLe nl = new NgoaiLe();
        nl.chia(4, 0);
    }
}
