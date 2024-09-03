import java.util.Scanner;
interface Shapes{
    void input();
    void output();
}

class Signs{
    double area;
    String text;
    String colour;

    void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter colour: ");
        colour = sc.nextLine();
        System.out.println("Text: ");
        text = sc.nextLine();
    }
}

class Circle extends Signs implements Shapes{
    private double radius;
    Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.println("Enter radius: ");
        radius = sc.nextDouble();
        area = 3.14 * radius * radius;
        sc.close();
    }
    public void output(){
        System.out.println("Radius: " + radius);
        System.out.println("colour: " + colour);
        System.out.println("Text: " + text);
        System.out.println("Area: " + area);
    }
}

class Rectangle extends Signs implements Shapes{
    private double length, width;
    Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.println("Enter length & width: ");
        length = sc.nextDouble();
        width = sc.nextDouble();
        area = length * width;
        sc.close();
    }
    public void output(){
        System.out.println("Length: " + length);
        System.out.println("width: " + width);
        System.out.println("colour: " + colour);
        System.out.println("Text: " + text);
        System.out.println("Area: " + area);
    }
}

public class pr_4_7{
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        int a;
        System.out.println("Enter your choice: ");
        a = sc.nextInt();
        switch(a){
            case 1:
                c.get();
                c.input();
                c.output();
                break;
            case 2:
                r.get();
                r.input();
                r.output();
                break;
            default:
            System.out.println("Invalid choice");
        }
        sc.close();
        System.out.println("This practical is made by 23CS061-Dhruvil Patel");

    }
}