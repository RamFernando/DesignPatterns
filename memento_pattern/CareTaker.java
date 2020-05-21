package memento_pattern;

import java.util.Stack;

public class CareTaker {

    Stack<Cart.CartMementor> history = new Stack<>();

    public void save(Cart cart){
        history.push(cart.save());
    }

    public void revert(Cart cart){
        if (!history.isEmpty()){
            cart.revert(history.pop());
        }else{
            System.out.println("Cannot Undo!");
        }
    }
}
