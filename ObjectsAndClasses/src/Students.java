import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students {
    public static class Student{
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student(String firstName, String lastName, int age, String homeTown){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }
        public String getTown() {
            return this.homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }
    }

    //Define a class Student, which holds the following information about students: first name, last name, age, and hometown.
    //Read the list of students until you receive the "end" command. After that, you will receive a city name.
    // Print only students which are from the given city, in the following format: "{firstName} {lastName} is {age} years old".

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Student> studentsList=new ArrayList<>();
        String input=scanner.nextLine();
        while (!input.equals("end")){
            String[] arrStudent=input.split("\\s+");
            String firstName = arrStudent[0];
            String lastName = arrStudent[1];
            int age = Integer.parseInt(arrStudent[2]);
            String town = arrStudent[3];

            Student currentStudent = new Student(firstName, lastName, age, town);
            studentsList.add(currentStudent);

            input=scanner.nextLine();
        }
        String homeTown = scanner.nextLine();

        for (Student item : studentsList) {
            if (item.getTown().equals(homeTown)) {
                System.out.printf("%s %s is %d years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }
}
