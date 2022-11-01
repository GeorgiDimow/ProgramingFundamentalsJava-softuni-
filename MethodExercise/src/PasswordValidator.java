import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        if (overLength(text)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(containsSymbols(text)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (containsDigits(text)){
            System.out.println("Password must have at least 2 digits");
        }
        if(!containsSymbols(text) && !overLength(text) && !containsDigits(text)){
            System.out.println("Password is valid");
        }
    }
    public static boolean containsSymbols(String text){
        boolean containsSymbols = false;
        for (char letter: text.toCharArray()) {
            if(!containsSymbols){
                containsSymbols=  letter<48 || (letter>57 && letter<65) || (letter>90 && letter<97) || letter>122;
            }
        }
        return containsSymbols;
    }
    public static boolean overLength(String text){
        boolean overLength=false;
        overLength=text.length()<6 || text.length()>10;
        return overLength;
    }
    public static boolean containsDigits(String text){
        boolean containsDigits=false;
        int countDigits=0;
        for (char letter: text.toCharArray()) {
            if(letter>47 && letter<58){
                countDigits++;
            }
        }
        containsDigits=countDigits<2;
        return containsDigits;
    }
}
