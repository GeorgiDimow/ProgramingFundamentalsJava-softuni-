import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=repeatString(scanner.nextLine(),Integer.parseInt(scanner.nextLine()));
        System.out.println(text);
    }
    public static String repeatString(String string,int times){
        String result="";
        for (int i = 0; i < times; i++) {
            result+=string;
        }
        return result;
    }
}
