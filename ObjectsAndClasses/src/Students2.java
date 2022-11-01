import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
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

        public void setTown(String town) {
            this.homeTown = town;
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

        public void setAge(int age) {
            this.age = age;
        }

    }
    private static boolean isExisting(List<Student> students, String firstName, String lastName){
        for (Student student:students) {
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
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

            Student student = new Student(firstName, lastName, age, town);

            int existingIndex = findStudentsIndex(studentsList, student.getFirstName(), student.getLastName());
            if (existingIndex != -1) {
                studentsList.get(existingIndex).setAge(student.getAge());
                studentsList.get(existingIndex).setTown(student.getTown());
            } else {
                studentsList.add(student);
            }

            input=scanner.nextLine();
        }
        String homeTown = scanner.nextLine();

        for (Student item : studentsList) {
            if (item.getTown().equals(homeTown)) {
                System.out.printf("%s %s is %d years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }
    static public int findStudentsIndex(List<Student> studentsList, String firstName, String  lastName) {
        for (int i = 0; i < studentsList.size(); i++) {
            String firstNameList = studentsList.get(i).getFirstName();
            String lastNameList = studentsList.get(i).getLastName();

            if (firstNameList.equals(firstName) && lastNameList.equals(lastName)) {
                return i;
            }
        }

        return -1;
    }
}
