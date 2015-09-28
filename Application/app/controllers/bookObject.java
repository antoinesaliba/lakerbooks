package controllers;

public class bookObject{

    public String isbn13;
    public String isbn10;
    public String title;
    public String authors;
    public String edition;
    public String state;
    public int price;
    public String seller;
    public String buyer;
    public String imageURL;


    public bookObject(String isbn13, String isbn10, String title, String authors, String edition, String state, int price, String seller, String buyer, String imageURL){
        this.isbn13=isbn13;
        this.isbn10=isbn10;
        this.title=title;
        this.authors=authors;
        this.edition=edition;
        this.state=state;
        this.price=price;
        this.seller=seller;
        this.buyer=buyer;
        this.imageURL=imageURL;
    }
}