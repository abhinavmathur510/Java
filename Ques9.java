import java.util.Scanner;
public class Ques9{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number;");
        int a= sc.nextInt();
        int i=0;
        for(i=1;i<=10;i++){
            System.out.println(a+"x"+i+"="+a*i);
        }
          
   }
}