package com.hfad.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands(String color){
        List<String> brands=new ArrayList<>();
        if(color.equals("amber")){
            brands.add("Jack amber");
            brands.add("Red Moose");
        }
        if (color.equals("light")){
            brands.add("Старый Мельник");
            brands.add("Аливария 10");
        }
        if(color.equals("dark")){
            brands.add("Лидская Аксамитнае");
            brands.add("Аливырия Темное");
        }
        if(color.equals("brown")){
            brands.add("Brown beer");
            brands.add("Кравтовое");
        }
        return brands;
    }

}
