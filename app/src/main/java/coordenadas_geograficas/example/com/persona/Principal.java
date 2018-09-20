package coordenadas_geograficas.example.com.persona;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {

    public static void main (String args[]) {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        personas.add(new Persona(29180796, "Alex", "Cebolla"));

        personas.get(0).anyadir(new Telefono("Movil", 722105575));
        personas.get(0).anyadir(new Telefono("Trabajo", 654321234));

        //Buscar una persona dado el nombre
        Persona p =buscar(personas, "Alex");

        //Mostrar todos los telefonos d euna persona
        p.mostrarTelefonos();

    }

    public static Persona buscar (ArrayList<Persona> personas,String nombre) {

    }
}
