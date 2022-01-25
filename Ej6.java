
package uf1_y_2;

import java.util.Scanner;

public class Ej6 { public static void ejercicio6(){
        
    int Pares = 0;/*inicio contador*/
    
    String userInput;

    Scanner sc = new Scanner(System.in);    
    
    System.out.println("Introduce un número y te diré si es par o impar." +
                               "\nIntroduzca 0 para saber total de pares introducidos y volver al menú.");
    while (true) {
            
        userInput = sc.next();
        if (Ej5.int_check(userInput)==false) { /*reutilizo el int_check()*/
             
            System.out.println("No ha introducido dígitos.\nPor favor introduzca sólo dígitos.\nIntroduzca '0' para volver al menú.");
            continue;
            }

        int numero = Integer.parseInt(userInput);/*paso a int para poder operar*/

        if (numero == 0) {
            System.out.println("El total números pares ha sido: " + Pares);
            break;
            }
        else if (es_par(numero)){
                System.out.println(numero+" Es par.");
                Pares+=1; /*aumento contador en 1 si es par*/
            } 
        else {
                System.out.println(numero+" Es impar.");
            }
        System.out.println("Introduzca otro número o '0' para terminar y volver al menú.");
        }
    }
    public static boolean es_par(int numero){
        return numero % 2 == 0;
    }
    
}
