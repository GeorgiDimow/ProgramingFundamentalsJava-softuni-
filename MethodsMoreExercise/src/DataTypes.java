import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String command=scanner.nextLine();
        switch (command){
            case "int":
                int num=Integer.parseInt(scanner.nextLine());
                System.out.println(result(num));
                break;
            case "string":
                String text=scanner.nextLine();
                System.out.println(result(text));
                break;
            case "real":
                double realNum=Double.parseDouble(scanner.nextLine());
                System.out.printf("%.2f",result(realNum));
                break;
        }
    }
    public static int result(int num){
        return num*2;
    }
    public static double result(double num) {
        return num * 1.5;
    }
    public static String result(String text) {
        return "$"+text+"$";
    }
}
