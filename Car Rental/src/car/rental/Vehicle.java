package car.rental;

public class Vehicle {
    private int registration;
    private int milages;
    private int price_per_day;
    private char type;
    private String vehicle_name;

    public Vehicle(int registration, int milages, int price_per_day, char type, String vehicle_name) {
        this.registration = registration;
        this.milages = milages;
        this.price_per_day = price_per_day;
        this.type = type;
        this.vehicle_name = vehicle_name;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public int getMilages() {
        return milages;
    }

    public void setMilages(int milages) {
        this.milages = milages;
    }

    public int getPrice_per_day() {
        return price_per_day;
    }

    public void setPrice_per_day(int price_per_day) {
        this.price_per_day = price_per_day;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getVehicle_name() {
        return vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "registration=" + registration +
                ", milages=" + milages +
                ", price_per_day=" + price_per_day +
                ", type=" + type +
                ", vehicle_name='" + vehicle_name + '\'' +
                '}';
    }
}
