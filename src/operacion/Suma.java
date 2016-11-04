/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

import java.util.Scanner;

/**
 *
 * @author alber_000
 */
public class Suma {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        int numero1 = 0;
        int numero2 = 0;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println ("Escriba el primero numero: ");
        numero1 = teclado.nextInt();

        System.out.println ("Escriba el segundo numero: ");
        numero2 = teclado.nextInt();
        
        Suma s = new Suma();
        System.out.println("La Suma es Igual a: "+s.suma(numero1, numero2)+"");

    }

    public int suma(int numero1, int numero2){
       
        int resultado = numero1 + numero2;
        return resultado;
        
    }
    
}


