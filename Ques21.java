import java.util.Scanner;
public class Ques21{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Array[]=new int[10];
        int flag=0;
        for(int i=0;i<=9;i++){
            System.out.printf("Enter %d elememt of Array\n",i+1);
            Array[i]=sc.nextInt();
        }
        for(int i=0;i<=9;i++){
            for(int j=i+1;j<=9;j++){
                if(Array[j]<Array[i]){
                    flag=Array[i];
                    Array[i]=Array[j];
                    Array[j]=flag;
                }
            }
        }
        int i=9;
        int j=0;
        while(i>=j){
            System.out.println(Array[i--]);
            System.out.println(Array[j++]);
        }
        
    }
}