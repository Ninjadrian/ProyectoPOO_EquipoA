package colegio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author CesarCuellar
 */
public class Alumno extends Persona{
    private String Genero;
    public Alumno(String Genero, String identificacion, String nombre, String correo) {
        super(identificacion, nombre, correo);
        this.Genero = Genero;
    }   
    public String getGenero() {
        return Genero;
    }
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    @Override
    public String toString() {
        return this.getNombre();
    }  
    
    public void guardar() throws IOException{
        try {                   
            FileWriter fw3 = new FileWriter("alumno.txt");
            PrintWriter salida3 = new PrintWriter(fw3);
            salida3.println("Nombre: "+this.getNombre()+"\n\nIdentificación: "+ this.getIdentificacion());
            salida3.close();    
        } catch (IOException ex) {
            System.out.println(ex.getCause());
        }
    }
}