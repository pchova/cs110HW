package hwAssignments;

/** Polina Chetnikova CS110 Section C
 *  Class to represent a hwAssignments.Book object to hold info about a book
 */
public class Book {
    //instance variables
    private String isbn;
    private String title;
    private String publisher;
    private Author author;
    private int numPages;

    /** Constructor that takes in parameter for isbn number,
     *  title, publisher, author, and number of pages.
     *  @param i book isbn number
     *  @param t book title name
     *  @param p book publisher name
     *  @param a author of book object
     *  @param nP number of pages in book
     */
    public Book(String i, String t, Author a, String p, int nP){
        isbn = i;
        title = t;
        author = a;
        publisher = p;
        numPages = nP;
    }

    /** Alternate constructor that makes a deep copy
     *  @param other a hwAssignments.Book object
     */
    public Book(Book other){
        this.isbn = other.isbn;
        this.title = other.title;
        this.publisher = other.publisher;
        this.numPages = other.numPages;

        //make deep copy of hwAssignments.Author object
        this.author = new Author(other.author);
    }

    /** getISBN returns the isbn # of a book
     *  @return isbn
     */
    public String getISBN(){
        return isbn;
    }

    /** getTitle returns the title of a book
     *  @return title
     */
    public String getTitle(){
        return title;
    }

    /** getPublisher returns the publisher of a book
     *  @return publisher
     */
    public String getPublisher(){
        return publisher;
    }

    /** getAuthor returns an hwAssignments.Author object
     *  @return author
     */
    public Author getAuthor(){
        return author;
    }

    /** getNumPages returns the int variable
     * @return numPages
     */
    public int getNumPages(){
        return numPages;
    }

    /** setISBN sets isbn number
     *  @param isbn the isbn number of a book
     */
    public void setISBN(String isbn){
        this.isbn = isbn;
    }

    /** setTitle sets book title
     *  @param title title of book
     */
    public void setTitle(String title){
        this.title = title;
    }

    /** setPublisher sets publisher name
     *  @param publisher
     */
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    /** setAuthor sets author name from other object
     *  @param a name of hwAssignments.Author
     */
    public void setAuthor(Author a){
        author = new Author(a);
    }

    /** setNumPages sets the number of pages in a book
     * @param numPages pages in book
     */
    public void setNumPages(int numPages){
        this.numPages = numPages;
    }

    /** toString method
     *  @Override
     *  @return a str
     */
    public String toString(){
        return String.format("%s, %s (ISBN-10 #%s, %s pages)",
                title, author, isbn, numPages);
    }

    /** equals method, 2 books == if they have same isbn, title, author
     *  this. method is not required because
     *  we access the other object through reference
     *  @Override
     *  @param other Object from java
     *  @return boolean T or F
     */
    public boolean equals(Object other){
        Book otherB = (Book)other;
        //compare instance variables from each object
        return this.isbn.equals(otherB.isbn) &&
                this.title.equals(otherB.title) &&
                this.author.equals(otherB.author);
    }
}
