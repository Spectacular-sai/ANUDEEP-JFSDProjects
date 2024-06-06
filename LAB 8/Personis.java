package saijavafullstackdevelopement;

public class Personis {
	String name;
    int age;

    public Personis(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println(name + " is " + age + " years old");
    }

    public class Student {
        int grade;
        Personis person;

        public Student(int grade, Personis person) {
            this.grade = grade;
            this.person = person;
        }

        public void study() {
            System.out.println(person.name + " is studying for grade " + this.grade);
        }
    }

    public static void main(String[] args) {
        Personis person = new Personis("SAIKUMAR", 23);
        Student student = person.new Student(16, person);

        person.speak();
        student.study();
    }

}
