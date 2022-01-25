
package uf1_y_2;

import java.util.Scanner;

public class UF1_y_2 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println("Menú Principal.");
            System.out.println("Introduzca:\n1 - Ejercicio 1\n2 - Ejercicio 2\n3 - Ejercicio 3"
                    + "\n4 - Ejercicio 4\n5 - Ejercicio 5\n6 - Ejercicio 6\n7 - Ejercicio 7\n8 - Ejercicio 8"
                    + "\n9 - Ejercicio 9\n10 - Ejercicio 10\n'x' para salir");
            String input=sc.next();
            if (input.equals("x")){
                break;
                }
            switch(input){
                case "1"-> Ej1.ejercicio1();
                case "2"-> Ej2.ejercicio2();
                case "3"-> Ej3.ejercicio3();
                case "4"-> Ej4.ejercicio4();
                case "5"-> Ej5.ejercicio5();
                case "6"-> Ej6.ejercicio6();
                case "7"-> Ej7.ejercicio7();
                case "8"-> Ej8.ejercicio8();
                case "9"-> Ej9.ejercicio9();
                case "10"-> Ej10.ejercicio10();
                default->System.out.println("Sólo hay 10 ejercicios, asegúrate de introducir un número de 1 al 10.\nIntroduzca 'x' para Salir.");
            }
        
        }
        
    
    }
    
}
