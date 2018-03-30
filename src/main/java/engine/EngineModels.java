package main.java.engine;


public enum EngineModels {

    ENGINE1("engine1", 2, 1, 35, 100, 1000, 55, 10, 45),
    ENGINE2("engine2", 3, 2, 50, 150, 1500, 65, 9, 40),
    ENGINE3("engine3", 4, 3, 65, 200, 2000, 75, 8, 35),
    ENGINE4("engine4", 5, 4, 70, 250, 2500, 85, 7, 30),
    ENGINE5("engine4", 6, 5, 75, 300, 3000, 85, 6, 25);

    private String name;
    private int height, width, weigh, fuelConsumption, fuelTankSpace,
            power, timeToOrbitalSpeed, timeToEscapeVelocity;


    EngineModels(String name, int height, int width, int weigh, int fuelConsumption,
                 int fuelTankSpace, int power, int timeToOrbitalSpeed, int timeToEscapeVelocity) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.weigh = weigh;
        this.fuelConsumption = fuelConsumption;
        this.fuelTankSpace = fuelTankSpace;
        this.power = power;
        this.timeToOrbitalSpeed = timeToOrbitalSpeed;
        this.timeToEscapeVelocity = timeToEscapeVelocity;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getWeigh() {
        return weigh;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getFuelTankSpace() {
        return fuelTankSpace;
    }

    public int getPower() {
        return power;
    }

   public int getEngineSize (){return height*width;}
}
