/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package ejercicioaprendizaje7;

import java.util.Scanner;

public class EjercicioAprendizaje7 {
    public static void main(String[] args) {
        String frase, palabra;
        
        palabra = "eureka";
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa una frase: ");
        frase = entrada.nextLine();
        
        if(frase.equals(palabra)){ //palabra es una variable, pero tambien se puede poner dentro de esos parentesis la palabra "eureka" sin necesidad de crear variable.
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
