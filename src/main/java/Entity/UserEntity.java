package Entity;

import org.apache.catalina.User;

import javax.persistence.Id;

public class UserEntity {

    @Id
    private String userName;
    private int cpr;
    private String email;
    private String password;



    public UserEntity(int cpr, String userName, String email, String password){
        this.cpr =cpr;
        this.userName = userName;
        this.email= email;
        this.password= password;
    }

    public UserEntity(){

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

}
