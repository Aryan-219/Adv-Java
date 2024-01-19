package models;

public class User {
    private Integer userId;
    private String name;
    private String email;
    private String password;
    private String pic;
    private String phone;
    private String interest;
    private String employer;
    private Integer experience;
    private String jobProfile;
    private Occupation occupation;
    private String technologiesUsed;
    private Integer questionsPosted;
    private Integer responses;
    private Country country;
    private Integer messagesBlocked;
    private String otp;
    private Integer starRank;
    private Badge badge;
    private Status status;
    public User() {
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPic() {
        return pic;
    }
    public void setPic(String pic) {
        this.pic = pic;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getInterest() {
        return interest;
    }
    public void setInterest(String interest) {
        this.interest = interest;
    }
    public String getEmployer() {
        return employer;
    }
    public void setEmployer(String employer) {
        this.employer = employer;
    }
    public Integer getExperience() {
        return experience;
    }
    public void setExperience(Integer experience) {
        this.experience = experience;
    }
    public String getJobProfile() {
        return jobProfile;
    }
    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }
    public Occupation getOccupation() {
        return occupation;
    }
    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }
    public String getTechnologiesUsed() {
        return technologiesUsed;
    }
    public void setTechnologiesUsed(String technologiesUsed) {
        this.technologiesUsed = technologiesUsed;
    }
    public Integer getQuestionsPosted() {
        return questionsPosted;
    }
    public void setQuestionsPosted(Integer questionsPosted) {
        this.questionsPosted = questionsPosted;
    }
    public Integer getResponses() {
        return responses;
    }
    public void setResponses(Integer responses) {
        this.responses = responses;
    }
    public Country getCountry() {
        return country;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
    public Integer getMessagesBlocked() {
        return messagesBlocked;
    }
    public void setMessagesBlocked(Integer messagesBlocked) {
        this.messagesBlocked = messagesBlocked;
    }
    public String getOtp() {
        return otp;
    }
    public void setOtp(String otp) {
        this.otp = otp;
    }
    public Integer getStarRank() {
        return starRank;
    }
    public void setStarRank(Integer starRank) {
        this.starRank = starRank;
    }
    public Badge getBadge() {
        return badge;
    }
    public void setBadge(Badge badge) {
        this.badge = badge;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    
}
