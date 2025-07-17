class Student {
    int id;
    String name;

    public Student(int a, String b) {
        id = a;
        name = b;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        // Student s[] = new Student[2];
        // s[0] = new Student(154, "Swasata");
        // s[1] = new Student(189, "Arun");

        Student s[]={
            new Student(154, "Swasata"),
            new Student(185, "Arun")
        };

        for (Student student : s) {
            student.display();
        }

        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }
    }
}
