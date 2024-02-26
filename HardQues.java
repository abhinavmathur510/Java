import java.util.Scanner;
class HardQues{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the 2D Array:");
        int size=sc.nextInt();
        int value=1;
        int sum=0;
        int last=0;
        int Array[][]=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                Array[i][j]=value;
                value++;
            }
        }
        for(int k=0;k<size/2;k++){
            for(int m=0;k<size/2;k++){
                if(sum>last){
                    last=sum;
                }
                sum=0;
                for(int i=k;i<(size/2)+k;i++){
                    for(int j=m;m<(size/2)+m;j++){
                        sum=sum+Array[i][j];
                        
                    }
                }
            }
        }
        System.out.printf("The maximum sum is %d\n",last);
    }
}