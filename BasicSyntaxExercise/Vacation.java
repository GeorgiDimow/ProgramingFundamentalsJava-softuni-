import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     int numberOfPeople=Integer.parseInt(scanner.nextLine());
     String type=scanner.nextLine();
     String day= scanner.nextLine();
     double prise=0;
     switch (type){
         case "Students":
             switch (day){
                 case "Friday":
                    prise=8.45*numberOfPeople;
                    if(numberOfPeople>=30){
                        prise=prise*0.85;
                    }
                     break;
                 case "Saturday":
                     prise=9.80*numberOfPeople;
                     if(numberOfPeople>=30){
                         prise=prise*0.85;
                     }
                     break;
                 case "Sunday":
                     prise=10.46*numberOfPeople;
                     if(numberOfPeople>=30){
                         prise=prise*0.85;
                     }
                     break;
             }
             break;

         case "Business":
             switch (day){
                 case "Friday":
                     prise=10.90*numberOfPeople;
                     if(numberOfPeople>=100){
                         prise=prise-10.90*10;
                     }
                     break;
                 case "Saturday":
                     prise=15.60*numberOfPeople;
                     if(numberOfPeople>=100){
                         prise=prise-15.60*10;
                     }
                     break;
                 case "Sunday":
                     prise=16*numberOfPeople;
                     if(numberOfPeople>=100){
                         prise=prise-16*10;
                     }
                     break;
             }
             break;

         case "Regular":
             switch (day){
                 case "Friday":
                     prise=15*numberOfPeople;
                     if(numberOfPeople>=10 && numberOfPeople<=20){
                         prise=prise*0.95;
                     }
                     break;
                 case "Saturday":
                     prise=20*numberOfPeople;
                     if(numberOfPeople>=10 && numberOfPeople<=20){
                         prise=prise*0.95;
                     }
                     break;
                 case "Sunday":
                     prise=22.50*numberOfPeople;
                     if(numberOfPeople>=10 && numberOfPeople<=20){
                         prise=prise*0.95;
                     }
                              break;
             }
             break;
     }
        System.out.printf("Total price: %.2f",prise);
    }
}
