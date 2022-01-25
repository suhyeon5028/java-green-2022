package cafe;

import java.util.List;

interface IMenu {
}

class Menu implements IMenu {
    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public MenuItem choose(String menuName) {
        for (MenuItem item : items) {
            if (item.getName().equals(menuName)) {
                return item;
            }
        }
        return null;
    }
}
