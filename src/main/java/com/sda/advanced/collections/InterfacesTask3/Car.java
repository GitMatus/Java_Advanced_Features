package com.sda.advanced.collections.InterfacesTask3;

public class Car {
    private String carMake;
    private String carType;
    private Engine engine;

    public Car(String carMake, String carModel) {
        this.carMake = carMake;
        this.carType = carModel;
        engine = new Engine();
        engine.setEngine(carType);
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carType;
    }

    public void setCarModel(String carModel) {
        this.carType = carModel;
    }

    class Engine {
        private String engineType;

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }

        public void setEngine(String carType) {
            switch (carType){
                case "luxury" -> this.engineType = "diesel";
                case "economy" -> this.engineType = "electric";
                default -> this.engineType = "petrol";
            }


        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "carMake='" + carMake + '\'' +
                ", carType='" + carType + '\'' +
                ", engine=" + engine +
                '}';
    }
}
