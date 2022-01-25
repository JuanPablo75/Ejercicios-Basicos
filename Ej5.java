
package uf1_y_2;

import java.util.Scanner;
public class Ej5 {
    public static void ejercicio5() {
        
        while (true){
            
            System.out.println("Introduzca un numero del 0 al 10 y te daré su tabla de multiplicar.\nIntroduzca 'x' para volver al menú.");
            
            Scanner sc = new Scanner (System.in);
            
            var input = sc.next()  ;
            
            if (input.equalsIgnoreCase("x")){
            break;
                }
            
            if (!int_check(input)){
                System.out.println("Error, no ha introducido un dígito.");
                continue;
                }
            
            int input_numero = Integer.parseInt(input);
            
            if (input_numero<0 || input_numero > 10){
                System.out.println("Numero fuera de rango.");
                continue;
                }
            tabla(input_numero);
                }
            
            }
        
    public static void tabla(int numero){
        
        for(int i=0; i<=10; i++){
            System.out.println(numero + "x" + i + "=" + numero * i);
            }

        }
    public static boolean int_check(String numero){
        return numero.matches("\\d+");
    }
    
    
}
