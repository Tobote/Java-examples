package US;

/**
 *
 * @author Ivan
 */
public interface Usuario {

    String dni = "";
    String nombre = "";

    void conexion(int s); //Contabiliza ‘s’ segundos en la cuenta

    double importe(); //Calcula el importe facturable

    void reset(); //Pone a cero la cuenta
}
