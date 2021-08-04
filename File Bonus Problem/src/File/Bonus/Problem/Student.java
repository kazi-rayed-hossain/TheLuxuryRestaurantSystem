package File.Bonus.Problem;

public class Student {
    private String studentId;
    private String studentName;
    private University university;


    public String getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public University getUniversity() {
        return university;
    }


    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setUniversity(University university) {
        this.university = university;
    }



    public String getStudentInfo(){
        return "studentId:\t" + studentId + "\tstudentName:\t" + studentName + "\t registered in University:\t" + university.getUniversityName();
    }

}
