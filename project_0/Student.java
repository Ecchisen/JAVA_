public class Student {
    String name;
    int age;

    // Default constructor
    public Student() {
        this("OolGown", 19); // Calls parameterized constructor
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating object using default constructor
        Student s1 = new Student();
        s1.display();

        // Creating object using parameterized constructor
        Student s2 = new Student("Utsav", 20);
        s2.display();
    }
}