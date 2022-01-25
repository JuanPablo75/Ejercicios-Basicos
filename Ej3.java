
package uf1_y_2;

import java.util.Scanner;


public class Ej3 {public static void ejercicio3() {
        System.out.println("Introduzca un valor para un radio y te daré el valor del área del círculo con ese radio."
                + "\nIntroduzca 'x' para volver al menú.");
        while (true){

            Scanner input = new Scanner(System.in);
            
            var r = input.next();
            
            if (r.equalsIgnoreCase("x")){
                break;}
            
            if (!r.matches("\\d+")&& !r.matches("\\d+\\.\\d+"))/*me aseguro que introduce un digito o un digito con decimales.matches devuelve boolean de la regex introducida*/{
                System.out.println("Error: Introduzca un valor numérico para el radio.");
                        continue;}
            
            double radio=Double.parseDouble(r);
            double area=area_circulo(radio);
            System.out.println("El área del circulo con radio de "+radio+"cm es: "+ area+ " cm\u00b2");/*regex para superindice*/
            System.out.println("Introduzca otro Radio o 'x' para volver al menú.");
            }
        }
    public static double area_circulo(double radio1){
        double area = Math.PI * Math.pow(radio1, 2);
        area=(double)Math.round(area*100d)/100d;/*redondeo a 2 decimales*/
        return area;
        }
    
}
