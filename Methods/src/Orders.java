import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        //•	coffee – 1.50
        //•	water – 1.00
        //•	coke – 1.40
        //•	snacks – 2.00
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int quantity=Integer.parseInt(scanner.nextLine());
        productPrice(name,quantity);
    }
    public static void productPrice(String name,int quantity){
        switch (name){
            case "coffee":
                System.out.printf("%.2f",quantity*1.5);
                break;
            case "water":
                System.out.printf("%.2f",quantity*1.0);
                break;
            case "coke":
                System.out.printf("%.2f",quantity*1.4);
                break;
            case "snacks":
                System.out.printf("%.2f",quantity*2.0);
                break;

        }
    }
}
