package practice03;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        // System.out.println("Sayı gir kontrol edelim asal mı ? ");
        // int sayi = giris.nextInt();
        for (int k = 1; k <= 100; k++) {
            boolean asalmi = true;
            if (k == 1) {
                asalmi = false;
                System.out.println(k + " asal mı = " + asalmi);
                continue;
            }
            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                    asalmi = false;
                }
            }
            System.out.println(k + " asal mı = " + asalmi);
        }

    }
}
