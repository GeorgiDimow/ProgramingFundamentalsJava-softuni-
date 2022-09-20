import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double money=Double.parseDouble(scanner.nextLine());
        int students=Integer.parseInt(scanner.nextLine());
        double lightsabersPrice=Double.parseDouble(scanner.nextLine());
        double robePrice=Double.parseDouble(scanner.nextLine());
        double beltsPrice=Double.parseDouble(scanner.nextLine());
        double lightsaber=lightsabersPrice*Math.ceil(students*1.1);;
        double robe=students*robePrice;
        double belts=students*beltsPrice;
        int freeBelts=students/6;
        belts-=beltsPrice*freeBelts;
        double equipmentCosts=robe+belts+lightsaber;
        if(equipmentCosts<=money){
            System.out.printf("The money is enough - it would cost %.2flv.",equipmentCosts);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",equipmentCosts-money);
        }
    }
}
