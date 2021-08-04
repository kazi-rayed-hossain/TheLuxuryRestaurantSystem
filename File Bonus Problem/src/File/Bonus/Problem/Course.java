package File.Bonus.Problem;

public class Course {
    private String courseId;
    private String courseName;
    private String courseDescription;
    private University university;


    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public University getUniversity() {
        return university;
    }


    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
    public void setUniversity(University university) {
        this.university = university;
    }



    public String getCourseInfo(){
        return "courseId:\t" + courseId + "\tcourseName:\t" + courseName + "\tcourseDescription\t" + courseDescription + "\tCourseOfferedBy\t" + university.getUniversityName();
    }

}
