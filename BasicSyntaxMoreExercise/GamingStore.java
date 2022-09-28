import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        double money=Double.parseDouble(String.valueOf(input));
        double money1=money;
        input=scanner.nextLine();
        while (!input.equals("Game Time")){

            switch (input){
                case "OutFall 4":
                    if(money>=39.99){
                        System.out.println("Bought OutFall 4");
                        money-=39.99;
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if(money>=15.99){
                        System.out.println("Bought CS: OG");
                        money-=15.99;
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if(money>=19.99){
                        System.out.println("Bought Zplinter Zell");
                        money-=19.99;
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if(money>=59.99){
                        System.out.println("Bought Honored 2");
                        money-=59.99;
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if(money>=29.99){
                        System.out.println("Bought RoverWatch");
                        money-=29.99;
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if(money>=39.99){
                        System.out.println("Bought RoverWatch Origins Edition");
                        money-=39.99;
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }

            if (money <= 0) {
                break;
            }
            input=scanner.nextLine();
        }
        if (money <= 0) {
            System.out.println("Out of money!");
        }else {

            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",money1-money,money );
        }
    }
}
