import java.util.Scanner;
public class MenuDrivenProgram {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu List");
        System.out.println(".................");
        System.out.println("1.ADD\n2.SUB\n3.MUL\n4.DIV");
        System.out.println("Enter the Two Number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter option in words");
        String option =sc.nextLine();
        switch(option)
        {
            case "ADD" :System.out.println("Sum is "+(a+b));
            break;
            case "SUB":System.out.println("Difference is "+(a-b));
            break;
            case "MUL": System.out.println("Product is "+(a*b));
            break;
            case "DIV":System.out.println("Ration is " +(a/b));
            break;
            default:System.out.println("INVALID OPTION");
            break;
        }
    }
    
}
