package cafe;

abstract class Customer {
}

class 홍길동 extends Customer {

    private String name = "홍길동";

    public void order(String menuName, Menu menu, 공유 barista) {
        MenuItem menuItem = menu.choose(menuName);
        if (menuItem == null) {
            System.out.println("찾은 메뉴가 없습니다.");
        }
        Coffee coffee = barista.makeCoffee(menuItem);

        System.out.println(name + "이" + coffee.getPrice() + "원" + coffee.getName() + "를 받았습니다.");
        // System.out.println("커피 이름 : " + coffee.getName());
        // System.out.println("커피 금액 : " + coffee.getPrice());
    }
}