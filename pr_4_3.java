
import java.util.*; 
public class pr_4_3 {
    public static void main(String[] args) {
        Rectengle[] r= new Rectengle[3];
        square[] s = new square[3];
        for(int i=0;i<3;i++)
        {
            r[i]=new Rectengle(2,3);
            s[i]=new square(10);
        }
         
      }
    
}
class Rectengle {
    Scanner scan = new Scanner(System.in);

    protected int length,breadth;
    public Rectengle(int length,int breadth)
    {   
        this.breadth=breadth;
        this.length=length;
        area();
        perimeter();
    }
    public void area ()
        {
            System.out.println("Area of Rectenhle :"+(length*breadth));
        }
        public void perimeter ()
        {
            System.out.println("Perimeter of Rectenhle  :"+(2*(length+breadth)));
        }  
        

    
}
class square extends Rectengle{
    Scanner scan = new Scanner(System.in);
    public square (int side)
    {
        super(side,side);
    }
    
}