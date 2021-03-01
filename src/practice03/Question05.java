package practice03;

public class Question05 {
    public static void main(String[] args) {
        // array lelemalarının  toplamını bulan program yazınınz ve ortalamayı bulunuz
        // örnek: 10,20,30,2,4

        int array[]= {10,20,30,40,50};

            int toplam = 0;
            for (int i = 0; i < array.length; i++) {

                toplam += array[i];
            }
            System.out.println("Array elemanlarının toplamı = " + toplam);
            System.out.println("Array elemanlarını ortalamsı = " + (toplam/array.length));

    }
}
