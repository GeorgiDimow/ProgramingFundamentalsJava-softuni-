import java.util.Scanner;

public class AddSubtract {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());
        System.out.println(Result(SumOfFirstTwoNum(num1,num2),num3));
    }
    public static int SumOfFirstTwoNum(int a,int b){
        return a+b;
    }
    public static int Result(int a,int b){
        return a-b;
    }
}
