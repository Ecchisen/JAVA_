import java.util.Scanner;
public class Class2 {
    public static void main(String[] args) {
        int passMark = 30;
        int marks[] = new int[5];

        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5; i++) {
            System.out.println("Enter marks for subject " + (i+1) + ": ");
            marks[i] = scan.nextInt();
        }

        if(marks[0] >= passMark && marks[1] >= passMark && marks[2] >= passMark && marks[3] >= passMark && marks[4] >= passMark) {
            System.out.println("You have passed the exam");

            int totalMarks = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
            System.out.println("Total marks: " + totalMarks);
        } else {
            System.out.println("You have failed the exam");
        }
    }
}
