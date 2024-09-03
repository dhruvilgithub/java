import java.util.*;

public class pr_3_2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Trianglearea tr = new Trianglearea();
        Trianglearea tr1 = new Trianglearea(4);
        Trianglearea tr2 = new  Trianglearea( 6,4);        
        
        scan.close();
        System.out.println(" \nThis Practical is made by 23CS061- Dhruvil Patel ");

    }
}
class Trianglearea {

    int n;
    Trianglearea()
    {
        n=0;
        System.out.println(n);
    }
    Trianglearea(double r)
    {
        System.out.println("Circule Area is : "+3.14*r*r);
    }
    Trianglearea(double h, double t)
    {
        System.out.println("Triangl Area is : "+h*t*(0.5));
    }

};
