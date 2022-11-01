import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a=scanner.nextLine().charAt(0);
        char b=scanner.nextLine().charAt(0);
        printCharsInRange(a,b);

    }
    public static void printCharsInRange(char a,char b){
        if(a<b) {
            for (int i = a + 1; i < b; i++) {
                String s = Character.toString(i);
                System.out.print(s + " ");
            }
        } else {
            for (int i = b + 1; i < a; i++) {
                String s = Character.toString(i);
                System.out.print(s + " ");
            }
        }
    }
}
