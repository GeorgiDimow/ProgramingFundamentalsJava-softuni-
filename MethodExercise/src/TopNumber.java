import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            if(isTopNumber(i) && containsOddNumber(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isTopNumber(int n){
        int sumDigits=0;
        while (n!=0){
            int digit=n%10;
            sumDigits+=digit;
                n/=10;
        }
        return sumDigits%8==0;
    }
    public static boolean containsOddNumber(int n){
        while (n!=0){
            int digit=n%10;
            if(digit%2!=0){
                return true;
            }else {
                n/=10;
            }
        }
        return false;
    }
}
