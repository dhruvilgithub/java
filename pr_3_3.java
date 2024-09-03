import java.util.*;
public class pr_3_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        employee e1 = new employee();

        employee e2 = new employee();
        e1.printdata();
        e2.printdata();
        System.out.println("\n This Practical is made by 23CS061-Dhruvil Patel ");
        scan.close();
    }
}

class employee {

    String firstName, lastName;
    double salary;
    Scanner scan = new Scanner(System.in);

    employee() {
        System.out.println("Enter Employee first name :");
        firstName = scan.nextLine();
        System.out.println("Enter Employee last name :");
        lastName = scan.nextLine();
        System.out.println("Enter Employee Monthly salary :");
        salary = scan.nextDouble();

        if (salary < 0.0)
            salary = 0.0;

    }

    void printdata() {
        System.err.println("Employee Name :  " + firstName + " " + lastName);
        System.err.println("Employee YEARLY Salary:  " + salary * 12);
        double salary1 = salary + salary * 0.1;
        System.out.println("AFTER GIVE 10% RAISE IN SALARY YOUR YEARLY SALARY IS : " + salary1 * 12);
        scan.close();
    }

}
