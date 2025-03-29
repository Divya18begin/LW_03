package Q5;
class Lecturer {
    private String lecturerName;
    private String courseTeaching;

    // Constructor
    public Lecturer(String Name, String course) {
        this.lecturerName = Name;
        this.courseTeaching = course;
    }

    // Getters and setters
    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String Name) {
        this.lecturerName = Name;
    }

    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(String course) {
        this.courseTeaching = course;
    }
}
