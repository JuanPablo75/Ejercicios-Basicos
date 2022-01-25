
package uf1_y_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej4 {public static void ejercicio4() {
        while (true){
            System.out.println("Elije un numero y te diré sus divisores entre 1-100.\nIntroduzca 'x' para volver al menú.");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            input = input.toLowerCase();
            if (input.equals("x")){
                break;
                }
            if(digit_check(input) == false){ /*funcion para checkear 'string' según regex*/
                System.out.println("Asegurse de introducir un digito.");
                continue;
                }
            else{
                int INTput = Integer.parseInt(input);
                ArrayList<Integer> divisores = divisiblesrango100(INTput);
                System.out.println("Los divisores de "+INTput+" son: "+divisores);
                }
           
            }
        }
    public static ArrayList<Integer> divisiblesrango100 (int numero){
        
        ArrayList<Integer> divisibles=new ArrayList<>();
        
        for (int i = 1; i<101; i++){
            
            if (i % numero == 0){
                
                divisibles.add(i);
                }
            }
        return (divisibles);
        }
    public static boolean digit_check(String input){
        return input.matches("\\d+");
        }
    
}
