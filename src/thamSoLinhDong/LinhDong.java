package thamSoLinhDong;

public class LinhDong {
    public int sum(int i, int...j){
        int sum = i;
        for (int x : j){
            sum +=x;
        }
        return sum;
    }

    public LinhDong() {
    }

    public static void main(String[] args) {
        LinhDong ld = new LinhDong();
        System.out.println(ld.sum(2, 3, 5, 7, 3));
    }
}
