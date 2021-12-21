package Entity;

import javax.persistence.Id;

public class CandidateEntity {

    @Id
    private String userName;
    private int cpr;
    private String emailAddress;
    private String politicalParty;

    public  CandidateEntity(String userName, int cpr, String emailAddress, String politicalParty) {
        this.userName = userName;
        this.cpr = cpr;
        this.emailAddress = emailAddress;
        this.politicalParty = politicalParty;
    }
    public CandidateEntity(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCpr() {
        return cpr;
    }

    public void setCpr(int cpr) {
        this.cpr = cpr;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }
}
