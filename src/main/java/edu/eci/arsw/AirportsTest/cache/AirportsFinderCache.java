package edu.eci.arsw.AirportsTest.cache;

public interface AirportsFinderCache {
    public void save (String name, String json);
    public boolean isSave(String name);
    public boolean isAlive(String name);
    public String load(String name);
}