import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BigInteger fistNum=new BigInteger(scanner.nextLine());
        BigInteger secondNum=new BigInteger(scanner.nextLine());
        BigInteger sum=fistNum.add(secondNum);
        System.out.println(sum);
    }
}
