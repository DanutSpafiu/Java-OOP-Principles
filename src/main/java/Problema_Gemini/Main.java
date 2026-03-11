package Problema_Gemini;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame {
    private List<Book> books = new ArrayList<>();
    private List<Magazine> magazines = new ArrayList<>();
    
    private JTextArea displayArea;
    
    public Main() {
        setTitle("Digital Library");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLayout(new BorderLayout());
        
        JPanel buttonPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        
        JButton addBookBtn = new JButton("Add Book");
        JButton addMagazineBtn = new JButton("Add Magazine");
        JButton showBooksBtn = new JButton("Show Books");
        JButton showMagazinesBtn = new JButton("Show Magazines");
        
        addBookBtn.addActionListener(e -> addBook());
        addMagazineBtn.addActionListener(e -> addMagazine());
        showBooksBtn.addActionListener(e -> showBooks());
        showMagazinesBtn.addActionListener(e -> showMagazines());
        
        buttonPanel.add(addBookBtn);
        buttonPanel.add(addMagazineBtn);
        buttonPanel.add(showBooksBtn);
        buttonPanel.add(showMagazinesBtn);
        
        add(buttonPanel, BorderLayout.WEST);
        
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);
        
        setLocationRelativeTo(null);
    }
    
    private void addBook() {
        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField idField = new JTextField();
        JTextField pageField = new JTextField();
        JTextField genreField = new JTextField();
        
        Object[] message = {
            "Title:", titleField,
            "Author:", authorField,
            "Id:", idField,
            "Page Number:", pageField,
            "Literary Genre:", genreField
        };
        
        int option = JOptionPane.showConfirmDialog(this, message, "Add Book", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            try {
                Book book = new Book(
                    titleField.getText(),
                    authorField.getText(),
                    Integer.parseInt(idField.getText()),
                    Integer.parseInt(pageField.getText()),
                    genreField.getText()
                );
                books.add(book);
                JOptionPane.showMessageDialog(this, "Book added!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid number format!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void addMagazine() {
        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField idField = new JTextField();
        JTextField editionField = new JTextField();
        JTextField brandField = new JTextField();
        
        Object[] message = {
            "Title:", titleField,
            "Author:", authorField,
            "Id:", idField,
            "Edition:", editionField,
            "Brand:", brandField
        };
        
        int option = JOptionPane.showConfirmDialog(this, message, "Add Magazine", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            try {
                Magazine magazine = new Magazine(
                    titleField.getText(),
                    authorField.getText(),
                    Integer.parseInt(idField.getText()),
                    editionField.getText(),
                    brandField.getText()
                );
                magazines.add(magazine);
                JOptionPane.showMessageDialog(this, "Magazine added!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid number format!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void showBooks() {
        StringBuilder sb = new StringBuilder("=== BOOKS ===\n\n");
        if (books.isEmpty()) {
            sb.append("No books added.\n");
        } else {
            for (Book b : books) {
                sb.append("Title: ").append(b.getTitle()).append("\n");
                sb.append("Author: ").append(b.getAuthor()).append("\n");
                sb.append("Id: ").append(b.getId()).append("\n");
                sb.append("Page Number: ").append(b.getPageNumber()).append("\n");
                sb.append("Literary Genre: ").append(b.getLiteraryGenre()).append("\n");
                sb.append("\n");
            }
        }
        displayArea.setText(sb.toString());
    }
    
    private void showMagazines() {
        StringBuilder sb = new StringBuilder("=== MAGAZINES ===\n\n");
        if (magazines.isEmpty()) {
            sb.append("No magazines added.\n");
        } else {
            for (Magazine m : magazines) {
                sb.append("Title: ").append(m.getTitle()).append("\n");
                sb.append("Author: ").append(m.getAuthor()).append("\n");
                sb.append("Id: ").append(m.getId()).append("\n");
                sb.append("Edition: ").append(m.getEdition()).append("\n");
                sb.append("Brand: ").append(m.getBrand()).append("\n");
                sb.append("\n");
            }
        }
        displayArea.setText(sb.toString());
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main app = new Main();
            app.setVisible(true);
        });
    }
}
