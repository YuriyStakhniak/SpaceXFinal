package main.java.util;


import main.java.cabin.Cabin;
import main.java.cabin.CabinModels;
import main.java.cabin.SpaceXCabin;
import main.java.engine.Engine;
import main.java.engine.EngineModels;
import main.java.fueltank.FuelTank;
import main.java.fueltank.FuelTankModels;
import main.java.planet.Planets;

public class AppMenu {

    private AppMenu() throws IllegalStateException {
        throw new IllegalStateException("Can't create instance of InputDataUtil");
    }

    public static Planets inputPlanet() {
        System.out.println("Where you want to go? Mars or Moon");
        while (true) {
            String planetName = ScannerUtil.getString();
            for (Planets planet : Planets.values()) {
                if (planetName.equalsIgnoreCase(planet.getPlanetName())) {
                    System.out.println(planet);
                    return planet;
                }
            }
            System.out.println("Sorry, only Mars or Moon");
        }
    }

    public static Cabin inputCabin() {
        System.out.println("We have several cabins for your rocket:\ncab1, cab2, cab3, cab4, cab5 " +
                "\n Choose one you want ");
        while (true) {
            String cabinName = ScannerUtil.getString();
            for (CabinModels cabin : CabinModels.values()) {
                if (cabinName.equalsIgnoreCase(cabin.getName())) {
                    System.out.println(cabin);
                    return new SpaceXCabin(cabin);
                }
            }
            System.out.println("Invalid input. Please try again");
        }
    }

    private static FuelTankModels inputFuelTank() {
        System.out.println("We have several fuel tanks for your rocket:\n " +
                "fuel tank1, fuel tank2, fuel tank3, fuel tank4, fuel tank5");
        while (true) {
            String fuelTankName = ScannerUtil.getString();
            for (FuelTankModels fuelTank : FuelTankModels.values()) {
                if (fuelTankName.equalsIgnoreCase(fuelTank.getName())); {
                    System.out.println(fuelTank);
                    return fuelTank;
                }
            }
            System.out.println("Invalid input. Please try again");
        }
    }

    public static EngineModels inputEngine() {
        System.out.println("We have several engines for your rocket:\n engine1, engine2, engine3" +
                ", engine4, engine5");
        while (true) {
            String engineName = ScannerUtil.getString();
            for (EngineModels engine : EngineModels.values()) {
                if (engineName.equalsIgnoreCase(engine.getName())) {
                    System.out.println(engine);
                    return engine;
                }
            }
            System.out.println("Invalid input. Please try again");
        }
    }

    public static FuelTankModels checkFuelTank(EngineModels engine) {
        while (true) {
            FuelTankModels fuelTank = inputFuelTank();
            if (engine.getEngineSize() > fuelTank.getFuelTankSpace()) {
                return fuelTank;
            } else {
                System.out.println("You choice to large fuel tank. Please choice another fuel tank.\n");
            }
        }
    }

    public static int inputNumberOfEngines() {
        System.out.println("Enter number of engines. You can not enter less then 3 engine and not more then 5");
        int numberOfEngines = ScannerUtil.getInt();
        while (true) {
            if (numberOfEngines >= 3 && numberOfEngines <= 5) {
                return numberOfEngines;
            } else {
                System.out.println("Enter not less then 3 engine and not more then 5");
                numberOfEngines = ScannerUtil.getInt();
                System.out.println(numberOfEngines);
            }
        }
    }
}
