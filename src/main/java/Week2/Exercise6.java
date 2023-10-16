package Week2;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the amount of times the text will be written: ");
        int numberOfTimes = reader.nextInt();
        for (int i = 0; i < numberOfTimes; i++) {
            printText();
        }
    }
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");



    }
}
