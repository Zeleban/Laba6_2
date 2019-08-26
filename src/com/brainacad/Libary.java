package com.brainacad;

public class Libary {
    public static void main(String[] args) {
        Book book= new Book();
        book.Name= "First book";
        book.pages= 111;
        book.Author= "Me";
        //book.PAGES_PER_DAY ;
        System.out.println(book.Name +" "+ book.pages+" " +book.Author);

        Book book1= new Book();
        book1.Name= "Second book";
        book1.pages= 222;
        book1.Author= "Not Me";
      // book1.SIZE_DAY=10;
        System.out.println(book1.Name +" "+ book1.pages+ " " +book1.Author);
        System.out.println("Read such count of pages: ");
    }
    int getWeeklyPagesCount() {
        return Book.PAGES_PER_DAY*7;
    }
}
