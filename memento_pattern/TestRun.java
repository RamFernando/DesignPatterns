package memento_pattern;

public class TestRun {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Cart cart = new Cart();

        cart.addItem(new Item("Samsung A20"));
        cart.addItem(new Item("Huawei Y9"));
        careTaker.save(cart);
        System.out.println(cart);

        cart.addItem(new Item("Samsung S10"));
        careTaker.save(cart);
        System.out.println(cart);

        cart.addItem(new Item("Huawei Y7"));
        careTaker.save(cart);
        System.out.println(cart);

        cart.addItem(new Item("Samsung J7"));
        //careTaker.save(cart);
        System.out.println(cart);

        careTaker.revert(cart);
        System.out.println(cart);

        cart.addItem(new Item("iPad"));
        //careTaker.save(cart);
        System.out.println(cart);

        careTaker.revert(cart);
        System.out.println(cart);

        careTaker.revert(cart);
        System.out.println(cart);

        careTaker.revert(cart);
        System.out.println(cart);

        careTaker.revert(cart);
        System.out.println(cart);
    }
}
