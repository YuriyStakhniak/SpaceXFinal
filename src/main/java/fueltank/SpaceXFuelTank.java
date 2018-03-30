package main.java.fueltank;


public class SpaceXFuelTank implements FuelTank {

    private String name;
    private int height, width, weight, capacity;

    public SpaceXFuelTank(FuelTankModels fuelTankModels) {
        this.name = fuelTankModels.getName();
        this.height = fuelTankModels.getHeight();
        this.width = fuelTankModels.getWidth();
        this.weight = fuelTankModels.getWeight();
        this.capacity = fuelTankModels.getCapacity();
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

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getFuelTankSpace() {
        return this.height*this.width;
    }
}
