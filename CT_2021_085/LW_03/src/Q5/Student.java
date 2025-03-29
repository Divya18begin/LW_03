package Q5;
class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    // Constructor
    public Student(String Name, String degree, String course) {
        this.studentName = Name;
        this.degreeName = degree;
        this.courseFollowing = course;
    }

    // Getters and setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degree) {
        this.degreeName = degree;
    }

    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setCourseFollowing(String course) {
        this.courseFollowing = course;
    }
}
