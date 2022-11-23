public class Main {
    public static void main(String[] args) {
        Author author = new Author("Анастасия", "Россошик");
        Author author2 = new Author("Иван", "Дикарев");
        Book book = new Book("'Маленький Принц'", 2022, author);
        Book book2 = new Book("'Гарри Поттер'", 2011, author2);
        book.setpublicationYear(666);
        System.out.print("1 Книга - " + book + "\n" + "2 Книга - " + book2);
    }
}