package mx.com.uteach.uteach;

/**
 * Created by eloy2311 on 09/03/2020.
 */

public class perfilCl {

    private static int id;

    private static String nombre, edad, apellidos,sexo,imagen;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        perfilCl.id = id;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        perfilCl.nombre = nombre;
    }

    public static String getEdad() {
        return edad;
    }

    public static void setEdad(String edad) {
        perfilCl.edad = edad;
    }

    public static String getApellidos() {
        return apellidos;
    }

    public static void setApellidos(String apellidos) {
        perfilCl.apellidos = apellidos;
    }

    public static String getSexo() {
        return sexo;
    }

    public static void setSexo(String sexo) {
        perfilCl.sexo = sexo;
    }

    public static String getImagen() {
        return imagen;
    }

    public static void setImagen(String imagen) {
        perfilCl.imagen = imagen;
    }
}
