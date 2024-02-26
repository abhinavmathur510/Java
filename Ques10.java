import java.util.Scanner;
public class Ques10{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position");
        int p=sc.nextInt();
        int sum=0;
        int num=9;
        int i;
        for(i=1;i<=p;i++){
            sum=sum+num;
            num=num*11;
        }
        System.out.println("The sum is "+sum);

    }

}