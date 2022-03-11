package car.rental;

import java.io.*;
import java.util.*;


public class Reader {




    public static void readCustomer (String location) throws IOException {
        //ArrayList<Vivienda> viviendas = new ArrayList <Vivienda>();
        File f = new File(location);
        Scanner clientes = new Scanner(f);
        while (clientes.hasNext()) {
            String name = clientes.next();
            String id = clientes.next();
            //Pasarlo a int
            String credit_card = clientes.next();
            int seniority = clientes.nextInt();
            boolean vip = clientes.nextBoolean();
            if (vip == true) {
                int vip_number = clientes.nextInt();
                System.out.println(name+" "+id+" "+credit_card+" "+seniority+" "+vip+" "+vip_number);
            }
            else{
                System.out.println(name+" "+id+" "+credit_card+" "+seniority+" "+vip);
            }
        }
        clientes.close();
    }
    public static void readVehicle (String location) throws IOException{
         //ArrayList<Vivienda> viviendas = new ArrayList <Vivienda>();
        File f=new File(location);
        Scanner vehicle = new Scanner (f);
        while (vehicle.hasNext()){
            char type=vehicle.next().charAt(0);
            String registration=vehicle.next();
            int miliages=vehicle.nextInt();
            double price_per_day=vehicle.nextDouble();
            String vehicle_name=vehicle.next();
            if (type == 'h'){
                int battery=vehicle.nextInt();
                boolean manual=vehicle.nextBoolean();
                System.out.println(type+" "+registration+" "+miliages+" "+price_per_day+" "+vehicle_name+" "+battery+" "+manual);

            }
            else {

                boolean air_conditioning=vehicle.nextBoolean();
                System.out.println(type+" "+registration+" "+miliages+" "+price_per_day+" "+vehicle_name+" "+" "+air_conditioning);


            }
        }
        vehicle.close();
    }

}
