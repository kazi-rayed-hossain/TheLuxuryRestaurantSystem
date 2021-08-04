package File.Bonus.Problem;

public class University {
    private String universityId;
    private String universityName;


    public String getUniversityId() {
        return universityId;
    }
    public String getUniversityName() {
        return universityName;
    }



    public void setUniversityId(String universityId){
        this.universityId=universityId;


    }
    public void setUniversityName(String universityName){
        this.universityName=universityName;

    }


    public String getUniversityInfo(){
        return "universityId:\t" + universityId + "\tuniversityName:\t" + universityName;
    }


}
