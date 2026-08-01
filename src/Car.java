public class Car extends Person {
    String carColor,carBrand,carType;
    public Car(String name, int age, String sex, String job, String carColor, String carBrand, String carType) {
        super(name, age, sex, job);
        this.carColor = carColor;
        this.carBrand = carBrand;
        this.carType = carType;
    }
    public String getCarColor() {
        return carColor;
    }
    public String getCarBrand() {
        return carBrand;
    }
    public String getCarType() {
        return carType;
    }
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Car Color: " + carColor + "\n" +
                "Car Brand: " + carBrand + "\n" +
                "Car Type: " + carType;
    }
}
