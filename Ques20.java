import java.util.Scanner;
public class Ques20{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Array[]=new int[10];
        int a=0;
        int b=0;
        int sum=0;
        int closest=Integer.MAX_VALUE;
        for(int i=0;i<=9;i++){
            System.out.printf("Enter %d element\n",i+1);
            Array[i]=sc.nextInt();
        }
        for(int i=0;i<=9;i++){
            for(int j=i+1;j<=9;j++){
                sum=Array[i]+Array[j];
                if(sum<closest){
                    closest=sum;
                    a=Array[i];
                    b=Array[j];
                }
            }
        }
        System.out.printf("The sum of %d and %d which is %d is closest to 0",a,b,closest);
        
    }
}