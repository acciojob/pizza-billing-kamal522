package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

      // super.addExtraCheese();
       addExtraCheese();                      // all are curret
       //this.addExtraToppings();
        addExtraToppings();
    }
}
