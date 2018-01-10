/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_prog_01;

import javax.swing.JOptionPane;

/**
 *
 * @author Paredes
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean band = true;
        String menu = "1 - Agregar Profesor\n2 - Ver Lista\n3 - Salir";
        String menu2 = "1 - Timepo Completo\n2 - Medio Tiempo\n3 - Tiempo Parcial";
        ListaProfesores lp = new ListaProfesores();
        do {
            int opc = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "MENU", JOptionPane.INFORMATION_MESSAGE));
            switch (opc) {
                case 1://Agregar
                    int opc2 = Integer.parseInt(JOptionPane.showInputDialog(null, menu2, "MENU", JOptionPane.INFORMATION_MESSAGE));
                    switch (opc2) {
                        case 1:
                            proTiempoCompleto(lp);
                            break;
                        case 2:
                            proMedioTiempo(lp);
                            break;
                        case 3:
                            proTiempoParcial(lp);
                            break;
                        default:
                    }
                    lp.grabar();
                    break;
                case 2://Ver lista
                    lp.listar();
                    break;
                case 3://Salir
                    band = false;
                    break;
                default:
            }
        } while (band);
    }

    public static void proTiempoParcial(ListaProfesores lp) {
        String cedula = JOptionPane.showInputDialog("Ingresar número de cédula del nuevo profesor");
        String nombre = JOptionPane.showInputDialog("Ingresar nombre del nuevo profesor");
        String apellido = JOptionPane.showInputDialog("Ingresar apellido del nuevo profesor");
        int horasclase = Integer.parseInt(JOptionPane.showInputDialog("Ingresar número de horas de clase del nuevo profesor"));
        if (!(horasclase >= 2 && horasclase <= 9)) {
            JOptionPane.showMessageDialog(null, "Ingresar entre 2 y 9 horas de clase");
            horasclase = Integer.parseInt(JOptionPane.showInputDialog("Ingresar número de horas de clase del nuevo profesor"));
        }
        String carrera = JOptionPane.showInputDialog("Ingresar el nombre de la carrera del nuevo profesor");
        int horasSemanales = Integer.parseInt(JOptionPane.showInputDialog("Ingresar número de horas semanales del nuevo profesor"));
        ProfesorTiempoParcial pt = new ProfesorTiempoParcial(horasSemanales, cedula, nombre, apellido, horasclase, carrera);
        lp.agregar(pt);
    }

    public static void proMedioTiempo(ListaProfesores lp) {
        String cedula = JOptionPane.showInputDialog("Ingresar número de cédula del nuevo profesor");
        String nombre = JOptionPane.showInputDialog("Ingresar nombre del nuevo profesor");
        String apellido = JOptionPane.showInputDialog("Ingresar apellido del nuevo profesor");
        int horasclase = Integer.parseInt(JOptionPane.showInputDialog("Ingresar número de horas de clase del nuevo profesor"));
        if (!(horasclase >= 2 && horasclase <= 4)) {
            JOptionPane.showMessageDialog(null, "Ingresar entre 2 y 4 horas de clase");
            horasclase = Integer.parseInt(JOptionPane.showInputDialog("Ingresar número de horas de clase del nuevo profesor"));
        }
        String carrera = JOptionPane.showInputDialog("Ingresar el nombre de la carrera del nuevo profesor");
        ProfesorMedioTiempo pmt = new ProfesorMedioTiempo(cedula, nombre, apellido, horasclase, carrera);
        lp.agregar(pmt);
    }

    public static void proTiempoCompleto(ListaProfesores lp) {
        String cedula = JOptionPane.showInputDialog("Ingresar número de cédula del nuevo profesor");
        String nombre = JOptionPane.showInputDialog("Ingresar nombre del nuevo profesor");
        String apellido = JOptionPane.showInputDialog("Ingresar apellido del nuevo profesor");
        int horasclase = Integer.parseInt(JOptionPane.showInputDialog("Ingresar número de horas de clase del nuevo profesor"));
        if (!(horasclase >= 3 && horasclase <= 16)) {
            JOptionPane.showMessageDialog(null, "Ingresar entre 3 y 16 horas de clase");
            horasclase = Integer.parseInt(JOptionPane.showInputDialog("Ingresar número de horas de clase del nuevo profesor"));
        }
        String carrera = JOptionPane.showInputDialog("Ingresar el nombre de la carrera del nuevo profesor");
        ProfesorTiempoCompleto ptc = new ProfesorTiempoCompleto(cedula, nombre, apellido, horasclase, carrera);
        lp.agregar(ptc);
    }
}
