package com.example.turistguide.model;

public class TouristAttraction {
    private String name;
    private String description;

    public TouristAttraction(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTouristAttraction(TouristAttraction touristAttraction){
        setName(touristAttraction.getName());
        setDescription(touristAttraction.getDescription());

    }
}