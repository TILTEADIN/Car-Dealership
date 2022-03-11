package car.rental;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Reader reader = new Reader();
        try {
            reader.readCustomer("C:\\Users\\eduxe\\Documents\\Programmation\\Clientes.txt");
            reader.readVehicle("C:\\Users\\eduxe\\Documents\\Programmation\\Vehiculos.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
