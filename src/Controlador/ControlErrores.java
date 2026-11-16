package Controlador;

import java.time.LocalDate;
/**
 *
 * @author alumno
 */
public class ControlErrores {
    /*public static String validarMatricula(float digitos) {
        
    }*/
    
    public static String validarFecha(LocalDate fecha) {
        if (fecha == null) {
            return "La fecha es obligatoria";
        }
        
        int anio = fecha.compareTo(fecha);
        if (anio < 1990/01/01 || anio > fecha.getDayOfYear()) {
            return "El año debe estar entre 1990 y 2026";
            }
            return null;
        }
    
    public static String validarPrecio(float precio) {
        if (precio > 0 || precio < 150000 ) {
            return "El precio es correcto";
            }
        return null;
        }
}