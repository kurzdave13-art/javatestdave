import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numStudents = Integer.parseInt(args[0]);

        Course[] masterCourses = new Course[10];
        int masterCoursesCount = 0;

        for(int i = 1; i <= numStudents; i++){
            System.out.println("Enter information for student " + i + ":");

            System.out.print("name: ");
            String studentName = input.nextLine();
            
            System.out.print("id: ");
            int studentId = input.nextInt();
            input.nextLine();

            System.out.print("number of courses: ");
            int numCourses = input.nextInt();
            input.nextLine();

            Student students = new Student(studentName, studentId, 0);

            for(int j = 1; j <= numCourses; j++){
                System.out.print("course " + j + ": ");
                String courseName = input.nextLine();

                Course course = null;
                for(int k = 0; k < masterCoursesCount; k++){
                    if(masterCourses[k].getName().equalsIgnoreCase(courseName)){
                        course = masterCourses[k];
                        break;
                    }
                }
                if(course == null){
                    course = new Course(courseName, 0);
                    masterCourses[masterCoursesCount++] = course;
                }
                students.addCourse(course);
                course.addStudent(students);
            }
        }
        System.out.println("The input courses are:");
        for(int i = 0; i < masterCoursesCount; i++){
            Course currentCourse = masterCourses[i];
            System.out.println(currentCourse.toString() + " They are:");

            Student[] currentStudents = currentCourse.getStudents();
            for(int j = 0; j < currentCourse.getNumStudents(); j++){
                System.out.println(currentStudents[j].toString());
            }
            System.out.println();
        }
    }
}
class Course{
    private String name;
    private Student[] students;
    private int no_of_students;

    public Course() {
        this.name = "NoName";
        this.no_of_students = 0;
        this.students = new Student[30];
    }

    public Course(String newName, int new_no_of_students) {
        this.name = newName;
        this.no_of_students = 0;
        this.students = new Student[30];
    }

    public String getName(){
        return this.name;
    }
    public int getNumStudents(){
        return this.no_of_students;
    }
    public Student[] getStudents(){
        return this.students;
    }
    public void addStudent(Student s){
        if(s == null) return;

        for(int i = 0; i < no_of_students; i++){
            if(students[i] != null && students[i].getId() == s.getId()){
                return;
            }
        }

        if(no_of_students < 30){
            students[no_of_students] = s;
            no_of_students++;
        }
    }

    public String toString(){
        return "Course " + name + " has " + no_of_students + " students.";
    }
}
class Student{
    private String name;
    private int id;
    private Course[] courses;
    private int no_of_courses;

    public Student() {
        this.name = "NoName";
        this.id = 1000;
        this.no_of_courses = 0;
        this.courses = new Course[5];
    }

    public Student(String newName, int newId, int new_no_of_courses) {
        this.name = newName;
        this.id = newId;
        this.no_of_courses = 0;
        this.courses = new Course[5];
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public int getNumCourses(){
        return this.no_of_courses;
    }
    public Course[] getCourses(){
        return courses;
    }
    public void addCourse(Course c){
        if(c == null)return;

        for(int i = 0; i < no_of_courses; i++){
            if(courses[i] == null && courses[i].getName().equalsIgnoreCase(c.getName())){
                return;
            }
        }

        if(no_of_courses < 5){
            courses[no_of_courses] = c;
            no_of_courses++;
        }
    }

    public String toString() {
        return name + " with id " + id + " (enrolled in " + no_of_courses + " courses).";
    }
}

