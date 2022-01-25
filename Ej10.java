
package uf1_y_2;

import java.util.Scanner;

public class Ej10 {
     public static void ejercicio10() { 
        
        System.out.println("Introduce un radio para las semicircunferencias de un estadio "
                    + "\ny te daré el área del estadio.\nIntroduzca 'x' para volver al menú.");
        
        while (true){
           
            Scanner sc = new Scanner(System.in);
            
            var input = sc.next();
       
            if (input.equalsIgnoreCase("x")){
                break;
                }
            
            if (!input.matches("\\d+") && !input.matches("\\d+\\.\\d+")){
                
                System.out.println("Por favor asegurate de introducir sólo dígitos.");
                continue;
                }
            
            double radio = Double.parseDouble(input);
            
            double area = area_estadio(radio);
            
            area=(double)Math.round(area*100)/100;
            
            System.out.println("El area de tu estadio es: "+ area + " m" + "\u00B2");/*regex para superindice 2*/
            
            System.out.println("Repita operación o introduzca 'x' para volver al menú.");
            }
        }
    public static double area_circulo(double radio){
        double area_circulo = Math.pow(radio,2)*Math.PI;
        /*area=(double)Math.round(area*100)/100;*/
        return area_circulo;
        }
    public static double area_cuadrado(double lado){
        double area_cuadrado = Math.pow(lado,2);
        /*area=(double)Math.round(area*100)/100;*/
        return area_cuadrado;
        }
    public static double area_estadio(double radio){
        double area_estadio = area_circulo(radio)+area_cuadrado(radio*2);
        return area_estadio;
        }
}
