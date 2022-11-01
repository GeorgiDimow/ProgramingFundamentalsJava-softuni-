package opinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<Person1> people= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String data=scanner.nextLine();
            String name=data.split(" ")[0];
            int age=Integer.parseInt(data.split(" ")[1]);
            if(age>30){
                Person1 person=new Person1();
                people.add(person);
            }
        }
        for (Person1 personOut: people) {
            System.out.printf("%s - %d%n");
        }
    }
}
