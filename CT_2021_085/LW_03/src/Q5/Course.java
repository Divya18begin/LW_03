package Q5;

class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    // Constructor
    public Course(String Name, String Code, Lecturer lecturer) {
        this.courseName = Name;
        this.courseCode = Code;
        this.lecturer = lecturer;
    }

    // Getters and setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String Name) {
        this.courseName = Name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String Code) {
        this.courseCode = Code;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
