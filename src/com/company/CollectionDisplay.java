package com.company;

import java.util.ArrayList;

public class CollectionDisplay {

    ArrayList<Collection> collection;

    public CollectionDisplay(){
        collection = new ArrayList<Collection>();
    }

    public  void addCollection(Collection adding){
        this.collection.add(adding);
    }

    public String displayFavorite(){
        String display ="";

        for(Collection col: collection){
            display += col.getBooks() + "||\t\t"+col.getMovie() +"\n";
        }
        return display;

    }
}
