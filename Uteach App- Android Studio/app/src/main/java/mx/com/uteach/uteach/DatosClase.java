package mx.com.uteach.uteach;

/**
 * Created by eloy2311 on 07/04/2020.
 */

public class DatosClase {
    private static int id;
    private static String nombre;
    private static String descripcion;
    private static String precio;
    private static String tipo;
    private static String objetivo;
    private static String cantidad;
    private  static String imagen;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        DatosClase.id = id;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        DatosClase.nombre = nombre;
    }

    public static String getDescripcion() {
        return descripcion;
    }

    public static void setDescripcion(String descripcion) {
        DatosClase.descripcion = descripcion;
    }

    public static String getPrecio() {
        return precio;
    }

    public static void setPrecio(String precio) {
        DatosClase.precio = precio;
    }

    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        DatosClase.tipo = tipo;
    }

    public static String getObjetivo() {
        return objetivo;
    }

    public static void setObjetivo(String objetivo) {
        DatosClase.objetivo = objetivo;
    }

    public static String getCantidad() {
        return cantidad;
    }

    public static void setCantidad(String cantidad) {
        DatosClase.cantidad = cantidad;
    }

    public static String getImagen() {
        return imagen;
    }

    public static void setImagen(String imagen) {
        DatosClase.imagen = imagen;
    }
}
