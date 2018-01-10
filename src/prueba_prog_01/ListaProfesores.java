/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_prog_01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Paredes
 */
public class ListaProfesores {

    ArrayList<Profesor> lista = new ArrayList<>();

    public boolean agregar(Profesor prof) {
        return this.lista.add(prof);
    }

    public void grabar() {
        try {
            String aux = "";
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("ListaProfesores.csv"), true));
            for (Profesor profesor : lista) {
                if (profesor instanceof ProfesorMedioTiempo) {
                    aux = "" + profesor.getCedula() + ";" + profesor.getNombre() + ";" + profesor.getApellido() + ";" + "Medio Tiempo;"
                            + profesor.getHorasClase() + ";" + profesor.horasComplementarias();
                    bw.newLine();
                }
                if (profesor instanceof ProfesorTiempoParcial) {
                    aux = "" + profesor.getCedula() + ";" + profesor.getNombre() + ";" + profesor.getApellido() + ";" + "Tiempo Parcial;"
                            + profesor.getHorasClase() + ";" + profesor.horasComplementarias();
                    bw.newLine();
                }
                if (profesor instanceof ProfesorTiempoCompleto) {
                    aux = "" + profesor.getCedula() + ";" + profesor.getNombre() + ";" + profesor.getApellido() + ";" + "Tiempo Completo;"
                            + profesor.getHorasClase() + ";" + profesor.horasComplementarias();
                    bw.newLine();
                }
                bw.write(aux);
                bw.close();
            }
        } catch (IOException e) {
        }
    }
    public void listar(){
        String cad = "LISTA DE PROFESORES\n\n";
        for (Profesor profesor : lista) {
            cad += profesor + "\n";
        }
        JOptionPane.showMessageDialog(null, cad);
    }
}
