
package uf1_y_2;

import java.util.Scanner;

public class Ej9 {
     public static void ejercicio9() {
        
        while (true){
        
        System.out.println("Escribe una frase y contaré sus vocales.\nIntroduce 'x' para volver al menú.");
        
        Scanner input=new Scanner(System.in);
        
        String frase=input.nextLine();
        frase = frase.toLowerCase();
        
        if (frase.equals("x")){
            break;
            }
        int vocales = contador_vocales(frase);
        
        System.out.println("Tu frase tiene un total de "+vocales+" vocales");
            }
        }
        public static int contador_vocales(String texto){
            
            int contadorVocales = 0;
       
            for (int i=0;i<texto.length();i++){
                
                if(texto.charAt(i)== 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u'){
                    
                    contadorVocales += 1;
                    }
                }
            return contadorVocales;
            }
}
