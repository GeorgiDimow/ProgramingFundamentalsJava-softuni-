import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine(), nstr="";
        char ch;
        int count=1;
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;


        }
        String newStr=scanner.nextLine();
        while (!newStr.equals(nstr) && count<4){
            System.out.println("Incorrect password. Try again.");
            newStr=scanner.nextLine();
            count++;
        }
        if(count==4){
            System.out.printf("User %s blocked!",str);
        }else {
            System.out.printf("User %s logged in.", str);
        }
    }
}
