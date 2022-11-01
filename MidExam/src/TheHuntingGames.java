import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int days=Integer.parseInt(scanner.nextLine());
        int numberOfPeople=Integer.parseInt(scanner.nextLine());
        double groupEnergy=Double.parseDouble(scanner.nextLine());
        double waterPerOne=Double.parseDouble(scanner.nextLine());
        double foodPerOne=Double.parseDouble(scanner.nextLine());
        double currentEnergy=groupEnergy;
        double currentWater=waterPerOne*numberOfPeople*days;
        double currentFood=foodPerOne*numberOfPeople*days;
        for (int i = 1; i <= days; i++) {
            double energyLoss=Double.parseDouble(scanner.nextLine());
            currentEnergy-=energyLoss;
            if (currentEnergy <= 0) {
                break;
            }
            if(i%2==0){
                currentEnergy+=currentEnergy*0.05;
                currentWater-=currentWater*0.3;
            }
            if(i%3==0){
                currentEnergy+=currentEnergy*0.1;
                currentFood-=currentFood/numberOfPeople;
            }
        }
        if(currentEnergy>0){
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!",currentEnergy);
        }else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.",currentFood,currentWater);
        }
    }
}
