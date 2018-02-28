
package librarycatalogue;

public class Book {
    
    //properties, fields and global variables of book
    String title;
    int PageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;
    
    // Construtor
    public Book(String bookTitle, int bookPageCount, int bookISBN){
        this.title = bookTitle;
        this.PageCount = bookPageCount;
        this.ISBN = bookISBN;
        this.isCheckedOut = false;
        
    }
    // Setters    
    public void setISBN(int newISBN){
        ISBN = newISBN;
    }
    public void setisCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut){
        isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }
    private void setDayCheckedOut(int day){
        dayCheckedOut = day;
    }
    
    // Getters
    public String getBookTitle(){
        String result = this.title;
        return result;
    }
    public int getPageCount(){
        int result = this.PageCount;
        return result;
    }
    public int getISBN(){
        int result = this.ISBN;
        return result;
    }
    public boolean getIsCheckedOut(){
        boolean result = this.isCheckedOut;
        return result;
    }
    public int getDayCheckedOut(){
        int result = this.dayCheckedOut;
        return result;
    }
}
