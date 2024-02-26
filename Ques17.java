import java.util.Scanner;
public class Ques17{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Array[]=new int[5];
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        int sum=0;
        System.out.println("Enter elements of the Array");
        for (int i=0;i<=4;i++){
            System.out.printf("Enter %d Element\n",i+1);
            Array[i]=sc.nextInt();
            if(Array[i]>max){
                max=Array[i];
            }
            if(Array[i]<min){
                min=Array[i];
            }
            sum=sum+Array[i];
            
        }
        int sub=max+min;
        int avr=(sum-sub)/3;
        System.out.printf("The maximum is %d and the minimum is %d\n",max,min);
        System.out.printf("The average of the Array is %d\n",avr);
        

    }
}