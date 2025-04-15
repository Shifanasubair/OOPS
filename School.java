import java.util.Scanner;
class Employee 
{
    int empid;
    String name;
    double salary;
    String address;
    public Employee(int empid, String name, double salary, String address)
    {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
    public void displayEmployeeDetails() 
    {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Address: " + address);
    }
}
class Teacher extends Employee 
{
    String department;
    String subjectsTaught;
    public Teacher(int empid, String name, double salary, String address, String department, String subjectsTaught) 
    {
        super(empid, name, salary, address);
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }
    public void displayTeacherDetails() 
    {
        displayEmployeeDetails();
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught: " + subjectsTaught);
        System.out.println();
    }
}
public class School
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of teachers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        Teacher[] teachers = new Teacher[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");
            System.out.print("Enter Employee ID: ");
            int empid = scanner.nextInt();
            scanner.nextLine();  
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();           
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();  
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();        
            System.out.print("Enter Department: ");
            String department = scanner.nextLine();           
            System.out.print("Enter Subjects Taught: ");
            String subjectsTaught = scanner.nextLine();
            teachers[i] = new Teacher(empid, name, salary, address, department, subjectsTaught);
        }
        System.out.println("\nDisplaying details of all teachers:");
        for (int i = 0; i < n; i++) 
        {
            teachers[i].displayTeacherDetails();
        }
        scanner.close();
    }
}

