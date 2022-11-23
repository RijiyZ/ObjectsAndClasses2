public class Author {
    private final String firstName, secondName;
    public Author (String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getsecondName(){
        return secondName;
    }
    public String toString() {
        return  firstName + " " + secondName;
    }
}