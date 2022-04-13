/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Main;

import java.util.InputMismatchException;
import java.util.Scanner;
import jdk.nashorn.internal.ir.TryNode;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class Principal {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numAleatorio = (int) (Math.random() * 500) + 1;
        boolean ban = false;
        int num = 0, cont = 0;
        System.out.println("NA: " + numAleatorio);

        try {
            do {
                num = 0;
                System.out.println("Ingrese un numero");
                num = read.nextInt();
                if (num > numAleatorio && num!=numAleatorio) {
                    System.out.println("EL NUMERO A BUSCAR ES MENOR AL INGRESADO ");
                } else if(num < numAleatorio && num!=numAleatorio) {
                    System.out.println("EL NUMERO A BUSCAR ES MAYOR AL INGRESADO ");
                }
                cont++;
            } while (num != numAleatorio);

        } catch (Exception e) {
            ban=true;
            cont++;
            System.out.println(e);
            System.out.println("ERROR: El dato ingresado no es un numero");
        } 
        if(!ban){System.out.println("ADIVINO!!!, EL NUMERO ES: " + numAleatorio);}
        System.out.println("CANTIDAD DE INTENTOS: "+cont);
    }

}
