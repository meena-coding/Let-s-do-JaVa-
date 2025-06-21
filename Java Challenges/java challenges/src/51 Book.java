class Book {

    static int totalNoOfBooks;

    String author;
    String title;
    String isbn;

    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }

    {  //object in it
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn){
        this(isbn, "unknown",  "unknown");
    }

    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed.");
        }
        else {
            this.isBorrowed = true;
            System.out.println("Enjoy Reading "+ this.title);
        }
    }

    void returnBook(){
        if(isBorrowed){
            System.out.println("Hope You Enjoyed. Please Leave a Review.");
        }
        else
            System.out.println("This Book is already in the Library");
    }

    public static void main(String[] args) {

        Book NCERTclass12 = new Book("1","Maths","Central Board");
        Book rainbowThoughts = new Book("2");

        System.out.println(Book.getTotalNoOfBooks());

        NCERTclass12.borrowBook();
        rainbowThoughts.borrowBook();
        NCERTclass12.borrowBook();
        rainbowThoughts.returnBook();
        rainbowThoughts.returnBook();
    }

}
