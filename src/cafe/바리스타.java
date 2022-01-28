package cafe;

abstract class Barista {
}

class 공유 extends Barista {

    private String name = "공유";

    public Coffee makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }

    public String getName() {
        return name;
    }
}