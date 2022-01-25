package cafe;

interface IBarista {
}

class Barista implements IBarista {
    public Coffee makeCoffee(MenuItem menuItem) {
        Coffee Coffee = new Coffee(menuItem);
        return Coffee;
    }
}