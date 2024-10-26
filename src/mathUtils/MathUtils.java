package mathUtils;

public class MathUtils {
    public void max(int a, int b){
        if (a > b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }

    public void max(double a, double b){
        if (a > b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }

    public void max(int arr[]){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public void max(double arr[]){
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public MathUtils() {
    }

    public static void main(String[] args) {
        MathUtils obj = new MathUtils();
        obj.max(3, 5);
        obj.max(3.4, 2.5);
        int inte[] = {4, 56, 8, 3, 2, 6, 23, 5, 3};
        obj.max(inte);
        double doub[] = {1.3, 4.5, 7.8, 4.6, 9.0, 8};
        obj.max(doub);

    }
}
