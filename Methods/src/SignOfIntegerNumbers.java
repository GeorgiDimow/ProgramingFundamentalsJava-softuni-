import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        printNumbersSign(num);
    }
    public static  void printNumbersSign(int num){
        if (num==0){
            System.out.printf("The number %d is zero.",num);
        }else if(num>0){
            System.out.printf("The number %d is positive.",num);
        }else {
            System.out.printf("The number %d is negative.",num);
        }

    }
}
