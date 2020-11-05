import java.util.Scanner;

public class MayorValor{
    public static void main(String[] args){

        Dado miDado = new Dado();

        Scanner sc = new Scanner(System.in);
        int mayor;
        int valor1, valor2, valor3;  //valor del dado en cada tirada
        String nombre1, nombre2, nombre3;  //Nombre de los jugadores
         
        //Se pide el nombre de cada jugador
        System.out.println("Dame el nombre del primer jugador");
        nombre1 = sc.nextLine();
        System.out.println("Dame el nombre del segundo jugador");
        nombre2 = sc.nextLine();
        System.out.println("Dame el nombre del tercer jugador");
        nombre3 = sc.next();

        //Cada jugador lanza el dado
        valor1 = miDado.lanzar();
        valor2 = miDado.lanzar();
        valor3 = miDado.lanzar();

        //Avisa el valor que cayó  cada jugador
        System.out.println("\n ***********Resultados***********");
        System.out.println(nombre1 + " tienes un " + valor1);
        System.out.println(nombre2 + " tienes un " + valor2);
        System.out.println(nombre3 + " tienes un " + valor3);

        //Determina el valor mayor
        /*if(valor1 > valor2){
            mayor = valor1;
        } else{
            mayor = valor2;
        }/////////
        if(valor3 > mayor){
            mayor = valor3;
        }*/

        //Otra forma de implementar el if()else 
        /*if(valor1 > valor2 && valor1 > valor3){
            mayor = valor1;
        }else if(valor2 > valor1 && valor2 > valor3){
            mayor = valor2;
        }else{
            mayor = valor3;
        }*/
    

        //Otra forma de implementar el if()else 
        if(valor1 > valor2 && valor1 > valor3){
            mayor = valor1;
        }else{
            if(valor2 > valor1 && valor2 > valor3){
                mayor = valor2;
            }else{
                mayor = valor3;
            }
        }
        

        //Avisa cual es el valor mayor
        System.out.println("\n el mayor valor es " + mayor);

    }
}