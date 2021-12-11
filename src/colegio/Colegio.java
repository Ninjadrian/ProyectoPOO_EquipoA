/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author CesarCuellar
 */
public class Colegio {

    /**
	 * este metodo genera nombres con apellidos. El proceso es aleatorio. Cada vez
	 * que se corra el programa mostrara nombres diferentes.
	 * 
	 * @param cantidad
	 *            Cantidad de nombres que se quieren generar.
	 * @return un arreglo de String con los nombres y apellidos generados. El
	 *         formato de salida es: Nombre Apellido
	 */
	public static String[] generarNombresAleatorios(int cantidad) {
		String[] nombresAleatorios = new String[cantidad];

		String[] nombres = { "Andres","Angel","Amy","Alondra","Alison","Adrian", "David","Brenda", "Berenice", "Braulio", "Brayan", "Carmen", "Carlos", "Charlie","Caridad",
				"David", "Dana", "Diana", "Daniel", "Dayana", "Emiliano", "Elizabeth", "Emily", "Eduardo", "Emir", "Fausto","Fabiola","Isabela","Ian","Gabriela","Hugo",
				"Johana", "Joaquin", "Lalo","Mauricio","Maria","Mia","Omar", "Olivia", "Pablo", "Paulina", "Paola", "Ramon", "Rita", "Romina", "Susana", "Simon", "Samantha","Yahel", "Yamina"};
		String[] apellidos = {"Avalos","Arellano","Arreola","Atonal","Alvarez","Arias","Ballesteros", "Briseño", "Baena", "Baez", "Calderon", "Castilla", "Cabello","Calleja",
				"Duran", "Duval", "Diaz", "Domínguez", "Dayana", "De La Rosa", "Escalante", "Espinosa", "Eslava", "Estrada", "Flores","Franco","Iglesias","Gomez","Gonzalez","Huerta","Garcia",
				"Hernandez", "Lazcano","Lopez", "Martinez","Macias","Morales","Monroy", "Ochoa", "Parra", "Pascual", "Peña", "Pardo","Rangel", "Ramos", "Rivera", "Suarez", "Soto", "Sosa","Tapia",
                                "Torres","Urbina","Valencia","Vallejo","Varela","Vargas","Vega", "Yamamoto"};
 

		for (int i = 0; i < cantidad; i++) {
			nombresAleatorios[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "
					+ apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))] + " " + apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
		}
		return nombresAleatorios;
	}

	/**
	 * Imprime un arreglo de String
	 * 
	 * @param nombresGenerados
	 *            arreglo con los nombres generados
	 */
        
        
	public static void generarDatos(String[] nombresGenerados) {
           
            try {   
                int sem, edad = 0, mat, num;
                BufferedReader br, br2;
                                
                FileReader fr = new FileReader("CPdescarga.txt");               
                br = new BufferedReader(fr);
                String linea = br.readLine();
                 

                FileWriter fw2 = new FileWriter("Registros.csv");
                PrintWriter salida = new PrintWriter(fw2);
                
                salida.print("Nombre,Direccion,Semestre,Edad,Matricula\n");                
                
                for (String nombresGenerado : nombresGenerados) {
                    sem = (int) (Math.random() * (10-2+1)+2);
                    switch(sem){
                        case 2: edad = (int) (Math.random() * (23-18+1)+18);
                        case 3: edad = (int) (Math.random() * (23-19+1)+19);
                        case 4: edad = (int) (Math.random() * (24-19+1)+19);
                        case 5: edad = (int) (Math.random() * (25-20+1)+20);
                        case 6: edad = (int) (Math.random() * (25-20+1)+20);
                        case 7: edad = (int) (Math.random() * (26-21+1)+21);
                        case 8: edad = (int) (Math.random() * (26-21+1)+21);
                        case 9: edad = (int) (Math.random() * (26-22+1)+22);
                        case 10: edad = (int) (Math.random() * (27-22+1)+22);
                    }
                                            
                
                    mat = (int) (Math.random() * (498765432-301234567+1)+301234567);
                    
                    salida.println(nombresGenerado+","+linea+","+sem+","+edad+","+mat);
                    linea = br.readLine();                    
                }
                
                
                br.close();
                salida.close();    
                
            
            } catch (IOException ex) {
                System.out.println(ex.getCause());
            }
	}        
        
        public static void registrosAcademicos(){
        
        int num;
        num = (int) (Math.random() * (46-5+1)+5);
        
            try { 
                               
                FileWriter fw = new FileWriter("materias.txt");
                PrintWriter salida2 = new PrintWriter(fw);
                            
                switch (num){
                    case 1: salida2.println("Asignaturas optativas de campo de profundización"); 
                    case 2: salida2.println("Asignaturas optativas de campo de profundización");
                    case 3: salida2.println("Asignaturas optativas de campo de profundización");
                    case 4: salida2.println("Recursos y necesidades de México");
                    case 5: salida2.println("Optativa de campo de profundización");
                    case 6: salida2.println("Sistemas distribuidos");
                    case 7: salida2.println("Fundamentos de Systemas embebidos");
                    case 8: salida2.println("Organización y arquitectura de computadoras");
                    case 9: salida2.println("Redes de datos seguras");
                    case 10: salida2.println("Ética profesional");
                    case 11: salida2.println("Computación gráfica e interacción humano-computadora");
                    case 12: salida2.println("Microcomputadoras");
                    case 13: salida2.println("Optativa(s) de ciencias sociales y humanidades");
                    case 14: salida2.println("Introducción a la economía");
                    case 15: salida2.println("Sistemas de comunicaciones");
                    case 16: salida2.println("Compiladores");
                    case 17: salida2.println("Inteligencia artificial");
                    case 18: salida2.println("Diseño digital VLSI");
                    case 19: salida2.println("Finanzas en la ingeniería en computación");
                    case 20: salida2.println("Administración de proyectos de software");
                    case 21: salida2.println("Circuitos electrónicos");
                    case 22: salida2.println("Bases de datos");
                    case 23: salida2.println("Diseño digital moderno");
                    case 24: salida2.println("Systemas operativos");
                    case 25: salida2.println("Ingeniería de software");
                    case 26: salida2.println("Señales y Systemas");
                    case 27: salida2.println("Lenguajes formales y autómatas");
                    case 28: salida2.println("Dispositivos electrónicos");
                    case 29: salida2.println("Estructura y programación de computadoras");
                    case 30: salida2.println("Estructuras discretas");
                    case 31: salida2.println("Matemáticas avanzadas");
                    case 32: salida2.println("Análisis numérico");
                    case 33: salida2.println("Electricidad y magnetismo");
                    case 34: salida2.println("Fundamentos de estadística");
                    case 35: salida2.println("Programación orientada a objetos");
                    case 36: salida2.println("Estructura de datos y algoritmos II");
                    case 37: salida2.println("Cultura y comunicación");
                    case 38: salida2.println("Ecuaciones diferenciales");
                    case 39: salida2.println("Cálculo vectorial");
                    case 40: salida2.println("Probabilidad");
                    case 41: salida2.println("Estructura de datos y algoritmos I");
                    case 42: salida2.println("Redacción y exposición de temas de ingeniería");
                    case 43: salida2.println("Mecánica");
                    case 44: salida2.println("Cálculo integral");
                    case 45: salida2.println("Álgebra lineal,");
                    case 46: salida2.println("Fsundamentos de programación,");
                    case 47: salida2.println("Fundamentos de física,");
                    case 48: salida2.println("Química,");
                    case 49: salida2.println("Cálculo y geometría analítica,");
                    case 50: salida2.println("Álgebra");            
                    }               
                salida2.close();                           
            } catch (IOException ex) {
                System.out.println(ex.getCause());
            }               
        }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrmPrincipal frm = new FrmPrincipal();
        frm.setVisible(true);
        // TODO code application logic here
        generarDatos(generarNombresAleatorios(500));
        registrosAcademicos();
        Alumno alu = new Alumno("A","S","V","d");
        System.out.println(alu);
    }
    
}
