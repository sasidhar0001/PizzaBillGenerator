//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
//        Pizza basePizza = new Pizza(true);
//        basePizza.addExtraCheese();
//        basePizza.addExtraToppings();
//       basePizza.takeAway();
//        basePizza.getBill();


        DeluxePizza dp =new DeluxePizza(false);
        dp.addExtraCheese(); //we made these empty by using override in the deluxe pizza class
        dp.addExtraToppings();//both of these we can remove it
        dp.takeAway();
        dp.getBill();
    }
}


