import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        while(!input.equals("END")){
            System.out.println(palindrome(input));
            input=scanner.nextLine();
        }
    }
    public static boolean palindrome(String number){
        int length=number.length()-1;
        int isMatching=0;
        for (int i=0;i<number.length()/2;i++) {
            char digit=number.charAt(i);
            if(digit==number.charAt(length)){
                isMatching++;
                length--;
            }else {
                length--;
            }
        }
        return isMatching==number.length()/2;
    }
}
