package javaapplication8;

public class Email {
    private String email, password;

    public Email(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Email() {
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
