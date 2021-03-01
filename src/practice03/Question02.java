package practice03;

public class Question02 {
    public static void main(String[] args) {
        //    differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
        // Smallest number is -50, biggest is 32.  YANİ DİZİNİN EN BÜYÜK ELEMANII İLE EN KÜÇÜK ELEMANINI
        // BULUP İKİSİNİNİ ARASINDAKİ FARKI BULACAĞIZ
        int[] numbers = {10, 4, 1, 4, -10, -50, 32, 21};
        int max = 0;
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("maximun değer: " + max);
        System.out.println("minimum değer: " + min);

        System.out.println("fark = " + (max - min));
    }
}
