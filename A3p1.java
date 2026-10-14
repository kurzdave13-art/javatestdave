import java.util.Scanner;
public class A3p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int people = Integer.parseInt(args[0]);
        Person[] personsList = new Person[people];

       for (int i = 0; i < personsList.length; i++) {
            System.out.println("Enter information for person " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = input.nextLine().trim();

            System.out.print("Gender (F/M): ");
            char gender = input.nextLine().trim().toUpperCase().charAt(0);

            System.out.print("Age: ");
            int age = Integer.parseInt(input.nextLine().trim());

            System.out.print("Singer or Dancer: ");
            char type = input.nextLine().trim().toUpperCase().charAt(0);

            if (type == 'S') {
                System.out.print("Genre: ");
                String genre = input.nextLine().trim();
                personsList[i] = new Singer(name, gender, age, genre);
            } else {
                System.out.print("Style: ");
                String style = input.nextLine().trim();
                personsList[i] = new Dancer(name, gender, age, style);
                }
                System.out.println();
            }

            System.out.println("The persons you entered are:");
            for(int i = 0; i < personsList.length; i++){
                System.out.println(personsList[i]);
            }
        }
    }

    class Person{
        protected String name;
        protected char gender;
        protected int age;

        public Person(){
            this.name = "NoName";
            this.gender = ' ';
            this.age = 0;
        }
        
        public Person(String name, char gender, int age){
            this.name = name;
            this.gender = Character.toUpperCase(gender);
            this.age = age;
        }

        public String getName(){
            return this.name;
        }
         public String getGender(){
            return (gender == 'M')? "male" : "female";
        }
         public int getAge(){
            return this.age;
        }
        public String toString(){
            return name + " is a " + getGender() + " person of  " + age + " years old.";
        }
    }

    class Singer extends Person{
        protected String genre;

        public Singer(){
            super("NoName", ' ', 0);
            this.genre = "UNDEFINED";
        }
        public Singer(String name, char gender, int age, String genre){
            super(name , gender , age);
            this.genre = genre;
        }

        public String toString(){
            return name + " is a " + getGender()+ " " + genre + " singer of " + age + " years old.";
        }
    }

    class Dancer extends Person{
        protected String style;

        public Dancer(){
            super("NoName", ' ', 0);
            this.style = "UNDEFINED";
        }
        public Dancer(String name, char gender, int age, String style){
            super(name , gender ,age);
            this.style = style;
        }

        public String toString(){
            return name + " is a " + getGender()+ " " + style + " dancer of " + age + " years old.";
        }
    }

