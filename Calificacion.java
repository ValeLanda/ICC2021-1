import java.util.Scanner;

public class Calificacion{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Hola Alumno! Escribe tu calificación de la materia ICC: ");
        double calificacion = sc.nextDouble();

        if(calificacion >= 6.0){
            System.out.println("Felicidades, estás aprobado");
        }else{
            System.out.println("Estás reprobado, tendrás que repetir la materia. :(");
        }

    }
}