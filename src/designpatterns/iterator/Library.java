package designpatterns.iterator;

import java.util.*;
import java.util.stream.Collectors;

public class Library {
    private Map<String, Set<Book>> categoriesBookMap = new HashMap<>();//science,{ book1, book2},

    public void addBook(final String category, final Book book) {
        if (!categoriesBookMap.containsKey(category)) {
            categoriesBookMap.put(category, new HashSet<>());
        }
        categoriesBookMap.get(category).add(book);

    }

    public Iterator<Book> byCategory(final String category) {
        return categoriesBookMap.get(category).iterator();
    }

    public Iterator<Book> allBooksIterator() {
        return new AllIteratorImpl();
    }

    class AllIteratorImpl implements Iterator<Book> {

        Iterator<Book> booksIterator = categoriesBookMap.values().stream().flatMap(Set::stream).collect(Collectors.toSet())
                .iterator();

        @Override
        public boolean hasNext() {
            return booksIterator.hasNext();
        }

        @Override
        public Book next() {
            return booksIterator.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove not supported");
        }
    }


}
