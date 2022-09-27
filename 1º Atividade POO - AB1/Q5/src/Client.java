import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date birthDate;

    public Date getBirth() {
        return birthDate;
    }

    public void setBirth(java.util.Date birthDate) {
        this.birthDate = birthDate;
    }

    public Client(String name, String email, java.util.Date birthDate) {
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

    

}
