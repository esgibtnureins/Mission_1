package Java.Mission_1.ConditionalStatement;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        String str = A > B ? ">" : (A < B ? "<" : "==");
        System.out.println(str);
    }
}

