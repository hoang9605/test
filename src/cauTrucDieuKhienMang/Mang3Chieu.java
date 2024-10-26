package cauTrucDieuKhienMang;

import java.util.Scanner;

import static java.lang.System.in;

public class Mang3Chieu {
    int[][][] A = new int[3][4][6];

    public void nhapMang(int[][][] A){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 6; k++) {
                    A[i][j][k] = new Scanner(in).nextInt();
                }
            }
        }
    }

    public void inMang(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 6; k++) {
                    System.out.print(A[i][j][k] + " ");
                }
                System.out.println("");
            }
        }
    }

    public Mang3Chieu(int[][][] a) {
        A = a;
    }
}
