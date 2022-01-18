package com.itea.kolyakaHomeWork.hw_7_EncapsulationAndObject;

public class BookInfo {
    private String name;
    private String author;
    private String publisher;
    private  double price;

    public BookInfo(String name, String author, String publisher, double price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        //this.price = price;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>10)
        {
            this.price = price;
        }
        else {
            System.out.println("сумма должна быть больше 10");
            this.price =10;
        }
    }

    @Override
    public String toString() {
        return "Название книги: '" + this.getName() + "', автор: '" + this.getAuthor() + "', издатель: '" + getPublisher() + "', цена: " + getPrice() ;
    }

    public static void main(String[] args) {
        BookInfo bookInfo = new BookInfo("Братья Карамазовы", "Достоевский", "Мир", 120);
        BookInfo bookInfo2 = new BookInfo("Война и мир", "Толстой", "Мир", 5);
        System.out.println(bookInfo);
        System.out.println(bookInfo2);

    }
}
