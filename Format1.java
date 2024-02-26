public class Format1{
    public static void main(String[]args){
        int i,j,k;
        for(i=1;i<=10;i=i+2){
            for(j=10;j>=i-1;j=j-2){
                System.out.print(' ');
            }
            for(k=1;k<=i;k++){
                System.out.print('*');
            }
            System.out.println();
            
        }
    }
}