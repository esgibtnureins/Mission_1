package Java.Mission_1.Star;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int star = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <=star-i; j++) {
                System.out.print(" ");
            }
            for (int k=0;k<i;k++) {
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
