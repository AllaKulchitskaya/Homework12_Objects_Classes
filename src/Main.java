public class Main {
    public static void main(String[] args) {
        Author king = new Author("Стивен", "Кинг");
        Book shining = new Book ("Сияние", king, 1977);
        System.out.println("Название книги:  " + shining.getTitle());
        System.out.println("Автор: " + king.getAuthorName() + " " + king.getAuthorSecondName());
        System.out.println("Год издания: " + shining.getEditionYear());
        shining.setEditionYear(1980);
        System.out.println("Измененный год издания: " + shining.getEditionYear());
        Author fowles = new Author("Джон", "Фаулз");
        Book collector = new Book ("Коллекционер", fowles, 1963);
        System.out.println("Название книги:  " + collector.getTitle());
        System.out.println("Автор: " + fowles.getAuthorName() + " " + fowles.getAuthorSecondName());
        System.out.println("Год издания: " + collector.getEditionYear());
        collector.setEditionYear(1974);
        System.out.println("Измененный год издания: " + collector.getEditionYear());
    }
}