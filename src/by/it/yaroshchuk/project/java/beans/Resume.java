package by.it.yaroshchuk.project.java.beans;

public class Resume {

    private long id;
    private String resumeName;
    private String fullName;
    private String dob;
    private String country;
    private String city;
    private String education;
    private String degree;
    private int graduateYear;
    private String experience;
    private String post;
    private int worktime;
    private String about;
    private long usersId;

    public Resume() {
    }

    public Resume(long id, String resumeName, String fullName, String dob, String country, String city, String education,
                  String degree, int graduateYear, String experience, String post, int worktime, String about, long usersId) {
        this.id = id;
        this.resumeName = resumeName;
        this.fullName = fullName;
        this.dob = dob;
        this.country = country;
        this.city = city;
        this.education = education;
        this.degree = degree;
        this.graduateYear = graduateYear;
        this.experience = experience;
        this.post = post;
        this.worktime = worktime;
        this.about = about;
        this.usersId = usersId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(int graduateYear) {
        this.graduateYear = graduateYear;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getWorktime() {
        return worktime;
    }

    public void setWorktime(int worktime) {
        this.worktime = worktime;
    }

    public long getUsersId() {
        return usersId;
    }

    public void setUsersId(long usersId) {
        this.usersId = usersId;
    }

    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", resumeName='" + resumeName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dob='" + dob + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", education='" + education + '\'' +
                ", degree='" + degree + '\'' +
                ", graduateYear=" + graduateYear +
                ", experience='" + experience + '\'' +
                ", post='" + post + '\'' +
                ", worktime=" + worktime +
                ", about='" + about + '\'' +
                ", usersId=" + usersId +
                '}';
    }
}
