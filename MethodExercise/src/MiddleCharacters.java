import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        System.out.println(CharactersInTheMiddle(text));
    }
    public static String CharactersInTheMiddle(String text){
        if(text.length()%2==0){
            String letter= String.valueOf(text.charAt(text.length()/2-1));
            letter+=String.valueOf(text.charAt(text.length()/2));
            return letter;
        }else {
            String letter= String.valueOf(text.charAt(text.length()/2));
            return letter;
        }

    }
}
