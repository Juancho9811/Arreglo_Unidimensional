/*
Semana - Tarea 5: Arreglo Unidimensional
El programa consiste:
Digitar 'n' numeros de elementos para un arreglo, que sea desordenado
el programa debe ordenarlo gracias al metodo burbuja.
*/
package Arreglo_Unidimensional;

import java.util.Scanner;

public class Arreglo {
    
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        int num_Elementos;
        
        System.out.print(" Digite el numero de elementos: ");
        num_Elementos = Entrada.nextInt();
        while( num_Elementos < 0 ){
            System.out.println(" -------------------------------------------- ");
            System.out.println(" EL NUMERO DE ELEMENTOS NO PUEDE SER NEGATIVA ");
            System.out.println(" -------------------------------------------- ");
            
            System.out.print( "\n Digite de nuevo el numero de elementos: " );
            num_Elementos = Entrada.nextInt();
        }
        
        int[] arreglo = new int[num_Elementos];
        
        System.out.println( "\t\n Pidiendo Datos del Arreglo " );
        
        for( int i = 0; i < num_Elementos; i++ ){
            System.out.print( " Digite un numero en la posicion [ " + i + " ]: " );
            arreglo[i] = Entrada.nextInt();
        }
        
        System.out.println( "\t\n Mostrando arreglo Desordenado " );
        
        for( int i = 0; i < num_Elementos; i++  ){
            System.out.print( " [ "+ arreglo[i] + "] " );
        }
        
        System.out.println( " " );
        
        int aux;
        
        for( int i = 0; i < (num_Elementos - 1); i++){
            for( int j = 0; j < (num_Elementos - 1); j++ ){
                if( arreglo[j] > arreglo[j+1] ){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        
        System.out.println( "\t\n Mostrando arreglo Ordenado por el Metodo Burbuja " );
        
        for( int i = 0; i < num_Elementos; i++  ){
            System.out.print( " [ "+ arreglo[i] + "] " );
        }
        
        System.out.println( " " );
    }
}