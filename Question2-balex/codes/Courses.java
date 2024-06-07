
package balex;

import java.util.Scanner;
public class Courses {
   String courseID;
   String courseName;
   int tuition;
    public Courses(String courseID, String courseName, int tuition) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.tuition = tuition;
    }
    public void showCourseDetails() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Name: " + courseName);
        System.out.println("Tuition: " + tuition);
    }
    public static Courses getCourseByID(String courseID) {
        switch (courseID) {
            case "BSE":
                return new Courses("BSE", "Software Engineering", 900000);
            case "BIT":
                return new Courses("BIT", "Information Technology", 750000);
            case "BCS":
                return new Courses("BCS", "Computer Science", 800000);
            case "BCE":
                return new Courses("BCE", "Computer Engineering", 950000);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Course ID: ");
        String inputCourseID = scanner.nextLine();

        // Fetch course details based on the provided CourseID
        Courses course = Courses.getCourseByID(inputCourseID);
        if (course != null) {
            course.showCourseDetails();
        } else {
            System.out.println("Wrong CourseID details");
        }
    }
}
