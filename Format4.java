public class Format4{
    public static void main(String[]args){
        int i,j,sum;
        int a=1;
        int b=1;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(a + " ");
                sum=a+b;
                a=b;
                b=sum;
            }
             System.out.println();
            }
    }
}