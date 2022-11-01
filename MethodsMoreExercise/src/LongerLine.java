import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x1Rectangle1 =Integer.parseInt(scanner.nextLine());
        int y1Rectangle1 =Integer.parseInt(scanner.nextLine());
        int x2Rectangle1 =Integer.parseInt(scanner.nextLine());
        int y2Rectangle1 =Integer.parseInt(scanner.nextLine());
        int x1Rectangle2 =Integer.parseInt(scanner.nextLine());
        int y1Rectangle2 =Integer.parseInt(scanner.nextLine());
        int x2Rectangle2 =Integer.parseInt(scanner.nextLine());
        int y2Rectangle2 =Integer.parseInt(scanner.nextLine());
        int result1=result(x1Rectangle1, y1Rectangle1, x2Rectangle1, y2Rectangle1);
        int result2=result(x1Rectangle2, y1Rectangle2, x2Rectangle2, y2Rectangle2);
        if(result1>result2){
            if(pointPosition(x1Rectangle1,y1Rectangle1)<pointPosition(x2Rectangle1,y2Rectangle1)){
                System.out.printf("(%d, %d)(%d, %d)", x1Rectangle1, y1Rectangle1, x2Rectangle1, y2Rectangle1);
            }else{
                System.out.printf("(%d, %d)(%d, %d)", x2Rectangle1, y2Rectangle1, x1Rectangle1, y1Rectangle1);
            }

        } else if (result1<result2) {
            if(pointPosition(x1Rectangle2,y1Rectangle2)<pointPosition(x2Rectangle2,y2Rectangle2)){
                System.out.printf("(%d, %d)(%d, %d)",x1Rectangle2, y1Rectangle2, x2Rectangle2, y2Rectangle2);
            }else{
                System.out.printf("(%d, %d)(%d, %d)", x2Rectangle2, y2Rectangle2, x1Rectangle2, y1Rectangle2);
            }

        }else {
            if(pointPosition(x1Rectangle1,y1Rectangle1)<pointPosition(x2Rectangle1,y2Rectangle1)){
                System.out.printf("(%d, %d)(%d, %d)",x1Rectangle1, y1Rectangle1, x2Rectangle1, y2Rectangle1);
            }else{
                System.out.printf("(%d, %d)(%d, %d)", x2Rectangle1, y2Rectangle1, x1Rectangle1, y1Rectangle1);
            }
        }
    }

    public static int result(int x1,int y1,int x2,int y2) {
        int wight1=0;
        int height1=0;
        if (y1 <0 && y2>=0) {
            height1=Math.abs(y1)+Math.abs(y2);
        }else if (y2 <0 && y1>=0) {
            height1=Math.abs(y1)+Math.abs(y2);
        } else if (Math.abs(y1)>Math.abs(y2)) {
            height1=Math.abs(y1)-Math.abs(y2);
        }else if(Math.abs(y1)<Math.abs(y2)){
            height1=Math.abs(y2)-Math.abs(y1);
        }
        if (x1 <0 && x2>=0) {
            wight1=Math.abs(x1)+Math.abs(x2);
        } else if (x2<0 && x1>=0) {
            wight1=Math.abs(x1)+Math.abs(x2);
        } else if (Math.abs(x1)>Math.abs(x2)) {
            wight1=Math.abs(x1)-Math.abs(x2);
        } else if (Math.abs(x1)<Math.abs(x2)) {
            wight1=Math.abs(x2)-Math.abs(x1);
        }

        return pointPosition(Math.abs(height1),Math.abs(wight1));
    }
    public static int pointPosition(int num1,int num2){
        return (int) (Math.pow(num1,2)+Math.pow(num2,2));
    }
}
