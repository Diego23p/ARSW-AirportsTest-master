package edu.eci.arsw.AirportsTest.services;

import java.io.IOException;
import java.util.List;

public interface AirpotsFinderServices {
    public String getAirpotsByName(String name) throws IOException;
}