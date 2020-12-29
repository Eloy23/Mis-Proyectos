package mx.com.uteach.uteach;

/**
 * Created by eloy2311 on 19/01/2020.
 */

public class User {
    private int id;
    private String user,pass;
    private static String nombre;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        User.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}



