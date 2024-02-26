import java.util.Scanner;
public class Ques2{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        System.out.println("The arthemetic operations on the given numbers are");
        System.out.println("sum is" +sum);
        System.out.println("Sub is"+sub);
        System.out.println("Multiplication is"+ mul);
        System.out.println("Diviion is"+div);

    }
}