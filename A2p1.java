// import scanner
import java.util.Scanner;
public class A2p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numStudents = Integer.parseInt(args[0]);
        Student[] studentList = new Student[numStudents];

        for(int i = 0; i < studentList.length; i++){
            System.out.println("Enter information for student " + (i + 1) + ":");

            System.out.print("Name: ");
            String studentName = input.nextLine();

            System.out.print("Gender (F/M): ");
            String stringGender = input.nextLine();
            char studentGender = stringGender.length() > 0 ? stringGender.charAt(0) : ' ';

            System.out.print("Age: ");
            int studentAge = input.nextInt();
            input.nextLine();

            System.out.println();

            studentList[i] = new Student(studentName, studentGender, studentAge);
        }
        System.out.println("The students you entered are:");
        for(int i = 0; i < studentList.length; i++){
            Student student = studentList[i];
            if(student.isMale()){
                System.out.println(student.getName() + " is a male student of age " + student.getAge() + ".");
            }
            if(student.isFemale()){
                System.out.println(student.getName() + " is a female student of age " + student.getAge() + ".");
            }
        }
        System.out.println();
        int oldestMaleAge = Integer.MIN_VALUE;
        for(int i = 0; i < studentList.length; i++){
            Student student = studentList[i];
            if(student.isMale() && student.getAge() > oldestMaleAge){
                oldestMaleAge = student.getAge();
            }
        }
        System.out.println("The oldest male students are:");
        for(int i = 0; i < studentList.length; i++){
            Student student = studentList[i];
            if(student.isMale() && student.getAge() == oldestMaleAge){
                System.out.println(student.getName() + " (age " + student.getAge() + ").");
            }
        }

        System.out.println();

        int youngestFemaleAge = Integer.MAX_VALUE;
        for(int i = 0; i < studentList.length; i++){
            Student student = studentList[i];
            if(student.isFemale() && student.getAge() < youngestFemaleAge){
                youngestFemaleAge = student.getAge();
            }
        }
        System.out.println("The youngest female students are:");
        for(int i = 0; i < studentList.length; i++){
            Student student = studentList[i];
            if(student.isFemale() && student.getAge() == youngestFemaleAge){
                System.out.println(student.getName() + " (age " + student.getAge() + ").");
            }
        }
    }
}
class Student{
    private String name;
    private char gender;  // 'M' or 'F'
    private int age;

    public Student(String newName, char newGender, int newAge){
        this.name = newName;
        this.gender = newGender;
        this.age = newAge;
    }
    public String getName(){
        return this.name;
    }
    public char getGender(){
        return this.gender;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isMale(){
        return gender == 'M' || gender == 'm';
    }
    public boolean isFemale(){
        return gender == 'F' || gender == 'f';
    }
}
