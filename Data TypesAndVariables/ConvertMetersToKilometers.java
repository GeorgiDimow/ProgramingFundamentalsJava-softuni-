import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int km=Integer.parseInt(scanner.nextLine());
        double meters=(double) km/1000;
        System.out.printf("%.2f",meters);
    }
}
