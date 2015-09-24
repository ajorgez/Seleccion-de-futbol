/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModelo;

import java.util.Date;

/**
 *
 * @author Richard
 */
public class clsFutbolista extends clsSeleccionFutbol {

    private String dorsal;
    private String demarcacion;

    public clsFutbolista() {
    }

    public clsFutbolista(String dorsal, String demarcacion, String id, String nombre, String apellido, Date edad, String tipo) {
        super(id, nombre, apellido, edad, tipo);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

}
