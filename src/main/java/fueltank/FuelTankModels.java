package main.java.fueltank;

public enum FuelTankModels {
        FUEL_TANK1("fuel tank1", 1, 2, 3, 100),
        FUEL_TANK2("fuel tank2", 2, 3, 4, 200),
        FUEL_TANK3("fuel tank3", 3, 4, 5, 300),
        FUEL_TANK4("fuel tank4", 4, 5, 6, 400),
        FUEL_TANK5("fuel tank5", 5, 6, 7, 500);

        private String name;
        private int height, weight, width, capacity;

        FuelTankModels(String name, int height, int weight, int width, int capacity) {
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.width = width;
            this.capacity = capacity;
        }

        public String getName() {return name;}
        public int getHeight() {return height;}
        public int getWeight() {return weight;}
        public int getWidth() {return width;}
        public int getCapacity() {return capacity;}
        public int getFuelTankSpace(){return height*width;}
}
