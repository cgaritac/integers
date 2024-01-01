package ejercicio1enteros;

import java.util.Scanner;

public class Ejercicio1Enteros {
    
    static int [] numEnteros = new int [5];
    
    public static void main(String[] args) {
        
        int mayor = 0;
        int menor = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for(int cont = 0; cont < numEnteros.length; cont++){
            System.out.printf("Ingrese el número entero de la posición %d: \n",cont+1);
            numEnteros[cont] = sc.nextInt();            
        }    
        
        for(int cont = 0; cont <= (numEnteros.length-2); cont++){
            if (numEnteros[cont] < numEnteros[cont+1]){
                mayor = cont+1;
            }                       
        }
        
        System.out.printf("El número mayor es: %d\n",numEnteros[mayor]);
        
        for (int cont = (numEnteros.length-1); cont >= 1; cont--){
            if (numEnteros[cont] > numEnteros[cont-1]){
                menor = cont-1;
            }  
        }
        
        System.out.printf("El número mayor es: %d\n",numEnteros[menor]); 
    }    
}

