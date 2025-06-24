package com.xworkz.tommy.runner;

import com.xworkz.tommy.dto.SareeDTO;

import java.util.ArrayList;
import java.util.Collection;

public class SareeRunner {

    public static void main(String[] args) {

        //create

        SareeDTO sareeDTO1=new SareeDTO("Marriage","Green",25000,"Silk");
        SareeDTO sareeDTO2 =new SareeDTO("Engagement","Red", 30000, "Mysore Silk");
        SareeDTO sareeDTO3 =new SareeDTO("Party","Black", 2000, "Georgette");
        SareeDTO sareeDTO4 =new SareeDTO("Office","Blue", 1000, "Cotton");
        SareeDTO sareeDTO5 =new SareeDTO("Farewell","Orange", 1500, "Chiffon");
        SareeDTO sareeDTO6 =new SareeDTO("Birthday","Pink", 2500, "Organza");
        SareeDTO sareeDTO7 =new SareeDTO("Funeral","White", 500, "Cotton");
        SareeDTO sareeDTO8 =new SareeDTO("Pooja","Yellow", 5000, "Linen");
        SareeDTO sareeDTO9 =new SareeDTO("Mehendi","Green", 7000, "Satin");
        SareeDTO sareeDTO10 =new SareeDTO("Cocktail","Violet", 10500, "Net");
        SareeDTO sareeDTO11 =new SareeDTO("Reception","Maroon", 20000, "Crepe");

//not fixed in size
        Collection<SareeDTO> collection=new ArrayList<>();
        collection.add(sareeDTO2);
        collection.add(sareeDTO4);
        collection.add(sareeDTO10);
        collection.add(sareeDTO9);
        collection.add(sareeDTO1);
        collection.add(sareeDTO8);
        collection.add(sareeDTO5);
        collection.add(sareeDTO6);
        collection.add(sareeDTO7);
        collection.add(sareeDTO11);
        collection.add(sareeDTO3);
        collection.add(sareeDTO3);


        for(SareeDTO sareeDTO:collection)
        {
            System.out.println(sareeDTO.getMaterial() +" ,"+sareeDTO.getColor()+","+sareeDTO.getOccasionType() +","+sareeDTO.getPrice());
        }
    }
}
