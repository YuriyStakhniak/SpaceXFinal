package main.java.rocket;

import main.java.cabin.Cabin;
import main.java.engine.Engine;
import main.java.engine.EngineModels;
import main.java.engine.SpaceXEngine;
import main.java.fueltank.FuelTankModels;
import main.java.util.AppMenu;


public abstract class AbstractRocket {

    private Cabin cabin;
    private Engine[] engines;

    public AbstractRocket(Cabin cabin, Engine[] engines) {
        this.cabin = cabin;
        this.engines = engines;

    }

    private Engine[] engine (int numberOfEngines){

        Engine engines[] = new Engine[numberOfEngines];
        EngineModels engineModels;
        FuelTankModels fuelTank;

        for (int i = 0; i < numberOfEngines; i++) {
            engineModels = AppMenu.inputEngine();
            fuelTank = AppMenu.checkFuelTank(engineModels);
            engines[i] = new SpaceXEngine(engineModels, fuelTank);
        }
        return engines;
    }

    private int totalRocketWeight() {
        int weight = 0;
        for (Engine engine : this.engines) {
            weight += engine.getEngineTotalWeight();
        }
        return cabin.getWeight() + weight;
    }


    public double calculateFuelConsumption() {
        double totalPower = 0;
        for (Engine engine : this.engines) {
            totalPower += engine.getEnginePower();
        }
        return totalPower / totalRocketWeight();
    }

    public double sumTotalFuelCapacity() {
        double totalFuel = 0;
        for (Engine engine : this.engines) {
            totalFuel += engine.getFuelTankSpace();
        }
        return totalFuel;
    }
}

