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
public class clsEntrenador extends clsSeleccionFutbol {

    private String idFederacion;

    public clsEntrenador() {
    }

    public clsEntrenador(String idFederacion, String id, String nombre, String apellido, Date edad, String tipo) {
        super(id, nombre, apellido, edad, tipo);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

}
