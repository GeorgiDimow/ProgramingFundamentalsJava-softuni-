import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        printVowel(text.toLowerCase());
    }
    public static void printVowel(String text){
        int count=0;
        for (char symbol:text.toCharArray()) {
            if(symbol=='a' ||symbol=='e'||symbol=='u'||symbol=='i'||symbol=='o'){
                count++;
            }
            System.out.println(count);
        }
    }
}
