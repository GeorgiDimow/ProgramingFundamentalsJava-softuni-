import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int dev = 0;

        if (n % 2 == 0) {
            dev = 2;

        }
        if (n % 3 == 0) {
            dev = 3;
        }
        if (n % 6 == 0) {
            dev = 6;
        }
        if (n % 7 == 0) {
            dev = 7;
        }
        if (n % 10 == 0) {
            dev = 10;
        }
        if (dev == 0) {
            System.out.printf("Not divisible");
        } else {
            System.out.printf("The number is divisible by %d", dev);
        }
    }
}
