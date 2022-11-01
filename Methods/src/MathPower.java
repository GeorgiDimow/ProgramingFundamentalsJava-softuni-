import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num=Double.parseDouble(scanner.nextLine());
        int power=Integer.parseInt(scanner.nextLine());
        System.out.printf(new DecimalFormat("0.####").format(powerNum(num,power)));
    }
    public static double powerNum(double num,int pow){
        double newNumber=1;
        for (int i = 0; i < pow; i++) {
            newNumber*=num;
        }
        return newNumber;
    }
}
