package Week2;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second number: ");
        int second = Integer.parseInt(reader.nextLine());
        if (first>second) {
            System.out.println("");
        }
        while (first<=second) {
            System.out.println(first);
            first++;
        }

    }
}
