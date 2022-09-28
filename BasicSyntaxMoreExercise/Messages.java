import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String sms="";
        for (int i = 1; i <=n ; i++) {
            String input=scanner.nextLine();
            int number=Integer.parseInt(String.valueOf(input));
            if(number==0){
                sms+=" ";
            }else {
                int numberOfDigits = input.length();
                int mainDigit = number % 10;
                int offset = 0;
                if (mainDigit == 8 || mainDigit == 9) {
                    offset = (mainDigit - 2) * 3 + 1;
                } else {
                    offset = (mainDigit - 2) * 3;
                }
                int letterIndex = offset + numberOfDigits - 1;
                char letter = (char) (97 + letterIndex);
                sms += letter;
            }
        }
        System.out.println(sms);
    }
}
