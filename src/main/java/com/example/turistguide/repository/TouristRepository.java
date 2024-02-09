package com.example.turistguide.repository;

import com.example.turistguide.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    private List<TouristAttraction> touristAttractions = new ArrayList<TouristAttraction>(List.of(
            new TouristAttraction("brøndby Stadion", "God stemning og gode pølser"),
            new TouristAttraction("nature Energy Park", "OBs Stadion. God pølsemix. Forvent sure fans"),
            new TouristAttraction("parken", "Største danske fodboldstadion, Tag kun derind når Danmarks landshold spiller"),
            new TouristAttraction("right to dream park", "Ingen fans, men okay fodbold. DÅRLIG BANE"),
            new TouristAttraction("h","h")));

    public TouristAttraction getTouristAttraction(String name){

        for (TouristAttraction touristAttraction: touristAttractions) {
            if (touristAttraction.getName().equals(name)){
                return touristAttraction;
            }
        }
        return null;
    }


    public TouristAttraction updateTouristAttraction(TouristAttraction touristAttractionUpdated){
        int i = 0;
        while (i < touristAttractions.size()){
            if (touristAttractionUpdated.getName().equals(touristAttractions.get(i).getName())) {
                touristAttractions.set(i, touristAttractionUpdated);
                return touristAttractionUpdated;
            }
            i++;
        }
        return null;
    }

    public TouristAttraction addTouristAttraction (TouristAttraction touristAttraction){
                touristAttractions.add(touristAttraction);
                return touristAttraction;
    }

    public TouristAttraction deleteTouristAttraction(String name) {
        int foundIndex = -1;
        TouristAttraction returnTouristAttraction = new TouristAttraction("Not found","Not found");

        for (int i = 0; i< touristAttractions.size(); i++) {
            if (name.equals(touristAttractions.get(i).getName())){
                foundIndex = i;
            }
        }
        if(foundIndex != -1) {
            returnTouristAttraction = touristAttractions.get(foundIndex);
            touristAttractions.remove(foundIndex);
        }
        return returnTouristAttraction;
    }

    public List<TouristAttraction> getTouristAttractions(){
        return touristAttractions;
    }


}

