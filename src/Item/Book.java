package Item;

import Thing.Thing;

public class Book extends Thing {
    String name;

    public Book(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name=name;

    }

    public String getName() {
        return name;
    }
}
