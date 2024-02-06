package com.example.turistguide.repository;

import com.example.turistguide.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class TouristRepository {
    private ArrayList<TouristAttraction> touristAttractions;

    public TouristRepository() {
        touristAttractions = new ArrayList<>();
        TouristAttraction touristAttraction1 = new TouristAttraction("Brøndby Stadion", "God stemning og gode pølser");
        TouristAttraction touristAttraction2 = new TouristAttraction("Nature Energy Park", "OBs Stadion. God pølsemix. Forvent sure fans");
        TouristAttraction touristAttraction3 = new TouristAttraction("Parken", "Største danske fodboldstadion, Tag kun derind når Danmarks landshold spiller");
        TouristAttraction touristAttraction4 = new TouristAttraction("Right to dream park", "Ingen fans, men okay fodbold");
        touristAttractions.add(touristAttraction1);
        touristAttractions.add(touristAttraction2);
        touristAttractions.add(touristAttraction3);
        touristAttractions.add(touristAttraction4);
    }

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

    public void deleteTouristAttraction(TouristAttraction touristAttractionDelete) {

        for (TouristAttraction touristAttraction: touristAttractions) {
            if (touristAttraction.equals(touristAttractionDelete)){
                touristAttractions.remove(touristAttraction);
            }
        }
    }

    public ArrayList<TouristAttraction> getTouristAttractions(){
        return touristAttractions;
    }


}

