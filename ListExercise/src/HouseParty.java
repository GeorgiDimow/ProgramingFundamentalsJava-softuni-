import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                char a=scanner.nextLine().charAt(0);
                char b=scanner.nextLine().charAt(0);
                printCharsInRange(a,b);

            }
            public static void printCharsInRange(char a,char b){
                if(a<b) {
                    for (int i = a + 1; i < b; i++) {
                        char s=(char) i;
                        System.out.print(s + " ");
                    }
                } else {
                    for (int i = b + 1; i < a; i++) {
                        char s=(char) i;
                        System.out.print(s + " ");
                    }
                }

            }
        }