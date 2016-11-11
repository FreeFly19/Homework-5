/**
 * Created by andy on 11.11.16.
 */
public class Ex1 {
    public static void main(String[] args) {
        printTable(7, 8);
    }

    public static void printTable(int a,int b){
        for (int i = a; i != 0; i--) {
            for (int j = b; j >=1 ; j--) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
