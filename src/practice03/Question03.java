package practice03;

public class Question03 {
    public static void main(String[] args) {
        //findEvenNums(8) ➞ [2, 4, 6, 8]  çift li bulan ları yazalım

        int[] numbers = {10, 4, 1, 4, -10, -50, 32, 21};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                System.out.print(" >> " + numbers[i]);
        }
    }
}
