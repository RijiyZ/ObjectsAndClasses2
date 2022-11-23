public class Book {
    private final String name;
    private final Author authorName;
    private int publicationYear;
    public Book (String name, int publicationYear, Author authorName) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.authorName = authorName;
    }
    public String getName(){
        return name;
    }
    public int getpublicationYear() {
        return publicationYear;
    }
    public Author getAuthorName() {
        return authorName;
    }
    public void setpublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(publicationYear);
    }
    @Override
    public String toString() {
        return "/ Автор: " + authorName + " / Дата публикации: " + publicationYear + " / Название книги " + name;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book2 = (Book) other;
        return name.equals(book2.name);
    }
}