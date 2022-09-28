import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int i=Integer.parseInt(scanner.nextLine());
        if(i>10){
            int p=n*i;
            System.out.printf("%d X %d = %d%n",n,i,p);
        }else {
        for ( int j =i; j <= 10; j++) {
            int k=n*j;
            System.out.printf("%d X %d = %d%n",n,j,k);
            }
        }
    }
}
