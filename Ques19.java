import java.util.Scanner;
public class Ques19{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Array[]=new int[10];
        int flag=0;
        for(int i=0;i<=9;i++){
            System.out.printf("Enter %d element\n",i+1);
            Array[i]=sc.nextInt();
        }
        for(int i=0;i<=9;i++){
            flag=0;
            for(int j=i+1;j<=9;j++){
                if(Array[j]>Array[i]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(Array[i]);
            }
        }
    }
}