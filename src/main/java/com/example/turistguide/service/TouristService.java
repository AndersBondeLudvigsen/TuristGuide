package com.example.turistguide.service;

import com.example.turistguide.model.TouristAttraction;
import com.example.turistguide.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TouristService {
    private TouristRepository touristRepository;

    public TouristService(){
        touristRepository = new TouristRepository();
    }


    public TouristAttraction getTouristAttraction(String name){
        return touristRepository.getTouristAttraction(name);
    }


    public TouristAttraction deleteTouristAttraction(String name){
        TouristAttraction returnTouristAttraction = touristRepository.deleteTouristAttraction(name);
        if (returnTouristAttraction != null){
            return returnTouristAttraction;
        }
        else return new TouristAttraction("NOT FOUND","NOT FOUND");
    }


    public void changeTouristAttraction(TouristAttraction touristAttraction){
        touristRepository.updateTouristAttraction(touristAttraction);
    }


    public void createTouristAttraction(TouristAttraction touristAttraction){
        touristRepository.addTouristAttraction(touristAttraction);
    }

    public List<TouristAttraction> getTouristAttractions(){
        return touristRepository.getTouristAttractions();
    }
}
