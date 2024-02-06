package com.example.turistguide.service;

import com.example.turistguide.model.TouristAttraction;
import com.example.turistguide.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TouristService {
    private TouristRepository touristRepository;

    public TouristService(){
        touristRepository = new TouristRepository();
    }


    public TouristAttraction getTouristAttraction(String name){
        return touristRepository.getTouristAttraction(name);
    }


    public void deleteTouristAttraction(TouristAttraction touristAttraction){
        touristRepository.deleteTouristAttraction(touristAttraction);
    }


    public void changeTouristAttraction(TouristAttraction touristAttraction){
        touristRepository.updateTouristAttraction(touristAttraction);
    }


    public void createTouristAttraction(TouristAttraction touristAttraction){
        touristRepository.addTouristAttraction(touristAttraction);
    }

    public ArrayList<TouristAttraction> getTouristAttractions(){
        return touristRepository.getTouristAttractions();
    }
}
