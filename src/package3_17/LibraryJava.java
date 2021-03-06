package package3_17;

public class LibraryJava {
    private String bookTitle;
    private String bookAuthor;
    private int iSBN;
    private int numOfPages;
    private boolean availability;
    private String borrowDate;
    private String returnDate;

    public LibraryJava(String bookTitle, String bookAuthor, int iSBN, int numOfPages, boolean availability, String borrowDate, String returnDate){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.iSBN = iSBN;
        this.numOfPages = numOfPages;
        this.availability = availability;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getiSBN() {
        return iSBN;
    }

    public void setiSBN(int iSBN) {
        this.iSBN = iSBN;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }


    public void borrowBook(String date){
        if (this.availability){
            this.availability = false;
            String[] arr = date.split("/");
            int month = Integer.parseInt(arr[0]);
            int day = Integer.parseInt(arr[1]);
            if (month > 0 && month < 13 && day > 0 && day < 32 ){
                this.borrowDate = date;
            }else{
                System.out.println("Date is incorrect");
            }
        }else{
            System.out.println("Book is not available");
        }
    }

    public void returnBook(String date){
        this.availability = true;
        String[] dateArr = date.split("/");
        int month = Integer.parseInt(dateArr[0]);
        int day = Integer.parseInt(dateArr[1]);
        if ((month > 0 && month < 13) && (day>0 && day < 32)){
               this.returnDate = date;
        }else{
            System.out.println("Date is incorrect");
        }
    }

    @Override
    public String toString() {
        return "LibraryJava{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", iSBN=" + iSBN +
                ", numOfPages=" + numOfPages +
                ", availability=" + availability +
                ", borrowDate='" + borrowDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
