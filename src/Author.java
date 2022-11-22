public class Author {
    private String authorName;
    private String authorSecondName;

    public Author (String authorName, String authorSecondName) {
        this.authorName = authorName;
        this.authorSecondName = authorSecondName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSecondName() {
        return this.authorSecondName;
    }
}
