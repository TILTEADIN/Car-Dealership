import java.io.*;
import java.util.*;

/**
 * Clase para la lectura de ficheros clientes y viviendas
 * @author Jesus Fontecha
 *
 */
public class LecturaFichero {


  /**
   * Metodo para leer las viviendas de un fichero
   * @param cadena ruta del fichero
   * @return matriz de viviendas leidas
   * @throws IOException
   */
  public static Vivienda [] leerViviendas (String cadena) throws IOException{
	ArrayList<Vivienda> viviendas = new ArrayList <Vivienda>();
	File f=new File(cadena);
    Scanner nombre_f = new Scanner (f);    
    while (nombre_f.hasNext()){
      char opcion=nombre_f.next().charAt(0);
      String id=nombre_f.next();
      double metros_cuadrados=nombre_f.nextDouble();
      double precio=nombre_f.nextDouble();
      int antiguedad=nombre_f.nextInt();
      String venta_alquiler=nombre_f.next();
      if (opcion=='c'){
        double distancia=nombre_f.nextDouble();
        boolean piscina=nombre_f.nextBoolean();
        viviendas.add(new Chalet(id,metros_cuadrados,precio,antiguedad,venta_alquiler,distancia,piscina));
      }
      else {
        char tipo=nombre_f.next().charAt(0);
        boolean amueblado=nombre_f.nextBoolean();       
        viviendas.add(new PisoCiudad(id,metros_cuadrados,precio,antiguedad,venta_alquiler,tipo,amueblado));
      }
    }
    nombre_f.close();
    return viviendas.toArray(new Vivienda[viviendas.size()]);
  }

  /**
   * Metodo para leer los clientes de un fichero 
   * @param cadena ruta del fichero
   * @return matriz de clientes leidos
   * @throws IOException
   */
  public static Cliente[] leerClientes (String cadena)throws IOException{
	ArrayList<Cliente> clientes = new ArrayList <Cliente>();
    File f=new File(cadena);
    Scanner nombre_f = new Scanner (f);
    while (nombre_f.hasNext()){
      String no=nombre_f.next();
      String dni=nombre_f.next();
      long tar= nombre_f.nextLong();
      boolean joven=nombre_f.nextBoolean();
      if (joven){
        int nc=nombre_f.nextInt();
        clientes.add(new ClienteJoven (no,dni,tar,joven,nc));
      }
      else {
    	clientes.add(new Cliente(no,dni,tar,joven));
      }
    }
    nombre_f.close();
    return clientes.toArray(new Cliente[clientes.size()]);
  }  
}
  
 