package practice03;

public class Question04 {
    public static void main(String[] args) {
        //findEvenNums(8) ➞ [2, 4, 6, 8]  çift li bulan ları yazalım kaç tane çift sayı var ona bakalım


            int numbers [] = {10, 4, 1, 4, -10, -50, 32, 21};
            int ciftNumbers [] = {};
            int sayac = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    sayac++;
                }
            }
            System.out.println(sayac);
        }
    }
