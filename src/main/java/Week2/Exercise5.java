package Week2;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = reader.nextInt();
        int sum = 0;
        for (int i=0; i<=n; i++) {
            int result = (int)Math.pow(2, i);
            sum += result;
        }
        System.out.println("The sum is: "+sum);

    }
}
