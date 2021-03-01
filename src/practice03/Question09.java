package practice03;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
// asal sayı larını bulunuz kullanıcı irişli olsun


        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı yazınız: ");
        int sayı= scanner.nextInt();

        boolean asalımi = true;
        for (int i = 2; i < sayı ; i++) {
            if (sayı % i == 0 ){
                asalımi = false;
            }

        }
        System.out.println(sayı + "asal mı: " + asalımi );
    }
}
