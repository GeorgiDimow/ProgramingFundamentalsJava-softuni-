import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long num1=Integer.parseInt(scanner.nextLine());
        long num2=Integer.parseInt(scanner.nextLine());
        double result=(double) fact(num1)/fact(num2);
        System.out.printf("%.2f",result);
    }
    public static long fact(long num){
        long fact=1;
        for (int i = 1; i <= num; i++) {
            fact*=i;
        }
        return fact;
    }
}
