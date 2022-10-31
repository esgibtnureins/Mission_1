package Java.Mission_1.Star;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int star = scanner.nextInt();

        for (int i=1; i<=star; i++) { //i는 행
            for (int j=1; j<=i; j++) { //출력?
                System.out.print("*");
            }
            System.out.printf("\n");
        }
    }
}
