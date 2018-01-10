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
public class ProfesorMedioTiempo extends Profesor{

    final int horas_semanales = 20;

    public ProfesorMedioTiempo(String cedula, String nombre, String apellido, int horasClase, String carrera) {
        super(cedula, nombre, apellido, horasClase, carrera);
    }

    @Override
    public int horasComplementarias() {
        return this.getHorasClase() - this.horas_semanales;
    }

    public int getHoras_semanales() {
        return horas_semanales;
    }

    @Override
    public String toString() {
        return getCedula() + " | " + getNombre() + " | " + getApellido() + " | " + getCarrera();
    }
    
}
