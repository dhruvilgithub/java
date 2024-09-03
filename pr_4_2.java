import java.util.*;

public class pr_4_2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Manager m1 = new Manager();
        e1.printSalary();
        m1.printSalary();
    }

}

class member {
    Scanner scan = new Scanner(System.in);

    protected int age;
    protected String name, address;
    protected float salary;
    protected int[] number = new int[10];

    public void printSalary() {
        System.out.println("your salary is :" + salary);
    }
}

class Employee extends member {
    private String specialization;

    public Employee() {
        System.out.println("Enter specialization :");
        specialization = scan.nextLine();
        System.out.println("Enter name :");
        name = scan.nextLine();
        System.out.println("Enter Age :");
        age = scan.nextInt();
        System.out.println("Enter salary :");
        salary = scan.nextFloat();
        scan.nextLine();
        System.out.println("Enter address :");
        address = scan.nextLine();
        System.out.println("Enter number :");
        for (int i = 0; i < 10; i++) {
            if (scan.hasNextInt()) {
                number[i] = scan.nextInt();
            }
        }
    }

}

class Manager extends member {
    private String department;

    public Manager() {
        System.out.println("Enter Department :");
        department = scan.nextLine();
        System.out.println("Enter name :");
        name = scan.nextLine();
        System.out.println("Enter Age :");
        age = scan.nextInt();
        System.out.println("Enter salary :");
        salary = scan.nextFloat();
        scan.nextLine();
        System.out.println("Enter address :");
        address = scan.nextLine();
        System.out.println("Enter number :");
        for (int i = 0; i < 10; i++) {
            if (scan.hasNextInt()) {
                number[i] = scan.nextInt();
            }
        }
    }

}
