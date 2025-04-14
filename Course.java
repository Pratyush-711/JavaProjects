import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<String> enrolledStudents;
    private static int maxCapacity = 50;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }
    public void enrollStudent(String studentName) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(studentName);
            System.out.println(studentName + " enrolled in " + courseName + ".");
        } else {
            System.out.println("Course " + courseName + " is full. Cannot enroll " + studentName + ".");
        }
    }

    public void unenrollStudent(String studentName) {
        if (enrolledStudents.contains(studentName)) {
            enrolledStudents.remove(studentName);
            System.out.println(studentName + " unenrolled from " + courseName + ".");
        } else {
            System.out.println(studentName + " is not enrolled in " + courseName + ".");
        }
    }

    public static void setMaxCapacity(int capacity) {
        if (capacity > 0) {
            maxCapacity = capacity;
            System.out.println("Maximum capacity for courses set to " + capacity + ".");
        } else {
            System.out.println("Invalid capacity. Capacity must be greater than 0.");
        }
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public static void main(String[] args) {
        Course.setMaxCapacity(10);
        Course math101 = new Course("Mathematics 101");
        Course physics202 = new Course("Physics 202");
        math101.enrollStudent("Alice");
        math101.enrollStudent("Bob");
        math101.enrollStudent("Charlie");
        physics202.enrollStudent("David");
        physics202.enrollStudent("Eve");
        physics202.enrollStudent("Frank");
        physics202.enrollStudent("Grace");
        physics202.enrollStudent("Henry");
        physics202.enrollStudent("Ivy");
        physics202.enrollStudent("Jack");
        physics202.enrollStudent("Jill");
        System.out.println("\nEnrolled students in Math 101: " + math101.getEnrolledStudents());
        System.out.println("Enrolled students in Physics 202: " + physics202.getEnrolledStudents());

        math101.unenrollStudent("Bob");
        math101.unenrollStudent("Bob");
        System.out.println("\nEnrolled students in Math 101 after unenrollment: " + math101.getEnrolledStudents());
    }
}
