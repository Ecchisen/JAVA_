import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Xmen xmen = new Xmen();
        xmen.run();

        //calling Sum Method
        int Sum = xmen.addNumbers(10, 20);
        System.out.println("Sum of two numbers: " + Sum);
    }
}

 class Xmen {
    public void run() {
        String Name;
        int Age;
        char gender;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        Name = input.nextLine();

        System.out.print("Enter your age: ");
        Age = input.nextInt();

        System.out.print("Enter your gender (M/F): ");
        gender = input.next().charAt(0);

        input.close();   

        System.out.print("\n");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Gender: " + gender);
    }

    //Sum method
    public int addNumbers(int a, int b) {
        return a + b;
    }
}