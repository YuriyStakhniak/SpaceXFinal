package main.java.engine;


import main.java.fueltank.FuelTankModels;

public class SpaceXEngine implements Engine {

    private String name;
    private int height, width, weight, fuelConsumption, fuelTankSpace, power;

    public SpaceXEngine(EngineModels engineModels, FuelTankModels fuelTankModels) {
        this.name = engineModels.getName();
        this.height = engineModels.getHeight();
        this.width = engineModels.getWidth();
        this.weight = engineModels.getWeigh()+fuelTankModels.getWeight();
        this.fuelConsumption = engineModels.getFuelConsumption();
        this.fuelTankSpace = engineModels.getFuelTankSpace();
        this.power = engineModels.getPower();
    }

    @Override
    public int getEngineSize() {
        return 0;
    }

    @Override
    public int getEngineTotalWeight() {
        return 0;
    }

    @Override
    public int getEnginePower() {
        return 0;
    }

    @Override
    public int getFuelTankSpace() {
        return 0;
    }
}
