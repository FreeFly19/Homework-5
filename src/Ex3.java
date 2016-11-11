/**
 * Created by andy on 11.11.16.
 */
public class Ex3 {
    public static void main(String[] args) {
        int[] ARR = new int[10];
        RANDOM(ARR);
        System.out.println(sortArr(ARR));
    }

    public static void RANDOM(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20);
        }
    }

   public static int sortArr(int[] mas) {
       int max = 1;
       int index;
       for (int i = 0; i < mas.length; i++) {
           if (max < mas[i]) {
               max = mas[i];
               index = i;
           }
       }
       return index; //я не розуміб чого він підкреслює як помилку
   }
}
