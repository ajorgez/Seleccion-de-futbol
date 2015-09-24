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
public class clsMasajista extends clsSeleccionFutbol {

    private String titulacion;
    private String aniosExperiencia;

    public clsMasajista() {
    }

    public clsMasajista(String titulacion, String aniosExperiencia, String id, String nombre, String apellido, Date edad, String tipo) {
        super(id, nombre, apellido, edad, tipo);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(String aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

}
