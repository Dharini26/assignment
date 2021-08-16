package project;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Books{

	private int booknum;
	private String bookId; 
    private String bookName;
    private String Author;

    public Books( int booknum ,String bookId, String bookName, String Author) {
        this.booknum=booknum;
    	this.bookId = bookId;
        this.bookName = bookName;
        this.Author = Author;
    }

    public int getBooknum() {
        return booknum;
    }

    public void setBooknum(int booknum) {
        this.booknum = booknum;
    }
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName1(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthors() {
        return Author;
    }

    public void setbookName(String Author) {
        this.Author = Author;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Books) {
            return ((Books) obj).booknum == booknum;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.booknum;
    }
	public static void main(String[] args) {
		Books b1 = new Books(1,"1000","Outliners","Malcom Gladwell");
		Books b2=new Books(1,"1000","Outliners","Malcom Gladwell");
		Books b3=new Books(2,"1001","Time to Kill","John Grisham");
	       List<Books> list=new ArrayList<>();
	       list.add(b1);
	       list.add(b2);
	       list.add(b3);
	       System.out.println("Book List");
	       for (Books book : list) {
	           System.out.println(book.getBookId()+" "+book.getBookName()+" "+book.getAuthors());
	       }

	       HashSet<Books> hashSet = new HashSet<Books>(list);      // create has set. Set will contains only unique objects

	       System.out.println("Book List after removing duplicate");
	       for ( Books book : hashSet) {
	    	   System.out.println(book.getBookId()+" "+book.getBookName()+" "+book.getAuthors());
	       }	
	}
}