package main;

import NYPizza.NYPizzaStore;
import creator.PizzaStore;

public class PizzaApp {

    public static void main(String[] args) {
       PizzaStore nyPizzaStore = new NYPizzaStore();
       
       nyPizzaStore.orderPizza("clams");

    }

}
