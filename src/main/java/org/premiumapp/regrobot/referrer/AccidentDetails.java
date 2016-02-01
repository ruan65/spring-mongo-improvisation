package org.premiumapp.regrobot.referrer;

import java.util.ArrayList;
import java.util.List;

public class AccidentDetails {

    public String date;
    public String placeInCar;

    public List<String> damages = new ArrayList<>(4);
    public List<String> damageType = new ArrayList<>(3);

    public String description;

    public int numberOfPassengers;

    @Override
    public String toString() {
        return "AccidentDetails{" +
                "date='" + date + '\'' +
                ", placeInCar='" + placeInCar + '\'' +
                ", damages=" + damages +
                ", damageType=" + damageType +
                ", description='" + description + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                '}';
    }
}
