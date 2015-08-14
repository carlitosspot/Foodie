package com.paxtor.foodie;

/**
 * Created by charlie on 8/11/2015.
 */
public class Drink {
    private String name;
    private String description;
    private int imageResoureId;

    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter),
    };

    private Drink(String name, String description, int imageResoureId){
        this.name = name;
        this.description = description;
        this.imageResoureId = imageResoureId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResoureId;
    }

    public String toString(){
        return this.name;
    }
}
