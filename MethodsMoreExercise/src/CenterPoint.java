import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x1=Integer.parseInt(scanner.nextLine());
        int x2=Integer.parseInt(scanner.nextLine());
        int y1=Integer.parseInt(scanner.nextLine());
        int y2=Integer.parseInt(scanner.nextLine());
        int result1=pointPosition(x1,x2);
        int result2=pointPosition(y1,y2);
        if(result1<result2){
            System.out.printf("(%d, %d)",x1,x2);
        } else if (result1>result2) {
            System.out.printf("(%d, %d)",y1,y2);
        }else {
            System.out.printf("(%d, %d)",x1,x2);
        }
    }
    public static int pointPosition(int num1,int num2){
        return (int) (Math.pow(num1,2)+Math.pow(num2,2));
    }
}
