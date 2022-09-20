import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int lostGames=Integer.parseInt(scanner.nextLine());
        double headsetPrice=Double.parseDouble(scanner.nextLine());
        double mousePrice=Double.parseDouble(scanner.nextLine());
        double keyboardPrice=Double.parseDouble(scanner.nextLine());
        double displayPrice=Double.parseDouble(scanner.nextLine());
        double totalPrice=0;
        int headsetCount=lostGames/2;
        int mouseCount=lostGames/3;
        int keyboardCount=lostGames/6;
        int displayCount=lostGames/12;
        totalPrice+=headsetPrice*headsetCount;
        totalPrice+=mousePrice*mouseCount;
        totalPrice+=keyboardPrice*keyboardCount;
        totalPrice+=displayPrice*displayCount;

        System.out.printf("Rage expenses: %.2f lv.",totalPrice);
    }
}
