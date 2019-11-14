package model;

public class Misc extends Items{
    private String name;
    private int price;


    public Misc(String name, int price) {
        super(name,price);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " " + this.price +":-";
    }
}
