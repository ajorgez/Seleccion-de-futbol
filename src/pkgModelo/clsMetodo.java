/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModelo;

import pkgVista.frmFormulario;
import com.toedter.calendar.JCalendar;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import pkgVista.frmBuscar;
import pkgVista.frmEditar;
import pkgVista.frmPrincipal;

/**
 *
 * @author Richard
 */
public class clsMetodo {

    private static clsMetodo instancia;
    private boolean ok;
    private int autoId;

    public static clsMetodo getInstance() {
        if (instancia == null) {
            instancia = new clsMetodo();
        }
        return instancia;
    }

    public clsMetodo() {
        this.autoId = autoId;
    }

    public int getAutoId() {
        return autoId;
    }

    public void setAutoId(int autoId) {
        this.autoId = autoId;
    }

    public int sumaId() {

        for (clsSeleccionFutbol persona : frmPrincipal.SeleccionFutbol) {
            int tmp = Integer.parseInt(persona.getId());
            if (tmp >= getAutoId()) {
                setAutoId(getAutoId() + 1);
            }
        }
        return getAutoId();
    }

    public void Limpiar() {
        pkgVista.frmFormulario formulario = frmFormulario.getInstance();

        formulario.txtNombre.setText(null);
        formulario.txtApellido.setText(null);
        formulario.jcFecha.setDate(null);


        /*for (Component campo : formulario.pnlInicial.getComponents()) {
         if (campo instanceof JTextField) {
         ((JTextComponent) campo).setText(null);
         }
         formulario.jcFecha.setDate(null);
         }*/
        for (Component campo : formulario.pnlFutbolista.getComponents()) {
            if (campo instanceof JTextField) {
                ((JTextComponent) campo).setText(null);
            }

        }

        for (Component campo : formulario.pnlEntrenador.getComponents()) {
            if (campo instanceof JTextField) {
                ((JTextComponent) campo).setText(null);
            }

        }

        for (Component campo : formulario.pnlMasajista.getComponents()) {
            if (campo instanceof JTextField) {
                ((JTextComponent) campo).setText(null);
            }

        }
    }

    private void ColorInicial() {
        pkgVista.frmFormulario formulario = frmFormulario.getInstance();

        for (Component campo : formulario.pnlInicial.getComponents()) {
            if (campo instanceof JLabel) {
                ((JLabel) campo).setForeground(Color.black);
            } else if (campo instanceof JCalendar) {
                ((JCalendar) campo).setForeground(Color.black);
            }
        }

        for (Component campo : formulario.pnlFutbolista.getComponents()) {
            if (campo instanceof JLabel) {
                ((JLabel) campo).setForeground(Color.black);
            }
        }

        for (Component campo : formulario.pnlEntrenador.getComponents()) {
            if (campo instanceof JLabel) {
                ((JLabel) campo).setForeground(Color.black);
            }
        }

        for (Component campo : formulario.pnlMasajista.getComponents()) {
            if (campo instanceof JLabel) {
                ((JLabel) campo).setForeground(Color.black);
            }
        }
    }

    public boolean CheckFormulario() {
        pkgVista.frmFormulario formulario = frmFormulario.getInstance();

        ok = false;
        ColorInicial();

        if (formulario.txtId.getText().equals("")) {
            formulario.lblId.setForeground(Color.red);
            ok = false;
        } else if (formulario.txtNombre.getText().equals("")) {
            formulario.lblNombre.setForeground(Color.red);
            ok = false;
        } else if (formulario.txtApellido.getText().equals("")) {
            formulario.lblApellido.setForeground(Color.red);
            ok = false;
        } else if (formulario.jcFecha.getDate() == null) {
            formulario.lblFecha.setForeground(Color.red);
            ok = false;
        } else {
            ok = true;
        }
        return ok;

    }

    public boolean CheckEditar() {
        pkgVista.frmEditar editar = frmEditar.getInstance();

        ok = false;
        ColorInicial();

        if (editar.txtId.getText().equals("")) {
            editar.lblId.setForeground(Color.red);
            ok = false;
        } else if (editar.txtNombre.getText().equals("")) {
            editar.lblNombre.setForeground(Color.red);
            ok = false;
        } else if (editar.txtApellido.getText().equals("")) {
            editar.lblApellido.setForeground(Color.red);
            ok = false;
        } else if (editar.jcFecha.getDate() == null) {
            editar.lblFecha.setForeground(Color.red);
            ok = false;
        } else {
            ok = true;
        }
        return ok;

    }

    public boolean CheckFutbolista() {
        pkgVista.frmFormulario formulario = frmFormulario.getInstance();

        ok = false;
        ColorInicial();

        if (formulario.txtDorsal.getText().equals("")) {
            formulario.lblDorsal.setForeground(Color.red);
            ok = false;
        } else if (formulario.txtDemarcion.getText().equals("")) {
            formulario.lblDemarcion.setForeground(Color.red);
            ok = false;
        } else {
            ok = true;
        }
        return ok;

    }

    public boolean CheckEditarFutbolista() {
        pkgVista.frmEditar editar = frmEditar.getInstance();

        ok = false;
        ColorInicial();

        if (editar.txtDorsal.getText().equals("")) {
            editar.lblDorsal.setForeground(Color.red);
            ok = false;
        } else if (editar.txtDemarcion.getText().equals("")) {
            editar.lblDemarcion.setForeground(Color.red);
            ok = false;
        } else {
            ok = true;
        }
        return ok;

    }

    public boolean CheckEntrenador() {
        pkgVista.frmFormulario formulario = frmFormulario.getInstance();

        ok = false;
        ColorInicial();

        if (formulario.txtFederacion.getText().equals("")) {
            formulario.lblFederacion.setForeground(Color.red);
            ok = false;
        } else {
            ok = true;
        }
        return ok;

    }

    public boolean CheckEditarEntrenador() {
        pkgVista.frmFormulario formulario = frmFormulario.getInstance();

        ok = false;
        ColorInicial();

        if (formulario.txtFederacion.getText().equals("")) {
            formulario.lblFederacion.setForeground(Color.red);
            ok = false;
        } else {
            ok = true;
        }
        return ok;

    }

    public boolean CheckMasajista() {
        pkgVista.frmFormulario formulario = frmFormulario.getInstance();

        ok = false;
        ColorInicial();

        if (formulario.txtTitulacion.getText().equals("")) {
            formulario.lblTitulacion.setForeground(Color.red);
            ok = false;
        } else if (formulario.txtExperiencia.getText().equals("")) {
            formulario.lblExperiencia.setForeground(Color.red);
            ok = false;
        } else {
            ok = true;
        }
        return ok;

    }

    public boolean CheckEditarMasajista() {
        pkgVista.frmEditar editar = frmEditar.getInstance();

        ok = false;
        ColorInicial();

        if (editar.txtTitulacion.getText().equals("")) {
            editar.lblTitulacion.setForeground(Color.red);
            ok = false;
        } else if (editar.txtExperiencia.getText().equals("")) {
            editar.lblExperiencia.setForeground(Color.red);
            ok = false;
        } else {
            ok = true;
        }
        return ok;

    }

    public javax.swing.DefaultListModel Listar() {
        javax.swing.DefaultListModel modelo;
        modelo = new javax.swing.DefaultListModel<>();

        for (clsSeleccionFutbol contActual : frmPrincipal.SeleccionFutbol) {
            modelo.addElement(contActual.getId() + " - " + contActual.getNombre() + " - " + contActual.getApellido() + " - " + contActual.getTipo());
        }
        return modelo;
    }

    public javax.swing.DefaultComboBoxModel Buscar() {
        javax.swing.DefaultComboBoxModel modelo;
        modelo = new javax.swing.DefaultComboBoxModel<>();

        for (clsSeleccionFutbol contActual : frmPrincipal.SeleccionFutbol) {
            modelo.addElement(contActual.getTipo() + " - " + contActual.getNombre() + " - " + contActual.getApellido());
        }
        return modelo;
    }

    public javax.swing.DefaultListModel ListarFutbolista() {
        javax.swing.DefaultListModel modelo;
        modelo = new javax.swing.DefaultListModel<>();

        for (clsSeleccionFutbol contActual : frmPrincipal.SeleccionFutbol) {
            if (contActual.getTipo().equals("Futbolista")) {
                modelo.addElement(contActual.getTipo() + " - " + contActual.getNombre() + " - " + contActual.getApellido());
            }
        }
        return modelo;
    }

    public javax.swing.DefaultListModel ListarEntrenador() {
        javax.swing.DefaultListModel modelo;
        modelo = new javax.swing.DefaultListModel<>();

        for (clsSeleccionFutbol contActual : frmPrincipal.SeleccionFutbol) {
            if (contActual.getTipo().equals("Entrenador")) {
                modelo.addElement(contActual.getTipo() + " - " + contActual.getNombre() + " - " + contActual.getApellido());
            }
        }
        return modelo;
    }

    public javax.swing.DefaultListModel ListarMasajista() {
        javax.swing.DefaultListModel modelo;
        modelo = new javax.swing.DefaultListModel<>();

        for (clsSeleccionFutbol contActual : frmPrincipal.SeleccionFutbol) {
            if (contActual.getTipo().equals("Masajista")) {
                modelo.addElement(contActual.getTipo() + " - " + contActual.getNombre() + " - " + contActual.getApellido());
            }
        }
        return modelo;
    }

    public javax.swing.DefaultListModel ListarCoincidencia() {
        frmBuscar buscar = frmBuscar.getInstance();

        javax.swing.DefaultListModel modelo;
        modelo = new javax.swing.DefaultListModel<>();

        for (clsSeleccionFutbol contActual : frmPrincipal.SeleccionFutbol) {
            if (contActual.getApellido().toUpperCase().equals(buscar.txtApellidoBuscar.getText().toUpperCase())) {
                modelo.addElement(contActual.getId() + " - " + contActual.getNombre() + " - " + contActual.getApellido() + " - " + contActual.getTipo());
            }
        }
        return modelo;
    }

    public boolean Array() {
        ok = !frmPrincipal.SeleccionFutbol.isEmpty();
        return ok;
    }

    public void buscarContacto(clsSeleccionFutbol persona) {
        pkgVista.frmEditar editar = frmEditar.getInstance();

        switch (persona.getTipo()) {
            case "Futbolista":
                editar.setTitle("Trabajo");
                editar.tbpEditar.remove(editar.pnlEntrenador);
                editar.tbpEditar.remove(editar.pnlMasajista);
                editar.tbpEditar.add("Futbolista", editar.pnlFutbolista);
                editar.lblEditar.setText("Editar Futbolista");
                editar.tbpEditar.setSelectedIndex(0);
                editar.txtId.setText(persona.getId());
                editar.txtNombre.setText(persona.getNombre());
                editar.txtApellido.setText(persona.getApellido());
                editar.jcFecha.setDate(persona.getEdad());
                editar.txtDorsal.setText(((clsFutbolista) persona).getDorsal());
                editar.txtDemarcion.setText(((clsFutbolista) persona).getDemarcacion());
                break;
            case "Entrenador":
                editar.setTitle("Entrenador");
                editar.tbpEditar.remove(editar.pnlFutbolista);
                editar.tbpEditar.remove(editar.pnlMasajista);
                editar.tbpEditar.add("Entrenador", editar.pnlEntrenador);
                editar.lblEditar.setText("Editar Entrenador");
                editar.tbpEditar.setSelectedIndex(0);
                editar.txtId.setText(persona.getId());
                editar.txtNombre.setText(persona.getNombre());
                editar.txtApellido.setText(persona.getApellido());
                editar.jcFecha.setDate(persona.getEdad());
                editar.txtFederacion.setText(((clsEntrenador) persona).getIdFederacion());
                break;
            case "Masajista":
                editar.setTitle("Masajista");
                editar.tbpEditar.remove(editar.pnlFutbolista);
                editar.tbpEditar.remove(editar.pnlEntrenador);
                editar.tbpEditar.add("Masajista", editar.pnlMasajista);
                editar.tbpEditar.setSelectedIndex(0);
                editar.lblEditar.setText("Editar Masajista");
                editar.txtId.setText(persona.getId());
                editar.txtNombre.setText(persona.getNombre());
                editar.txtApellido.setText(persona.getApellido());
                editar.jcFecha.setDate(persona.getEdad());
                editar.txtTitulacion.setText(((clsMasajista) persona).getTitulacion());
                editar.txtExperiencia.setText(((clsMasajista) persona).getAniosExperiencia());
                break;
        }
    }
}
