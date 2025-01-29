public class Employee {
        int empId;
        String empName;
        String empDepart;
        String empPost;
        double empSalary;

        public void showEmployeeDetails() {
            System.out.println("Employee ID: " + empId);
            System.out.println("Employee Name: " + empName);
            System.out.println("Employee Department: " + empDepart);
            System.out.println("Employee Post: " + empPost);
            System.out.println("Employee Salary: " + empSalary);
        }
}