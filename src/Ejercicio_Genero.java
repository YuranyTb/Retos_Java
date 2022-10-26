import java.util.Scanner;

public class Ejercicio_Genero {
    public static void main(String[] args) {

        int g=0;

        int Totalregistrados;
        int Subtotalf=0;
        int Subtotalm=0;

        Scanner leer= new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
        
        System.out.println("Menu opciones \n 1.Femenino \n 2.Masculino");
        g=leer.nextInt();

        if (g==1){
            Subtotalf=Subtotalf+1;
            System.out.println("La cantidad de personas, con genero Femenino son" +Subtotalf);
        }    
            
        else if (g==2){
            Subtotalm=Subtotalm+1;
            System.out.println("La cantidad de personas, con genero Masculino son" +Subtotalm);
        }
         
        else {
            System.out.println("Datos erroneos");
    
        }
    
        Totalregistrados=Subtotalm+Subtotalf;
        System.out.println("La cantidad de datos registrados son " +Totalregistrados+ " La cantidad de mujeres son " +Subtotalf+ " y la cantidad de hombres son " +Subtotalm);

        }


    }


}

