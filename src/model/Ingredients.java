/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Zsombor
 */
public class Ingredients {
    private String name;
    private int price;
    
    public Ingredients(String name,int price){
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    
  
}
