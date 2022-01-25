
package uf1_y_2;

import java.util.Scanner; class Ej7 {
     public static void ejercicio7() {
            
    String userInput;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca la longitud de lado que quiera que tenga el rectángulo que quiera dibujar\n"
            + "Introduzca '0' para volver al menú.");
    
    while (true){
        
        userInput=sc.next();
        
        if(!Ej5.int_check(userInput)){ /*reutilizo int_check*/
            System.out.println("Por favor asegurese de introducir sólo dígitos.");
            continue;
            }
        
        int numero = Integer.parseInt(userInput);
        
        if (numero == 0){
            break;
            }
        
        dibujar_rectangulo(numero);
        System.out.println("Repita proceso o introduzca '0' para volver al menú.");
        }
    
    }
    public static void dibujar_rectangulo(int n){
        for(int i = 0; i < n; i++){
            for (int j=0;j<n;j++){
                System.out.print("*  ");
                }
            System.out.println();
            }
    }
}
