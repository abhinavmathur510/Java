import java.util.Scanner;
public class Ques4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println("The average of three numbers is "+avg);

    }
}