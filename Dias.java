/**
 * Clase para ejemplificar switch
 */

import java.util.Scanner;

public class Dias{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número del 1-7");
        int dia = sc.nextInt();

        switch(dia){
            case 1: 
            System.out.println("Hoy es Lunes");
            break;

            case 2:
            System.out.println("Hoy es Martes");
            break;
            
            case 3:
            System.out.println("Hoy es Miércoles");
            break;

            case 4:
            System.out.println("Hoy es Jueves");
            break;

            case 5:
            System.out.println("Hoy es Viernes");
            break;

            case 6:
            System.out.println("Hoy es Sábado");
            break;

            case 7:
            System.out.println("Hoy es Domingo");
            break;
        }
    }
}