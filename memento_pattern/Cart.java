package memento_pattern;

import java.util.ArrayList;

//Originator
public class Cart {
    ArrayList<Item> list = new ArrayList<>();

    public void addItem(Item item){
        list.add(item);
    }

    public ArrayList<Item> getList() {
        return (ArrayList<Item>) list.clone();
    }

    public CartMementor save(){
        return new CartMementor(getList());
    }

    public void revert(CartMementor cartMementor){
        list=cartMementor.getItems();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "list=" + list +
                '}';
    }

    static class CartMementor{
        ArrayList items;

        public CartMementor(ArrayList items) {
            this.items = items;
        }

        private ArrayList getItems() {
            return items;
        }
    }
}
