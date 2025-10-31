package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private java.util.List<City> cities;

    /**
     * Constructor for the CustomList.
     * Initializes the list of cities.
     */
    public CustomList() {
        this.cities = new ArrayList<>();
    }

    /**
     * This adds a city to the list.
     * @param city The city to add.
     */
    public void addCity(City city) {
        cities.add(city);
    }

    /**
     * This checks if the list contains a specific city.
     * @param city The city to search for.
     * @return Returns true if the city is in the list, false otherwise.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

} // <-- This is the single, correct closing brace for the CustomList class.
