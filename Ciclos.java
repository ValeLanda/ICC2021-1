import java.util.Scanner;

public class Ciclos{
    public static void main(String args[]){

        //EJEMPLO FOR
        /*for(int i=0; i<5; i++){
            System.out.println(i);
        }*/


        //EJEMPLO WHILE
        /*int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }*/

        //EJEMPLO DO WHILE
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        
        int numero = sc.nextInt();
        System.out.println("Número par menor que: " + numero);
        int n;
        do{
            n = (int)(Math.random() * numero);
            System.out.println(n);
        }while(n%2 != 0);
        System.out.println("Y el numero par elegido es: " + n);

    }

}