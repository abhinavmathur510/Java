import java.util.Scanner;
public class Ques6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in maths");
        int m=sc.nextInt();
        System.out.println("Enter marks in physics");
        int p=sc.nextInt();
        System.out.println("Enter marks in chemistry");
        int c=sc.nextInt();
        int total=m+p+c;
        int total1=m+p;
        if(m>=65&&p>=55&&c>=50&&total>=190&&total1>=140){
            System.out.println("THe student is eligible");
        }
        else{
            System.out.println("Student is not eligible");
        }
    }

}