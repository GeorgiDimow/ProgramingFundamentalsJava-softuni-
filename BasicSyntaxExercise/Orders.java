import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        double sum=0;
        double sumTotal=0;
        for (int i = 0; i < n; i++) {
            double capsulePrice=Double.parseDouble(scanner.nextLine());
            int days=Integer.parseInt(scanner.nextLine());
            double capsuleCount=Double.parseDouble(scanner.nextLine());
            sum=capsuleCount*days*capsulePrice;
            sumTotal+=sum;
            System.out.printf("The price for the coffee is: $%.2f%n",sum);
        }
        System.out.printf("Total: $%.2f",sumTotal);
    }
}
