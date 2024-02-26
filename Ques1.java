import java.util.Scanner;
public class Ques1{
    public static void main(String[]args)
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers\n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the operator");
        char s=sc.next().charAt(0);
        if(s=='+'){
            int o = a+b;
            System.out.println(o);
        }
        if(s=='-'){
            int o = a-b;
            System.out.println(o);
        }
        if(s=='*'){
            int o = a*b;
            System.out.println(o);
        }
        if(s=='/'){
            int o = a/b;
            System.out.println(o);
        }

    }
}