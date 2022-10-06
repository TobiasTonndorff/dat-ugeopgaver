public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    int ID;
    public Customer(String firstName, String lastName, String username, int ID){
        this.firstName=firstName;
        this.lastName=lastName;
        this.username=username;

    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "User: " + username + " Name: " +firstName+" " +lastName+ " ID: "+ID;
    }
}
