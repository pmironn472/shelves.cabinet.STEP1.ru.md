package app;

import Cabinet.Cabinet;
import Item.Book;
import Item.Phone;
import Item.Tablet;

public class App {
    public static void  main (String[] args){

        Cabinet c = new Cabinet();
        Cabinet c1 =new Cabinet();
        Cabinet c2 =new Cabinet();


        System.out.println(c.whatIsOn("topShelf"));
        c.put("topShelf",new Book("Olololol"));
        System.out.println(c.whatIsOn("topShelf").getName());
        System.out.println(c.take("topShelf"));
        System.out.println(c.whatIsOn("topShelf"));


        System.out.println();
        System.out.println();


        System.out.println(c1.whatIsOn("middleShelf"));
        c1.put("middleShelf",new Phone("Iphone"));
        System.out.println(c1.whatIsOn("middleShelf").getName());
        System.out.println(c1.take("middleShelf"));
        System.out.println(c1.whatIsOn("middleShelf"));


        System.out.println();
        System.out.println();


        System.out.println(c2.whatIsOn("middleShelf"));
        c2.put("middleShelf",new Tablet("Xiaomi"));
        System.out.println(c2.whatIsOn("middleShelf").getName());
        System.out.println(c2.take("middleShelf"));
        System.out.println(c2.whatIsOn("middleShelf"));







    }
}
