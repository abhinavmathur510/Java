import java.util.Scanner;
public class Ques5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=b*b-4*a*c;
        System.out.println("The result of the equation is "+d);

    }
}