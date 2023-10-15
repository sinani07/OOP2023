import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        /*String correctPassword = "Ardian123";
        boolean passwordCorrect = false;
        while (!passwordCorrect) {
            System.out.print("Enter your password: ");
            String userPassword = reader.nextLine();
            if (userPassword.equals(correctPassword)) {
                System.out.println("You entered the correct password! karrot!");
                passwordCorrect = true;
            } else {
                System.out.println("Incorrect password, try again!");
            }
        }*/
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