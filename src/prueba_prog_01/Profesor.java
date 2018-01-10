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
public abstract class Profesor {
    
    private String cedula;
    private String nombre;
    private String apellido;
    private int horasClase;
    private String carrera;

    public Profesor(String cedula, String nombre, String apellido, int horasClase, String carrera) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasClase = horasClase;
        this.carrera = carrera;
    }
    
    
    public abstract int horasComplementarias();

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
