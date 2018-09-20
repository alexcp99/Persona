package coordenadas_geograficas.example.com.persona;

import java.util.ArrayList;

public class Persona {

    //-----------------------------------------------------//
    //-----------------------------------------------------//
                    //Declarar Variables//
    //-----------------------------------------------------//
    //-----------------------------------------------------//


    private String nombre;
    private String apellido;
    private int dni;

    private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();

    //-----------------------------------------------------//
    //-----------------------------------------------------//
                    //Creacion Constructor//
    //-----------------------------------------------------//
    //-----------------------------------------------------//


    public Persona(int dni, String nom, String ape){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //-----------------------------------------------------//
    //-----------------------------------------------------//

    public void anyadir(Telefono t){
        this.telefonos.add(t);
    }




}

