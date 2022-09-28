import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char line1 = scanner.next().charAt(0);
        String text= String.valueOf(line1);
        char line2 = scanner.next().charAt(0);
        text+= String.valueOf(line2);
        char line3 = scanner.next().charAt(0);
        text+= String.valueOf(line3);
        System.out.println(text);
    }
}
