import java.util.Objects;

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
    @Override
    public String toString() {
        return String.format("%s %s", firstName, secondName);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.secondName) && Objects.equals(secondName, author.secondName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName) ;
    }
}