import java.util.Scanner;

public class pr5 {
    public static void main(String arg[]) {
        int[] code = { 1, 2, 3, 4, 5 };
        double[] tax = { 8, 12, 5, 7.5, 3 };
        String[] name = { "Motor", "Fan", "Tube Light", "Wires", "Other" };
        int[] price = {1500,500,150,100,80};

        for (int i = 0; i < 5; i++) {
            System.out.println(" For buying " + name[i] + " code is : " + code[i]);
        }
        System.out.println("Enter your choise : ");
        Scanner scn = new Scanner(System.in);
        int choise = scn.nextInt();
        System.out.println("-------BILL-------");

        switch (choise) {
            case 1:
                System.out.println("Motor price :"+(price[choise-1]*(tax[choise-1]+100))/100);
                break;
            case 2:
            System.out.println("Fan price :"+(price[choise-1]*(tax[choise-1]+100))/100);
                break;
            case 3:
            System.out.println("Tube Ligth price :"+(price[choise-1]*(tax[choise-1]+100))/100);
                break;
            case 4:
            System.out.println("Wires price :"+(price[choise-1]*(tax[choise-1]+100))/100);
                break;
            case 5:
            System.out.println("Other price :"+(price[choise-1]*(tax[choise-1]+100))/100);
                break;

            default:
            System.err.println("Invalide choise .");
                break;
        }
    }

}
