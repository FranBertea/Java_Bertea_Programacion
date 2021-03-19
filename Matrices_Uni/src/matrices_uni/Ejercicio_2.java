/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices_uni;

import java.util.Scanner;
/**
 *
 * @author pc06
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        int num = 5;
        int i;
        int[] numeros=new int [num];
        
        System.out.println("Ingrese 5 numeros: ");
        for (i=0;i<num;i++){
          numeros [i]=teclado.nextInt();
        }
         System.out.println("Los 5 numeros son: "); 
        for (i=num-1;i>=0;i--){   
         System.out.println(numeros[i]);
       
        }
    }
    
}
