package adivinanumero;

import java.util.Scanner;


public class AdivinaNumero {

    
    public static void main(String[] args) {
       
        int aleatorio=(int)(Math.random()*100);
        
        Scanner entrada=new Scanner(System.in);
        
        int numero=0;
        
        int intentos=0;
        
        while(numero!=aleatorio){
            System.out.println("Introduce un nuemero, por favor");
            
            numero=entrada.nextInt();
                        
            if (aleatorio<numero) {
                System.out.println("Mas bajo");
                                
            }
            else if (aleatorio>numero) {
                System.out.println("Mas alto");
                
            }
                   
        }
        
        System.out.println("correcto");
        
    }
    
}
