package Week2;
import java.util.Scanner;

public class Execise2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;
        int i=0;
        while(i<3){
            System.out.print("Enter a number: ");
            read= reader.nextInt();
            sum+=read;
            i++;
        }
        System.out.println("Sum is: "+ sum);


    }
}
