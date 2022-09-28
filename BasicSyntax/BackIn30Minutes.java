import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hours=Integer.parseInt(scanner.nextLine());
        int mins=Integer.parseInt(scanner.nextLine());
        int time= hours*60+mins +30;
        int hoursOut= time/60;
        int minsOut= time%60;

        if(hoursOut==24){
            System.out.printf("0:%02d",minsOut);
        }else {
            System.out.printf("%d:%02d",hoursOut,minsOut);
        }
    }
}
