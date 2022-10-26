import java.util.Scanner;

public class Ejercicio_Usuario {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);

        int edad;
        System.out.println("Ingrese su edad");
        edad=leer.nextInt();

        if(edad>=18){
            //Lo que pasa si la condicón se cumple
            System.out.println("Bienvenido, siga trae plata, cerveza a 3000");

        }
        
        else{
            //Lo que pasa si la condición no se cumple
            System.out.println("Para su casa a lavar los platos, procede a tirarle un chanclazo");

        }

    }
}
