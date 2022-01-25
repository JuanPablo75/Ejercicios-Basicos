
package uf1_y_2;

import java.util.Scanner;

public class Ej1 {
    public static void ejercicio1(){
    System.out.println("Dame una calificación entre 0 y 100.\nIntroduzca 'x' para volver al menú.");
    
        while (true){
            
            Scanner inpt = new Scanner(System.in)  ;
        
            var input = inpt.next();
        
            if (input.equalsIgnoreCase("x")){
                break;
            }
            if (!input.matches("\\d+")){/*me aseugro que introduce un digito*/
                System.out.println("Por favor introduzca una calificacion entre 0 y 100.\nIntroduzca 'x' para salir.");
                continue;
            }
            int nota = Integer.parseInt(input);/*paso a int el input al ser una string para operar*/
            
            if (nota < 0 || nota > 100){
                System.out.println("Por favor introduzca una calificacion entre 0 y 100.\nIntroduzca 'x' para salir.");
                continue;
            }
            numero_a_nota(nota);
            System.out.println("Repita proceso o introduzca 'x' para volver al menú.");
        }
    }
    public static void numero_a_nota(int nota ){
        
        if (nota < 50){
            System.out.println("La calificacion para un "+nota+" es: Insuficiente");
        }
        else if (nota <60){
            System.out.println("La calificacion para un "+nota+" es: Suficiente");
        }
        else if (nota < 70){
            System.out.println("La calificacion para un "+nota+" es: Bien");
        }
        else if (nota < 90){
            System.out.println("La calificacion para un "+nota+" es: notable");
        }
        else {
            System.out.println("La calificacion para un "+nota+" es: Sobresaliente");
        }
        
    }
}
