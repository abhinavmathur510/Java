import java.util.Scanner;
public class Ques26{
        static boolean isTri(int num){
            if(num<=0){
                return false;
            }
            int i=1;
            int sum=0;
            while(sum<num){
                sum=sum+i;
                i++;
            }
            if(sum==num){
                return true;
            }
            else{
                return false;
            }
            
        }


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to cheak weather it is a triangular number or not:");
        int num=sc.nextInt();
        boolean a=isTri(num);
        System.out.println(a);
    }
}