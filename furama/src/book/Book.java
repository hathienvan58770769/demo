package book;

import entertainment.Entertainment;

public class Book extends Entertainment {
    public Book(String name) {
        this.setName(name);
    }

    @Override
    public String toString() {
        return super.name.toString();
    }
}
