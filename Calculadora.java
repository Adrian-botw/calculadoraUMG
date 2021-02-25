
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in); 
        int opcion;
        float no1, no2;
        float resultado;
        Scanner cont = new Scanner(System.in);
        String conf=null;
       
        
        do{
            System.out.println("Seleccione una opcion: ");
            System.out.println("1- si desea sumar ");
            System.out.println("2- si desea restar ");
            System.out.println("3- si desea multiplicar ");
            System.out.println("4- si desea dividir ");
            System.out.println("Escriba su opcion");
            opcion= entrada.nextInt();
           
        switch (opcion){
            case 1:
            System.out.println("A elegido suma ");
            System.out.println("Ingrese un numero ");
            no1= entrada.nextFloat();
             System.out.println("Ingrese otro numero ");
            no2= entrada.nextFloat();
            
            resultado= no1 + no2;
             System.out.println("El resultado de la suma es: "+resultado);
            break;
            case 2:
            System.out.println("A elegido resta ");
            System.out.println("Ingrese un numero ");
            no1= entrada.nextFloat();
             System.out.println("Ingrese otro numero ");
            no2= entrada.nextFloat();
            
            resultado= no1 - no2;
             System.out.println("El resultado de la resta es: "+resultado);
            break;
            
            case 3:
            System.out.println("A elegido multiplicacion ");
            System.out.println("Ingrese un numero ");
            no1= entrada.nextFloat();
             System.out.println("Ingrese otro numero ");
            no2= entrada.nextFloat();
            
            resultado= no1 * no2;
             System.out.println("El resultado de la multiplicacion es: "+resultado);
            break;
            
            case 4:
            System.out.println("A elegido dividir ");
            System.out.println("Ingrese un numero ");
            no1= entrada.nextFloat();
             System.out.println("Ingrese otro numero ");
            no2= entrada.nextFloat();
            
            resultado= no1 / no2;
             System.out.println("El resultado de la division es: "+resultado);
            break;
            
            
            default:
                
            System.out.println("ingreso de datos incorrecto ");
            break;
            
            
            
        }
     
        
            System.out.println("Desea continuar  S/N");
            conf= entrada.nextLine();
            
        }while (conf.equals("s") || conf.equals("S"));
                
    }
}
