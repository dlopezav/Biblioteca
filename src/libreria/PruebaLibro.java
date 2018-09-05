/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 *
 * @author Estudiante
 */
public class PruebaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Relacion de Dependencia
        ConjuntoLibro biblioteca = new ConjuntoLibro(10);
        //Dependencia
        Autor autor = new Autor("Carlos","Macias");
        Libro libro = new Libro("Cien", 234, (float) 8.5);
        Libro libro1 = new Libro("Dos", 234, (float) 9.7);
        Libro libro2 = new Libro("Tres", 234, 6);
        Libro libro3 = new Libro("Cuatro", 234, (float) 5.4);
        Libro libro4 = new Libro("Cinco", 234, (float) 8.7);
        biblioteca.añadirLibro(libro);
        
    }
    
}
