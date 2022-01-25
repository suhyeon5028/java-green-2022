package cafe;

import java.util.ArrayList;
import java.util.List;

interface IOrder {
}

class Order implements IOrder {
    Customer customer = new Customer();
    Barista barista = new Barista();

    MenuItem m1 = new MenuItem("아메리카노", 1500);
    MenuItem m2 = new MenuItem("카페라떼", 2000);
    MenuItem m3 = new MenuItem("마키아토", 3000);
    MenuItem m4 = new MenuItem("카페모카", 4000);
    List<MenuItem> list = new ArrayList<>();

    // list.add(m1);
    // list.add(m2);
    // list.add(m3);
    // list.add(m4);

    // Menu menu = new Menu(list);

    // customer.order("아메리카노", menu, barista);
}
