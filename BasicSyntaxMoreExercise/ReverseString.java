import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String stringRev = "";
        for (int position = string.length() - 1; position >= 0; position--) {
            char currentSymbol = string.charAt(position);
            stringRev += currentSymbol;
        }
        System.out.println(stringRev);
    }
}
