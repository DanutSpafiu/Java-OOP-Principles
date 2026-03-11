package Problema_Gemini;

public class Book extends Document{
    private int pageNumber;
    private String literaryGenre;

    public Book(String title, String author, int Id, int pageNumber, String literaryGenre) {
        super(title, author, Id);
        this.pageNumber = pageNumber;
        this.literaryGenre = literaryGenre;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getLiteraryGenre() {
        return literaryGenre;
    }

    @Override
    public void showDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Id: " + getId());
        System.out.println("Page Number: " + pageNumber);
        System.out.println("Literary Genre: " + literaryGenre);
    }
}
