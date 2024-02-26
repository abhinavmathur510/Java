import java.util.Scanner;
public class Hello{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        System.out.println(sum);

    }
}
