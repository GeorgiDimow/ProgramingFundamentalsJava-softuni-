import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String number=scanner.nextLine();
        int fact=1;
        int b = 0;
        int sum=0;
        for (int i = 0; i < number.length(); i++) {
            char ch;
            ch=number.charAt(i);
            b=Integer.parseInt(String.valueOf(ch));
            for (int j = 1; j <= b; j++) {
                fact=fact*j;
            }
            sum=fact+sum;
            fact=1;
        }
        int got=Integer.parseInt(number);
        if(sum==got){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
