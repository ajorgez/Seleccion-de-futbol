/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgExportar;

import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import pkgModelo.clsEntrenador;
import pkgModelo.clsFutbolista;
import pkgModelo.clsMasajista;
import pkgModelo.clsSeleccionFutbol;
import static pkgVista.frmPrincipal.SeleccionFutbol;

/**
 *
 * @author ricardo
 */
public class ModeloExcel {

    Workbook wb;

    public String Exportar(File archivo) {
        String respuesta = "No se realizo con exito la exportación.";
        //int numFila = tablaD.getRowCount(), numColumna = tablaD.getColumnCount();
        if (archivo.getName().endsWith("xls")) {
            wb = new HSSFWorkbook();
        } else {
            wb = new XSSFWorkbook();
        }
        Sheet hoja = wb.createSheet("Pruebita");

        try {
            Row filaTitulos = hoja.createRow(0);
            Cell idTitle = filaTitulos.createCell(0);
            idTitle.setCellValue("ID");
            Cell nombreTitle = filaTitulos.createCell(1);
            nombreTitle.setCellValue("Nombre");
            Cell apellidoTitle = filaTitulos.createCell(2);
            apellidoTitle.setCellValue("Apellido");
            Cell fechaTitle = filaTitulos.createCell(3);
            fechaTitle.setCellValue("Fecha Nacimiento");
//            fechaTitle.setCellFormula("");
            Cell dorsalTitle = filaTitulos.createCell(4);
            dorsalTitle.setCellValue("Dorsal");
            Cell demarcacionTitle = filaTitulos.createCell(5);
            demarcacionTitle.setCellValue("Demarcacion");
            Cell federacionTitle = filaTitulos.createCell(6);
            federacionTitle.setCellValue("ID Federacion");
            Cell titulacionTitle = filaTitulos.createCell(7);
            titulacionTitle.setCellValue("Titulacion");
            Cell experienciaTitle = filaTitulos.createCell(8);
            experienciaTitle.setCellValue("Experiencia");

            int numFila = 1;
            for (clsSeleccionFutbol contActual : SeleccionFutbol) {
                Row fila = hoja.createRow(numFila);
                Cell tipoD = fila.createCell(0);
                hoja.autoSizeColumn(0);
                tipoD.setCellValue(contActual.getTipo());
                Cell Nombre = fila.createCell(1);
                hoja.autoSizeColumn(1);
                Nombre.setCellValue(contActual.getNombre());
                Cell Apellido = fila.createCell(2);
                hoja.autoSizeColumn(2);
                Apellido.setCellValue(contActual.getApellido());
                Cell fecha = fila.createCell(3);
                fecha.setCellValue(contActual.getEdad());
                hoja.autoSizeColumn(3);

                if (contActual instanceof clsFutbolista) {
                    Cell dorsal = fila.createCell(4);
                    dorsal.setCellValue(((clsFutbolista) contActual).getDorsal());
                    hoja.autoSizeColumn(4);
                    Cell demarcacion = fila.createCell(5);
                    demarcacion.setCellValue(((clsFutbolista) contActual).getDemarcacion());
                    hoja.autoSizeColumn(5);

                } else if (contActual instanceof clsEntrenador) {
                    Cell federacion = fila.createCell(6);
                    federacion.setCellValue(((clsEntrenador) contActual).getIdFederacion());
                    hoja.autoSizeColumn(6);

                } else if (contActual instanceof clsMasajista) {
                    Cell titulo = fila.createCell(7);
                    titulo.setCellValue(((clsMasajista) contActual).getTitulacion());
                    hoja.autoSizeColumn(7);
                    Cell experiencia = fila.createCell(8);
                    experiencia.setCellValue(((clsMasajista) contActual).getAniosExperiencia());
                    hoja.autoSizeColumn(8);
                }

                wb.write(new FileOutputStream(archivo));
                numFila++;
            }

            respuesta = "Exportación exitosa.";
        } catch (Exception e) {
        }
        return respuesta;
    }
}
