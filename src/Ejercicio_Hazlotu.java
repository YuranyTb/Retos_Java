import java.util.Scanner;

import javax.print.event.PrintJobListener;

public class Ejercicio_Hazlotu {
    public static void main(String[] args) {

        float Nota,Sumadenotas=0, Promedio=0;
        int Cantidad=0;

        System.out.println("Digite la nota obtenida de cada uno de los talleres, recuerde que la calificación es de 1.0 a 5.0");
        
        Scanner leer= new Scanner(System.in);
        for (int i= 0;i<4;i++) {
        Nota=leer.nextFloat();
        Cantidad=Cantidad+1;
        Sumadenotas=Sumadenotas+Nota;
 }
 
 Promedio=Sumadenotas/Cantidad;
 System.out.println("El promedio de la nota es "+Promedio);
 
    if (Promedio>=0 && Promedio<=2.9){
    System.out.println("Reprobaste la asignatura");
    }

    else if (Promedio<=3.9){
    System.out.println("Pasaste raspando la asignatura");
    }

    else if (Promedio<=5.0){
    System.out.println("Aprobaste con buenos resultados");    
    }

    else{
    System.out.println("El valor ingresado no es valido");    
    }

    leer.close();

 }
 
}
    
        

        