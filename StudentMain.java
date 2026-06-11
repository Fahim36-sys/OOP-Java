public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "A");
        Student student2 = new Student("Bob", 22, "B");
        Student student3 = new Student("Charlie", 19, "A");

        System.out.println("Student 1: " + student1.getName() + ", Age: " + student1.getAge() + ", Grade: " + student1.getGrade());
        System.out.println("Student 2: " + student2.getName() + ", Age: " + student2.getAge() + ", Grade: " + student2.getGrade());
        System.out.println("Student 3: " + student3.getName() + ", Age: " + student3.getAge() + ", Grade: " + student3.getGrade());
    }
}
