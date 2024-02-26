import java.util.Scanner;
public class Ques15{
    public static void main(String[]args){
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter Elements of First Array");
        for(int i=0;i<=4;i++){
            System.out.printf("Enter %d element\n",i);
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter Elements of Second Array");
        for(int i=0;i<=4;i++){
            System.out.printf("Enter %d element\n",i);
            arr2[i]=sc.nextInt();
        }

        for(int i=0;i<=4;i++){
            for(int j=0;j<=4;j++){
                if(arr1[i]==arr2[j]){
                    count++;
                    System.out.printf("The %d element of Array1 and %d element of Array2 are same\n",i,j);
                }
            
            }
        }
        if(count==0){
            System.out.println("NONE Element of both the Arrays is same");
        }
    }
}