import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());
        sing(num1,num2,num3);
    }
    public static void sing(int num1,int num2,int num3){
        int countNegatives=0;
        if(num1<0){
            countNegatives++;
        } if (num2<0) {
            countNegatives++;
        } if (num3<0) {
            countNegatives++;
        }
        if (num1==0 || num2==0 || num3==0) {
            System.out.println("zero");
        }else if(countNegatives%2==0){
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
