/**
 * Write a description of class Print here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Print {
    private Book newBook;
    
    public Print() {
        newBook = new Book("JRR", "Tolkien", 1 , "The Silmarillion", "1977", 365);
    }
    
    public void PrintInfo() {
        System.out.println("Author First Name: " + newBook.getAuthorFirstName());
        System.out.println("Author Last Name: " + newBook.getAuthorLastName());
        System.out.println("ISBN Number: " + newBook.getISBNNum());
        System.out.println("Book Title: " + newBook.getBookTitle());
        System.out.println("Publication Date: " + newBook.getPubDate());
        System.out.println("Number of Pages: " + newBook.getNumPages());
    }
}