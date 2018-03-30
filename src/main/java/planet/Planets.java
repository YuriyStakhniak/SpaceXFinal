package main.java.planet;


public enum Planets {

    MARS("Mars", 5000), MOON("Moon", 3000);

    private String planetName;
    private int distance;

    Planets(String planetName, int distance) {
        this.planetName = planetName;
        this.distance = distance;
    }

    public String getPlanetName() {
        return this.planetName;
    }

    public long getDistance() {
        return this.distance;
    }

}
