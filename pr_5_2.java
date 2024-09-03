import java.util.Scanner;

class MyException extends Exception {
    private int kathan;

    public MyException(int kathan) {
        this.kathan = kathan;
    }

    @Override
    public String toString() {
        return "MyException[" + kathan + "]";
    }
}

public class pr_5_2 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, x;
        String str;
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        try {
            try {
                System.out.println("Enter the value of a:");
                a = sc.nextInt();
                System.out.println("Enter the value of b:");
                b = sc.nextInt();
                x = a / b;
            } catch (ArithmeticException e) {
                System.out.println("Invalid division");
                System.out.println(e.getMessage());
            }

            try {
                System.out.println("Enter one integer:");
                c = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Format mismatch");
                System.out.println(e.getMessage());
            }

            try {
                System.out.println("Enter an index to access the array:");
                int index = sc.nextInt();
                arr[index] = 10; // Trying to access an array index
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index is invalid");
            }

            try {
                System.out.println("Enter a string:");
                str = sc.next();
                System.out.println("Enter an index to access the string:");
                int index = sc.nextInt();
                char ch = str.charAt(index); // Trying to access a string index
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Index is invalid");
            }

            try {
                System.out.println("Enter a value for custom exception:");
                int kathan = sc.nextInt();
                if (kathan < 0) {
                    throw new MyException(kathan);
                }
            } catch (MyException e) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println("Exception encountered");
        } finally {
            System.out.println("Exception Handling Completed");
        }
    }
}
