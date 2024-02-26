import java.util.Scanner;
public class Ques11{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int i;
        int sum=0;
        for(i=100;i<=200;i++){
            if(i%9==0){
                System.out.println(i);
                sum=sum+i;
            }

        }
        System.out.println("The sum is "+sum);
    }
}