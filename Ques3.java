import java.util.Scanner;
public class Ques3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius of the circle");
        float r=sc.nextInt();
        float area=3.14f*r*r;
        System.out.println("The area of the circle is "+area);
    }
}