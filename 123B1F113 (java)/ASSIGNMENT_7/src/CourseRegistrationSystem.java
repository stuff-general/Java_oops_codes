abstract class Course {
    protected String courseCode;
    protected String title;
    protected int credits;
    protected int enrolledStudents;

    public Course(String courseCode, String title, int credits) {
        this.courseCode = courseCode;
        this.title = title;
        this.credits = credits;
        this.enrolledStudents = 0;
    }

    public abstract void enrollStudent();

    public abstract void displayCourseDetails();

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    protected void incrementEnrollment() {
        enrolledStudents++;
    }
}

class InformationTechnology extends Course {
    private static final int MAX_ENROLLMENT = 30;

    public InformationTechnology(String courseCode, String title, int credits) {
        super(courseCode, title, credits);
    }

    @Override
    public void enrollStudent() {
        if (enrolledStudents < MAX_ENROLLMENT) {
            incrementEnrollment();
            System.out.println("Student enrolled in IT course: " + title);
        } else {
            System.out.println("Enrollment full for IT course: " + title);
        }
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Title: " + title);
        System.out.println("Credits: " + credits);
        System.out.println("Enrolled Students: " + enrolledStudents);
    }
}

class MechanicalEngineering extends Course {
    private static final int MAX_ENROLLMENT = 25;

    public MechanicalEngineering(String courseCode, String title, int credits) {
        super(courseCode, title, credits);
    }

    @Override
    public void enrollStudent() {
        if (enrolledStudents < MAX_ENROLLMENT) {
            incrementEnrollment();
            System.out.println("Student enrolled in ME course: " + title);
        } else {
            System.out.println("Enrollment full for ME course: " + title);
        }
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Title: " + title);
        System.out.println("Credits: " + credits);
        System.out.println("Enrolled Students: " + enrolledStudents);
    }
}

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Course itCourse = new InformationTechnology("67890", "Data Communication", 3);
        Course meCourse = new MechanicalEngineering("12345", "Entrepreneurship", 4);

        itCourse.enrollStudent();
        itCourse.enrollStudent();

        meCourse.enrollStudent();

        itCourse.displayCourseDetails();
        meCourse.displayCourseDetails();
    }
}

