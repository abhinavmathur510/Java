import java.util.Scanner;
public class Ques18{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Arr[]=new int[10];
        int count=0;
        for(int i=0;i<=9;i++){
            System.out.printf("Enter %d Element of the Arrar\n",i+1);
            Arr[i]=sc.nextInt();
        }
        for(int l=0;l<=9;l++){
            for (int j=l+1;j<=9;j++){
                if(Arr[l]==Arr[j]){
                    Arr[j]=-1;
                }
            }
        }
        for(int i=0;i<=9;i++){
            if(Arr[i]!=-1){
               count++;
            }
        }
            System.out.printf("The length of the Array afte rremoving dupliates is %d\n",count);
    }
}