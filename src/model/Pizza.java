package model;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Pizza extends Items {
    private String name;
    private int price;
    private ArrayList<Ingredients> ingredients;

    public Pizza(String name, int price) {
        super(name,price);
        this.name = name;
        this.price = price;
        this.ingredients = new ArrayList<Ingredients>();
        Ingredients cheese = new Ingredients("Cheese", 0);
        Ingredients tomatoSauce = new Ingredients("Tomato Sauce", 0);
        this.addIngredient(cheese);
        this.addIngredient(tomatoSauce);
    }


 
    public ArrayList<Ingredients> getIngredients(){
        return ingredients;
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

    public void addIngredient(Ingredients ingredient) {
        this.ingredients.add(ingredient);
        this.price += ingredient.getPrice();
    }
    public void removeIngredient(Ingredients ingredient){
        this.ingredients.remove(ingredient);
        if(this.price >= 85){
        this.price -= 10;
        }
    }

    @Override
    public String toString() {
       
        return this.name + " " + this.price +":-";
    }
}
