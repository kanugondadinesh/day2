class Course {
    String courseName;
    int duration;
    double fee;
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("-------------------------");
    }
}
public class Task30 {
    public static void main(String[] args) {
        Course c1 = new Course("Java Developer", 6, 45000.0);
        Course c2 = new Course("Web Design", 3, 20000.0);
        c1.displayCourse();
        c2.displayCourse();
    }
}