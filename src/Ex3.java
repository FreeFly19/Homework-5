/**
 * Created by andy on 11.11.16.
 */
public class Ex3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArrayRandomGeneratedValues(arr);
        System.out.println(getIndexOfMaxElement(arr));
    }

    public static void fillArrayRandomGeneratedValues(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20);
        }
    }

    public static int getIndexOfMaxElement(int[] mas) {
        int max = -2147483648; // Minimal value of integer type
        int index = 0;
        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
                index = i;
            }
        }
        return index;
    }
}
