/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_prog_01;

/**
 *
 * @author Paredes
 */
public class ProfesorTiempoParcial extends Profesor{

    int horasSemanales;

    public ProfesorTiempoParcial(int horasSemanales, String cedula, String nombre, String apellido, int horasClase, String carrera) {
        super(cedula, nombre, apellido, horasClase, carrera);
        this.horasSemanales = horasSemanales;
    }

    @Override
    public int horasComplementarias() {
        return this.getHorasClase() - this.horasSemanales;
    }

    @Override
    public String toString() {
        return getCedula() + " | " + getNombre() + " | " + getApellido() + " | " + getCarrera();
    }
    
}
