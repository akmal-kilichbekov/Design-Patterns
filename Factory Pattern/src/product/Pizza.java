package product;

import ingredient.Clams;
import ingredient.Dough;
import ingredient.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutted in diagonal slices");
    }

    public void box() {
        System.out.println("Packaged !!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza [name=" + name + "]";
    }
    
    
}
