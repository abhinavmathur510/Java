import java.util.Scanner;
public class Ques7{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your roll no");
        int roll=sc.nextInt();
        System.out.println("Enter marks in maths");
        int m=sc.nextInt();
        System.out.println("Enter marks in hindi");
        int h=sc.nextInt();
        System.out.println("Enter marks in english");
        int e=sc.nextInt();
        int total=m+h+e;
        int per=(m+h+e)/3;
        if(per>=60){
            System.out.println("1St Division");
        }
        else if(per>=30&&per<60){
            System.out.println("2ND Division");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println("Total is " +total);
        System.out.println("Percentage is " +per);
        
    
    }

}
