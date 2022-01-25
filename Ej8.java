
package uf1_y_2;

import java.util.Scanner;

public class Ej8 {
    public static void ejercicio8() {
        
        System.out.println("Introduzca 5 numeros y te los invertiré.\nIntroduzca 'x' para volver al menú.");
        Scanner sc = new Scanner(System.in);
        
        
        while(true){
            
            String input= sc.nextLine();
            
            if (input.equals("x")){
                break;
                }
            if(!digit_check(input)){
                System.out.println("Introduzca solo digitos por favor");
                continue;
                }
           
            String[] list_input=input.split(" ");
            
            if(!max_length_5(list_input)){
                System.out.println("Introduzca exactamente 5 digitos.");
                continue;
                }
            invertir_string(list_input);
            
            System.out.println("Repita proceso o introduzca 'x' para volver al menú.");
            }
        
    }
    public static void invertir_string(String[] frase){
        
        for ( int i=frase.length-1;i>=0;i--){
            if(i==0){
                System.out.print(frase[i]+"\n");
                }
            else{
            System.out.print(frase[i]+" ");
                }
            }
        
        }
    public static boolean digit_check(String string){
        return string.matches("^(?:-?\\d+ )*(?:-?\\d+)+$");
        }
    public static boolean max_length_5(String[] frase){
        int size = frase.length;
        return size == 5;
        }
}
