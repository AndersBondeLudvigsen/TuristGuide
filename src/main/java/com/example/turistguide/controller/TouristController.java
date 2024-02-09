package com.example.turistguide.controller;

import com.example.turistguide.model.TouristAttraction;
import com.example.turistguide.service.TouristService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("attractions")
public class TouristController {
    TouristService touristService;

    public TouristController() {
        touristService = new TouristService();
    }

    @GetMapping("welcome/delete/{name}")
    public ResponseEntity<TouristAttraction> deleteAttraction(@PathVariable String name) {
        TouristAttraction touristAttractionDelete = touristService.deleteTouristAttraction(name);
        return new ResponseEntity<TouristAttraction>(touristAttractionDelete, HttpStatus.OK);
    }

    @GetMapping("welcome/{name}")
    public ResponseEntity<TouristAttraction> getTouristAttraction(@PathVariable String name){
        TouristAttraction touristAttraction = touristService.getTouristAttraction(name);
        return new ResponseEntity<TouristAttraction>(touristAttraction, HttpStatus.OK);
    }

    @GetMapping(path = "welcome")
    public ResponseEntity<List<TouristAttraction>> getTouristAttractions() {
        List messageList = touristService.getTouristAttractions();
        return new ResponseEntity<List<TouristAttraction>>(messageList, HttpStatus.OK);
    }

    @PostMapping("welcome/add")
    public ResponseEntity<TouristAttraction> postAttraction(@RequestBody TouristAttraction touristAttraction) {
        TouristAttraction returnTouristAttraction = touristService.createTouristAttraction(touristAttraction);
        return new ResponseEntity<TouristAttraction>(returnTouristAttraction, HttpStatus.OK);

    }

    @PutMapping("welcome/change")
    public ResponseEntity<TouristAttraction> putTouristAttraction(@RequestBody TouristAttraction touristAttraction) {
        TouristAttraction returnTouristAttraction = touristService.changeTouristAttraction(touristAttraction);
        if (returnTouristAttraction != null) {
            return new ResponseEntity<TouristAttraction>(returnTouristAttraction, HttpStatus.OK);
        } else
            return new ResponseEntity<TouristAttraction>(new TouristAttraction("Name not found", "Description not found"), HttpStatus.NOT_FOUND);
    }


}
