package designpatterns.iterator;

import java.util.Iterator;

public class LibraryUsage {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("science",new Book("physics", 100, "hc verma"));
        library.addBook("science",new Book("chemistry", 200, "op tandon"));
        library.addBook("maths",new Book("algebra", 300, "rd sharma"));
        library.addBook("maths",new Book("calculus", 400, "thomas finney"));
        System.out.println("*****science books");
        Iterator<Book> scienceBooksIterator = library.byCategory("science");
        for (Iterator<Book> it = scienceBooksIterator; it.hasNext(); ) {
            Book book = it.next();
            System.out.println(book.getTitle()+"-"+book.getAuthor());
        }

        System.out.println("*****all books");
        Iterator<Book>allBooksIterator=library.allBooksIterator();
        for (Iterator<Book> it = allBooksIterator; it.hasNext(); ) {
            Book book = it.next();
            System.out.println(book.getTitle()+"-"+book.getAuthor());
        }

    }
}
