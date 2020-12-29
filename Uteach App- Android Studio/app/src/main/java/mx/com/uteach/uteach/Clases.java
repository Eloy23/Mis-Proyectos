package mx.com.uteach.uteach;

/**
 * Created by eloy2311 on 27/02/2020.
 */

public class Clases {

    private int id;
    private String nombres;
    private String precios;
    private String imagen;


    public Clases(int id, String nombres, String precios, String imagen) {
        this.id = id;
        this.nombres = nombres;
        this.precios = precios;
        this.imagen = imagen;
    }

    public Clases() {

    }

    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getPrecios() {
        return precios;
    }


    public String getImagen() {
        return imagen;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
