package zajecia.dziewiate;

/**
 * Created by RENT on 2017-02-11.
 */
public class Book {
    private String title;
    private Writer writer;
    private int numberOFpages;
    private int releaseDate;
    private String description;
    private String[] content;
    private String category;

    //Konstruktory


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", numberOFpages=" + numberOFpages +
                ", releaseDate='" + releaseDate + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public Book(String title, Writer writer, int releaseDate, String[] content) {
        this.title = title;
        this.writer = writer;
        this.numberOFpages = content.length;
        this.releaseDate = releaseDate;
        this.content = content;

    }

    public Book(String title, Writer writer, int releaseDate, String[] content, String description, String category) {
        this(title, writer, releaseDate, content);
        this.description = description;
        this.category = category;
    }

    public String getPage(int index) {
        int actualIndex = index - 1;
        if (actualIndex >= 0 && actualIndex < this.numberOFpages) {
            return content[actualIndex];
        } else {
            return "Brak strony";
        }
        //     return (actualIndex >= 0 && actualIndex < this.numberOFpages) ? content[actualIndex] : "Brak strony";
    }

    public String getTitle() {
        return title;
    }

    public Writer getWriter() {
        return writer;
    }

    public int getNumberOFpages() {
        return numberOFpages;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public String[] getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
