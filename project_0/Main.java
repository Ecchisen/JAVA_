import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num_1 = scanf.nextInt();
        System.out.println("Enter the second number: ");
        int num_2 = scanf.nextInt();

        scanf.close();
        System.out.println("The sum of these numbers is: " + (num_1 + num_2));
    }
}