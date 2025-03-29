package Q5;
class Main {
    public static void main(String[] args) {
        // Create lecturer objects
        Lecturer lecturer1 = new Lecturer("Dr. Smith", "Introduction to Computer Science");
        Lecturer lecturer2 = new Lecturer("Prof. Johnson", "Data Structures and Algorithms");

        // Create course objects
        Course course1 = new Course("Introduction to Computer Science", "CT101", lecturer1);
        Course course2 = new Course("Data Structures and Algorithms", "CT201", lecturer2);

        // Create student objects
        Student student1 = new Student("Alice Brown", "Computer Science", "CT101");
        Student student2 = new Student("Bob Wilson", "Computer Science", "CT201");
        Student student3 = new Student("Charlie Davis", "Information Technology", "CT101");

        // Display registration information
        System.out.println("=== University Course Registration System ===");
        System.out.println("\nAvailable Courses:");
        displayCourseInfo(course1);
        displayCourseInfo(course2);

        System.out.println("\nStudent Registrations:");
        displayStudentInfo(student1, course1);
        displayStudentInfo(student2, course2);
        displayStudentInfo(student3, course1);
    }

    private static void displayCourseInfo(Course course) {
        System.out.println("\nCourse Code: " + course.getCourseCode());
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Lecturer: " + course.getLecturer().getLecturerName());
    }

    private static void displayStudentInfo(Student student, Course course) {
        System.out.println("\nStudent Name: " + student.getStudentName());
        System.out.println("Degree Program: " + student.getDegreeName());
        System.out.println("Registered Course: " + course.getCourseName() + " (" + course.getCourseCode() + ")");
        System.out.println("Taught by: " + course.getLecturer().getLecturerName());
    }
}