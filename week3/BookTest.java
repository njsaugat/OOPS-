package week3;

public class BookTest {
    public static void main(String[] args){
        Book[] booksArray= new Book[30];
        for(int i=0;i<booksArray.length;i++){
            booksArray[i]=new Book("Physics",1233,"Ghansyam","Bookstore");
        }
        for(int i=0;i<booksArray.length;i++){
            System.out.println(booksArray[i].getBookInfo());
        }
    }
}

class Book{
    private String bookName;
    private double ISBNno;
    private String authorName;
    private String publisher;
    Book(String bookName,double ISBNno,String authorName,String publisher){
        this.bookName=bookName;
        this.ISBNno=ISBNno;
        this.authorName=authorName;
        this.publisher=publisher;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getISBNno() {
        return this.ISBNno;
    }

    public void setISBNno(double ISBNno) {
        this.ISBNno = ISBNno;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getBookInfo(){
        return this.bookName+" which has ISBN no. "+this.ISBNno+" written by "+this.authorName+" is published by "+ this.publisher;
    }
}
