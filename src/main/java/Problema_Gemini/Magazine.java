package Problema_Gemini;

public class Magazine extends Document {
    private String edition;
    private  String brand;

    public Magazine(String title, String author, int Id, String edition, String brand) {
        super(title, author, Id);
        this.edition = edition;
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Id: " + getId());
        System.out.println("Edition: " + edition);
        System.out.println("Brand: " + brand);
    }
}
