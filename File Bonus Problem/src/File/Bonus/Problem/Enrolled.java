package File.Bonus.Problem;

public class Enrolled {
    private Student student;
    private Course course;



    public Student getStudent() {
        return student;
    }
    public Course getCourse() {
        return course;
    }


    public void setStudent(Student student) {
        this.student = student;
    }
    public void setCourse(Course course) {
        this.course = course;
    }



    public String getEnrollmentInfo(){
        return student.getStudentName() + "\t is enrolled in course\t" + course.getCourseName() + "\t offered by\t" + course.getUniversity().getUniversityName();
    }


}
