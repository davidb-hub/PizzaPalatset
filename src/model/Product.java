package model;

import java.util.ArrayList;
import java.util.List;

/*
*Singeltonklass som innehåller Listor på alla olika maträtter.
*
*/

public class Product {
    private List<Pizza> pizzaList = new ArrayList<>();
    private List<Pasta> pastaList = new ArrayList<>();
    private List<Drinks> drinksList = new ArrayList<>();
    private List<Sallads> salladList = new ArrayList<>();
    private List<Misc> miscList= new ArrayList<>();
    public static Product instance = new Product();

    private Product(){
        Ingredients mincedMeat = new Ingredients("Minced Meat", 0);
        Ingredients kebabMeat = new Ingredients("Kebab Meat", 0);
        Ingredients pineaple = new Ingredients("Pineaple",0);
        Ingredients chilliPeppers = new Ingredients("Chilli Peppers",0);
        Ingredients onion = new Ingredients("Onion",0);
        Ingredients olives = new Ingredients("Olives",0);
        Ingredients ham = new Ingredients("Ham",0);
        Ingredients kebabSauce = new Ingredients("Kebab Sauce",0);
        Ingredients hotSauce = new Ingredients("Hot Sauce",0);
        
        Pizza vesuvio = new Pizza("Vesuvio", 75);
        vesuvio.addIngredient(ham);
        pizzaList.add(vesuvio);
        Pizza hawaii = new Pizza("Hawaii",75);
        hawaii.addIngredient(ham);
        hawaii.addIngredient(pineaple);
        pizzaList.add(hawaii);
       Pizza kebab = new Pizza("Kebab", 75);
       kebab.addIngredient(kebabMeat);
       kebab.addIngredient(onion);
       kebab.addIngredient(kebabSauce);
       kebab.addIngredient(chilliPeppers);
       pizzaList.add(kebab);
        Pizza margherita = new Pizza("Margherita", 75);
        pizzaList.add(margherita);
        Pizza mexicana = new Pizza("Mexicana", 75);
        mexicana.addIngredient(mincedMeat);
        mexicana.addIngredient(onion);
        mexicana.addIngredient(hotSauce);
        pizzaList.add(mexicana);

        drinksList.add(new Drinks("Fanta Orange", 15));
        drinksList.add(new Drinks("Coca-Cola", 15));
        drinksList.add(new Drinks("Pepsi", 15));
        drinksList.add(new Drinks("Loka Lemon", 15));
        drinksList.add(new Drinks("Sprite", 15));

        salladList.add(new Sallads("Ceasar Sallad", 70));
        salladList.add(new Sallads("Chicken Sallad", 70));
        salladList.add(new Sallads("Shrimp Sallad", 70));
        salladList.add(new Sallads("Ham Sallad", 70));

        pastaList.add(new Pasta("Pasta Bolognese", 100));
        pastaList.add(new Pasta("Pasta Carbonara", 100));
        pastaList.add(new Pasta("Pasta Pollo", 100));

        miscList.add(new Misc("Chili Sauce", 45));
        miscList.add(new Misc("Garlic Sauce", 50));
        miscList.add(new Misc("Garlic Bread", 45));



    }

    public static Product getInstance() {
        return instance;
    }

    public List<Pizza> getPizzaList() {
        return new ArrayList<Pizza>(pizzaList);
    }

    public List<Pasta> getPastaList() {
        return new ArrayList<Pasta>(pastaList);
    }

    public List<Drinks> getDrinksList() {
        return new ArrayList<Drinks>(drinksList);
    }

    public List<Sallads> getSalladList() {
        return new ArrayList<Sallads>(salladList);
    }

    public List<Misc> getMiscList() {
        return new ArrayList<Misc>(miscList);
    }
}
