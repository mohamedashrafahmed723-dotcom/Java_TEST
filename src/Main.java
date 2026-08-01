import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ArrayList<Car> carsList = new ArrayList<>();

        carsList.add(new Car("Mohamed", 24, "Male", "Developer", "Black", "BMW", "Sport"));
        carsList.add(new Car("Ahmed", 28, "Male", "Technical Lead", "White", "Toyota", "SUV"));
        carsList.add(new Car("NUra", 34, "Female", "HR", "Red", "Hyundai", "SIV"));
        System.out.println("ACar Ownr");
        for (Car carOwner : carsList) {
            System.out.println(carOwner);
            System.out.println("------");
        }
        System.out.println("owner name: " + carsList.get(0).getName());
        System.out.println("owner car brand: " + carsList.get(2).getCarBrand());
        carsList.get(0).setJob("junior Oracle Developer ");
        System.out.println("Changed Owner Job: "+carsList.get(0).getJob());
        carsList.get(0).setCarType("Sport");
        System.out.println("Changed Owner colortype: "+carsList.get(0).getCarType());
        System.out.println("------");
        System.out.println(carsList.get(0));
    }
}