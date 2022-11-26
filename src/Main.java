public class Main {
    public static void main(String[] args) {
        Author author = new Author("Анастасия", "Россошик");
        Author author1 = new Author("Иван", "Дикарев");
        Author author2 = new Author("Второй", "Автор");
        Author author3 = new Author("Третий", "Автор");
        Book book = new Book("Маленький Принц", 2022, author);
        Book book1 = new Book("Первая книга", 2022, author1);
        Book book2 = new Book("Гарри Поттер", 2011, author2);
        System.out.println(author.getFirstName() + " " + author.getsecondName() + " - ''" + book.getName() + "'' "  + book.getpublicationYear() + " год.");
        System.out.println(author1.getFirstName() + " " + author1.getsecondName() + " - ''" + book1.getName() + "'' "  + book1.getpublicationYear() + " год.");
        System.out.println(author2.getFirstName() + " " + author2.getsecondName() + " - ''" + book2.getName() + "'' "  + book2.getpublicationYear() + " год.");
        book.setpublicationYear(2054);
        System.out.println(book.getpublicationYear());

        System.out.println("Объекты равны?");
        System.out.println(author.equals(author3));
        System.out.println("Хешкод первого объекта");
        System.out.println(author.hashCode());
        System.out.println("Хешкод второго объекта");
        System.out.println(author3.hashCode());

        System.out.println("Эти объекты равны?");
        System.out.println(author.equals(author1));
        System.out.println("Хешкод первого объекта");
        System.out.println(author.hashCode());
        System.out.println("Хешкод второго объекта");
        System.out.println(author1.hashCode());
    }
}