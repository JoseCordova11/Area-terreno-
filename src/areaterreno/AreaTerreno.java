/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaterreno;
import java.util.Scanner;
/**
 *
 * @author ASUS GAMER
 */
public class AreaTerreno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Declaracion e iniciación de variables
        
        double lr, at, A, B, area;
        lr = 0; at = 0; A = 0; B = 0; area = 0;
        
        System.out.println("Programa que permite calcular el area");
        
        //Lectura de datos
        
        System.out.println("Ingrese el largo del rectangulo");
        lr = leer.nextDouble();
        
        System.out.println("Ingrese la altura del triangulo");
        at = leer.nextDouble();
        
        //Proceso 
        A = (lr * at);
        B = (lr * at)/2;
        area = A + B;
        
        //Salida de datos
        System.out.println("El área del terreno es:" +area+
                "Un rectangulo de largo" +lr+ 
                "Y un triangulo de altura" +at);
        
        
        
        
    }
    
}
