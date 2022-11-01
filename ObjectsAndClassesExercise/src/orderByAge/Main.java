package orderByAge;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Person> personList=new ArrayList<>();
        String[] data = scanner.nextLine().split("\\s+");
        while (!data[0].equals("End")){
            Person person=new Person(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
            personList.add(person);
            data = scanner.nextLine().split("\\s+");
        }
        personList.sort(Comparator.comparing(Person::getAge));

        for (Person s:personList) {
            System.out.println(s.toString());
        }
    }
}
