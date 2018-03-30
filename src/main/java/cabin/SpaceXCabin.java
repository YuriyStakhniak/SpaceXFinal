package main.java.cabin;

public class SpaceXCabin implements Cabin {

    private String name;
    private int height;
    private int width;
    private int weight;
    private int capacity;

    public SpaceXCabin(CabinModels cabinModels) {

        this.name = cabinModels.getName();
        this.height = cabinModels.getHeight();
        this.width = cabinModels.getWidth();
        this.weight = cabinModels.getWeight();
        this.capacity = cabinModels.getCapacity();
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

}
