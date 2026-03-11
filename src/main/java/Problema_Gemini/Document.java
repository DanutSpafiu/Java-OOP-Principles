package Problema_Gemini;

public abstract class Document {
    private String title;
    private String author;
    private int Id;

    public Document(String title, String author, int Id) {
        this.title = title;
        this.author = author;
        this.Id = Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public abstract void showDetails();
}


