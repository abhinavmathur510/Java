public class Format2{
    public static void main(String[]args){
        int i,j,k;
        for (i=1;i<=5;i++){
            for(j=5-i;j>0;j--){
                System.out.print(' ');
            }
            for(k=2*i-1; k>0 ; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}