package com.example.turistguide.controller;

import com.example.turistguide.service.TouristService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("attractions")
public class TouristController {
    TouristService touristService;

    public TouristController(){
        touristService = new TouristService();
    }






}
