
package ejemplo21;
import java.util.Scanner;


public class Ejemplo21 {
@SuppressWarnings("unusedAssignment")
    
    public static void main(String[] args) {
        double num1,num2,resultado; //para declarar la variable 
        Scanner sn = new Scanner (System.in);// sn es el nombre del objeto System in ingreso de los datos 
        
        System.out.println("Hola soy tu asistente virtual./n porfavor ingrese un numero"); 
        num1=sn.nextInt(); //sn llamamos al scanner 
        
         System.out.println("ingresa el segundo numero "); 
        num2=sn.nextInt(); //sn llamamos al scanner .
        
        System.out.println("los datos ingresados por el usuario son: "+num1+" y "  +num2);
    }
    
}
