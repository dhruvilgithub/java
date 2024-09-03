class Reference
{
    int data;
    Reference(int data)
    {
        this.data = data;
    }
}
class Returningobjects
{
    int x,y;
    Returningobjects(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
public class pr_3_7 {
    public static void main(String[] args) {
        //Pass by Value
        int a=10;
        System.out.println("Before passing value of a: "+a);
        passbyvalue(a);
        System.out.println("After passing value of a: "+a);

        //Pass by Reference
        Reference R = new Reference(15);
        System.out.println("Before passing by reference: "+R.data);
        passbyreference(R);
        System.out.println("After passing by reference: "+R.data);

        //Returning Values
        int result = returnvalues(20,25);
        System.out.println("Result of returning values is: "+result);

        //Returning Objects
        Returningobjects RO = new Returningobjects(50, 50);
        System.out.println("Returning Objects: "+RO.x+" "+RO.y);
        System.out.println(" \nThis Practical is made by 23CS061- Dhruvil Patel ");
    }

    //Method to Show Pass by Value Case
    public static void passbyvalue(int value)
    {
        value = value + 10;
        System.out.println("Inside the method: "+value);
    }

    //Method to show Passing by Reference
    public static void passbyreference(Reference r)
    {
        r.data = r.data + 10;
        System.out.println("Inside the method: "+r.data);
    }

    //Method to show Returning Values
    public static int returnvalues(int a, int b)
    {
        return (a+b);
    }

    //Method to show Returning Objects
    public static Returningobjects createobject(int x, int y)
    {
        return new Returningobjects(x, y);
    }
}
