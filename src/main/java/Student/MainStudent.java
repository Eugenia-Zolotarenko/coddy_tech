package Student;

public class MainStudent {
    public static void main(String[] args) {
        Student st1 = new Student("S001", "John Doe", 2023);
        System.out.println(st1.getInfo());
        st1.setName("John Smith");
        System.out.println(st1.getInfo());
        System.out.println("**********************************************************");

        Student st2 = new Student("A12345", "Alice", 2020);
        System.out.println(st2.getInfo());
        st2.setName("Alice Johnson");
        System.out.println(st2.getInfo());

        System.out.println("**********************************************************");

        Student st3 = new Student("STU-2024-001", "Bob Brown", 2024);
        System.out.println(st3.getInfo());
        st3.setName("Robert Brown");
        System.out.println(st3.getInfo());

        System.out.println("**********************************************************");

        Student st4 = new Student("X1", "Jane", 2019);
        System.out.println(st4.getInfo());
        st4.setName("Jane Doe");
        System.out.println(st4.getInfo());
    }
}
