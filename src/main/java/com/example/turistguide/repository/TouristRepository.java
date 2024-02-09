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


    public void updateTouristAttraction(TouristAttraction touristAttractionUpdated){
        for (TouristAttraction touristAttraction : touristAttractions){
            if (touristAttraction == touristAttractionUpdated){
                touristAttraction.setTouristAttraction(touristAttractionUpdated);

            }
        }
    }

    public void addTouristAttraction (TouristAttraction touristAttraction){
                touristAttractions.add(touristAttraction);
    }

    public TouristAttraction deleteTouristAttraction(String name) {
        int foundIndex = -1;
        TouristAttraction returnTouristAttraction = new TouristAttraction("Not found","Not found");

        for (int i = 0; i< touristAttractions.size(); i++) {
            if (name.equals(touristAttractions.get(i).getName())){
                foundIndex = i;
            }
        }
    }

    public List<TouristAttraction> getTouristAttractions(){
        return touristAttractions;
    }


}

