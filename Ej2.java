/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf1_y_2;

import java.util.Scanner;

/**
 *
 * @author Juan Pablo
 */
public class Ej2 { public static void ejercicio2() {
        
        Scanner sc = new Scanner (System.in);
        String calificacion ;
        System.out.println("Introduzca una calificacion entre: 'Insuficiente', 'Suficiente',"
            + "'Bien','Notable','Sobresaliente'.\nIntroduzca 'x' para volver al menú.");
        while(true){
        
            calificacion = sc.nextLine();
            calificacion= calificacion.toLowerCase();
        
            if (calificacion.equals("x")){
                break;
            }
            else{
                calificacion_a_numero(calificacion);
                System.out.println("Introduzca otra calificación o 'x' para volver al menú.");
            }
        }
    
    }
    public static void calificacion_a_numero(String calificacion){
        switch(calificacion){
                case "insuficiente" -> System.out.println("La nota para "+calificacion+" es: menor a 50.");
                case "suficiente" -> System.out.println("La nota para "+calificacion+" es: entre 50 y 59");
                case "bien" -> System.out.println("La nota para "+calificacion+" es: entre 60 y 69");
                case "notable" -> System.out.println("La nota para "+calificacion+" es: entre 70 y 90");
                case "sobresaliente" -> System.out.println("La nota para "+calificacion+" es: entre 90 y 100");
                default -> System.out.println("Error en la calificación.\nIntroduzca una calificaciÓn entre: 'Insuficiente', 'Suficiente',"
                    + "'Bien','Notable','Sobresaliente'.\nIntroduzca 'x' para volver al menú.");
            }
    }
    
    
}
