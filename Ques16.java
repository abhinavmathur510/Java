import java.util.Scanner;
public class Ques16{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Array[]=new int[5];
        int count=0;
        for(int i=0;i<=4;i++){
            System.out.printf("Enter %d Element\n\n",i);
            Array[i]=sc.nextInt();
        }
        System.out.println("Enter the number which you want to find???");
        int num=sc.nextInt();
        for(int i=0;i<=4;i++){
            if(Array[i]==num){
                System.out.printf("%d exists on %d position\n",num,i);
                count++;
            }
        }
        if(count==0){
            System.out.printf("%d Does not exists\n",num);
        }

    }
}