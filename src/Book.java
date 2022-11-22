public class Book {
    private String title;
    private Author author;
    private int editionYear;

    public Book(String title, Author author, int editionYear) {
        this.title = title;
        this.author = author;
        this.editionYear = editionYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getEditionYear() {
        return this.editionYear;
    }

    public void setEditionYear(int editionYear) {
        this.editionYear = editionYear;
    }
}