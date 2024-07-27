public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Валерия", "Никифорова");
        System.out.println("Автор: " + author1.getLastname() + " " + author1.getName());

        Book book1 = new Book("ЭтноВзгляд", author1, 2023);
        System.out.println("Название: " + book1.getTitle());
        System.out.println("Автор: " + author1);
        System.out.println("Дата публикации: " + book1.getPublishDate());
        book1.setPublishDate(2013);
        System.out.println("Дата публикации: " + book1.getPublishDate() + "\n");

        Author author2 = new Author("Платон", "Ойунский");
        System.out.println("Автор: " + author2.getLastname() + " " + author2.getName());
        Book book2 = new Book("ЭтноВзгляд", author2, 2023);
        System.out.println("Название: " + book2.getTitle());
        System.out.println("Автор: " + author2);
        System.out.println("Дата публикации: " + book2.getPublishDate());
        book2.setPublishDate(2013);
        System.out.println("Дата публикации: " + book2.getPublishDate() + "\n");
    }

}


