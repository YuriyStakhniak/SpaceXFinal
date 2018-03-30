package main.java.cabin;


public enum CabinModels {

    CAB1(1, "cab1", 5, 4, 5, 1),
    CAB2(2, "cab2", 6, 5, 6, 2),
    CAB3(3, "cab3", 7, 6, 7, 3),
    CAB4(4, "cab4", 8, 6, 8, 4),
    CAB5(5, "cab5", 9, 7, 9, 5);

    private String name;
    private int id;
    private int height;
    private int width;
    private int weight;
    private int capacity;

    CabinModels(int id, String name, int height, int width, int weight, int capacity) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
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
