
/**
 * Write a description of class Book here.
 *
 * @author Kaz Cogswell
 * @version (a version number or a date)
 */

public class Book
{
    // instance variables - replace the example below with your own
    public String authorFirstName;
    public String authorLastName;
    public int ISBNNum;
    public String bookTitle;
    public String pubDate;
    public int numPages;
    
    
    public Book(String lastName, String firstName, int ISBN, String title, String publication, int pages)
    {
        authorFirstName = lastName;
        authorLastName = firstName;
        ISBNNum = 0;
        bookTitle = title;
        pubDate = publication;
        numPages = pages;
        
    }
    
    public void setAuthorFirstName(String firstName)
    {
        authorFirstName = firstName;
    }
    
    public String getAuthorFirstName() {
        return authorFirstName;
    }
    
    public void setAuthorLastName(String lastName)
    {
        authorLastName = lastName;
    }
    
    public String getAuthorLastName() {
        return authorLastName;
    }
    
    public void setISBNNum(int ISBN)
    {
        ISBNNum = ISBN;
    }
    
    public int getISBNNum() {
        return ISBNNum;
    }
    
    public void setBookTitle(String title)
    {
        bookTitle = title;
    }
    
    public String getBookTitle() {
        return bookTitle;
    }
    
    public void setPubDate(String date)
    {
        pubDate = date;
    }
    
    public String getPubDate() {
        return pubDate;
    }
    
    public void setNumPages(int numOfPages)
    {  
        if (numPages < 10)
        {
            System.out.println("You have too few pages. Number of pages must be greater than 10.");
        } else {
            numPages = numOfPages;
        }
    }
    
    public int getNumPages() {
        return numPages;
    }
    
}