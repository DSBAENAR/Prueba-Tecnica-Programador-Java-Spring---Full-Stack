public class Contact {
    private String name;
    private String email;
    private String gender;
    private String direction;

    public Contact(String name, String email, String gender, String direction) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.direction = direction;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    
    
}
